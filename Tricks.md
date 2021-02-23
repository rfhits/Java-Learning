# Tricks

## 输入

### 连续读入

读入一个整数，再读入一个字符串。

```
int x = sc.nextInt();
Sring s = sc.nextLine();
```

这样，`s`会是换行符，失败。一种可行的操作是，先把一整行都都进来，转成`int`，再读一行。代码如下：

```
String y = sc.nextLine();
int x = Integer.parseInt(y);
String s = sc.nextLine();
```

说到这，就不得不提Python中的`n = int(input())`，直接读一行，转换成`int`，没有这么多事。
