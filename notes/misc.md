# misc

## 类的构造方法

一个类是可以有不同的构造方法的。即构造方法支持方法重载。

## 得到对象所在类的名称

`getClass()`返回的东西挺奇怪，见[此文章](https://zhuanlan.zhihu.com/p/27012082)。

如果要知道这个对象的类叫啥，用`getClass().getName()`，不过这样返回的东西特别长，比如`package1.package2.class`。要只返回类名，用`getClass().getSimpleName()`。

## 继承下的类要有构造方法

这样保证了一个个类继承下来，都能有对应的父类的构造方法。
