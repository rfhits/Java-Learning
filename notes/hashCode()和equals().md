# hashCode()和equals()

详见[此](https://www.cnblogs.com/unknows/p/13534953.html)。

## equals()

equals()继承了`==`，而`==`比较的是内存里的地址，所以两个new出来的对象肯定不相等.

```
public boolean equals(Object obj) {
    return (this == obj);
}
```

所以如果不以内存地址为标准来判断两个对象是否相等，就要重写`equals()`方法。

## hashCode()

两个所谓`equals`的对象在存到`hashSet`里应当是重复的，而`hashSet`在存储对象依据的就是`hashCode`，所以在重写`equals()`后，有必要重写`hashCode()`。
