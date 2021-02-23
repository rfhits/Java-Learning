# Tutorial

## 标识符

注意命名的规则：

包、类、方法、变量、常量

大驼峰、小驼峰、下划线

## 基本框架

```
class demo{
    public static void main(String[] args){
        code blocks;
    }
}
```

## 基本语句

### 运算符

和C语言基本一致。最基本的加减乘除和取余

注意类型自动转换以及整数除以整数还是整数

### 条件语句if

和C语言一致，(){}。

### 循环语句

和C语言一致，初始条件，循环条件，控制条件。

for、while、do...while语句

## 输入输出

### 输出

输出后不换行：`System.out.print();`

输出后自动换行：`System.out.println();`

## 键盘录入数据

分三步，导包，创建键盘录入对象，使用方法。

### 空格分割

注意只能分割空格

```
String s = sc.nextLine();
String[] sArr = s.split(" "); //只分割一个空格
String[] sArr = s.split("\s+"); // 分割多个空格
```

### 字符串转数据

```
int x = Integer.parseInt(String); // 将一个字符串转换成int
double d = Double.parseDouble(String); // 将一个字符串转换成double
```

Long同理：

```
long l = Long.parseLong(String);
```

## 大数

面对超大的整数和小数，我们使用`BigInteger`和`BigDecimal`

### 转换

`int`、`long`、`String`等类型转换成大数，

1. 直接`new BigDecimal(val)`一个是万能的，
2. 调用`valueOf()`，缺点是参数不能是`String`

```
BigDecimal bd = new BigDecimal(double d/long l/int i);
```

### 运算

#### 比较大小:

```
if(bd1.compareTo(bd2) == 1) {
    System.out.println("bd is bigger");
}
```

详见[此博客](https://blog.csdn.net/gaolong123456/article/details/91567890)。

#### 加减乘除：

```
BigDecimal product = bd1.multiply(bd2);
```

详见[此博客](https://www.jianshu.com/p/683b2406342f)。
