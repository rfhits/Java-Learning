# switch语句

```
switch(expression) {
  case x:
    // code block
    break;
  case y:
    // code block
    break;
  default:
    // code block
}
```

## expression

可以是byte/short/char/int，不能是long

JDK5以后可以是**枚举**

JDK7以后可以是String

如果有人问expression可不可以是String，要回答，JDK7以后可以。

## case

case后面只能是常量；不同的case后面的值不能相同。

## break和default

break不属于code block，可以结束switch，如果没有break，就会按着顺序执行下去，这种情况叫做case穿透。所以，整个switch块的最后一个break可以省略。

default在任何case都不符合的情况下进入。

注意，default不是结束switch的条件，break才是。如何理解？把default移到一堆case的中间去，
