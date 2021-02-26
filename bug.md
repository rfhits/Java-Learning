# Bug

记录犯过的错

## 版本一致问题

错误：A JNI error has occurred, please check your installation and try again

原因：java -verion 和 javac -version 不一致

解决方法：重新设置自己的path

[参考链接](https://blog.csdn.net/zhaofen_7/article/details/90273128)

## Package Name

包的名字不能包含“-”，即dash，我们通常叫“杠”。

直接在包含“-”的文件夹下用vscode自带的Java扩展运行，会报错。

## 思维性问题

### flag放在for外面

遍历一个可迭代对象，对其中的元素进行分析时，设置了flag，那么一定要保证判断下一个元素时，flag被刷新回初始值。

## NullPointer

### 调用新建数组对象

```
public static void main(String[] args) {
        StrList[] arr = new StrList[3];
        arr[0].add("hello");  // arr[0]是一个null
    }

    static class StrList {
        private ArrayList<String> strList = new ArrayList<String>();

        public void add(String s) {
            strList.add(s);
        }
    }
```

因为新建了这个数组，里面的初始值都是`null`，`null`是没法调用任何方法的。

一个修改方法是`new`上对象，在堆中为数组中元素分配内存，从而避免指向`null`，代码如下：

```
public static void main(String[] args) {
    StrList[] arr = new StrList[3];
    arr[0].add("hello"); // Arr[0]是一个null
    for (int i = 0; i < arr.length; i++) {
        arr[i] = new StrList(); // 修改指针，指向对象
    }
}

static class StrList {
    private ArrayList<String> strList = new ArrayList<String>();

    public void add(String s) {
        strList.add(s);
    }
}
```

### 只声明成员变量

比如在一个类里面，有一个成员变量是`ArrayList`，如果声明像下面这样：

```
static class StrList {
    private ArrayList<String> strList; // null

    public void add(String s) {
        strList.add(s);
    }
}
```

`strList`也是个`null`，正确的方法应当是为其`new`一块堆内存。代码如下：

```
static class StrList {
    private ArrayList<String> strList = new ArrayList<String>();

    public void add(String s) {
        strList.add(s);
    }
}
```

## BigDecimal使用

做了加减乘除，`BigDecimal`的值还是0

```
public class DecimalAdd {
    public static void main(String[] args) {
    BigDecimal a = new BigDecima1("0");
    BigDecimal b = new BigDecima1("9.02") ;
    a.add(b) ;
    System. out . println(a);
}
```

这就好像Python中的`print(list.reverse())`一样，只是返回了一个翻转的`list`，而本身的`list`没有变，所以要接受返回值，代码如下：

```
public class DecimalAdd {
    public static void main(String[] args) {
    BigDecimal a = new BigDecima1("0");
    BigDecimal b = new BigDecima1("9.02") ;
    a = a.add(b) ;
    System. out . println(a);
}
```

详见[此](https://blog.csdn.net/baidu_37107022/article/details/78632316)。
