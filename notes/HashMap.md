# HashMap

类似于Python中的dict，存着(key, value)对，一个(key, value)叫做entry

以货币的面额和其对应的口语为例，


| 面额 | 名称 |
| - | - |
| 1分 | penny |
| 5分 | nickel |
| 10分 | dime |
| 25分 | quarter |
| 50分 | half-dollar |

面额就是key，名称就是value。

## 创建HashMap

```
HashMap<Integer, String> coinNames = new HashMap<>();
```

## 使用HashMap

### 存入entry

使用的是HashMap.put(key, value)方法

```
coinNames.put(1, "penny");
coinNames.put(5, "nickel");
coinNames.put(10, "dime");
coinNames.put(25, "quarter");
coinNames.put(50, "damn");
coinNames.put(50, "half-dollar"); // 覆盖前面的值
```

重复地存入会进行覆盖。

### 输出HashMap

```
System.out.println(coinNames);
```

输出如下：

```
{1=penny, 50=half-dollar, 5=nickel, 25=quarter, 10=dime}
```

可以发现输出是无序的

### 获取value

使用HashMap.get(key)方法

```
System.out.println(coinNames.get(10));
```

找不到则返回null

### 判断是否含key

HashMap.containsKey(key)方法

```
Scanner sc = new Scanner(System.in);
int amount = sc.nextInt();
if (coinNames.containsKey(amount)){
    System.out.println(coinNames.get(amount));
} else {
    System.out.println("Not Found");
}
sc.close();
```

### 获取set

HashMap.keySet()返回一个set

### 遍历HashMap

```
for (Integer amount : coinNames.keySet()) {
    System.out.println(coinNames.get(amount));
}
```

可以通过拿到keySet再遍历的方法来逐个访问HashMap中的元素。

### 删除某个元素

应当使用迭代器删除。

```java
Map<String, Integer> map = new HashMap<>();
map.put("a", 1);
map.put("b", 2);
map.put("c", 3);
map.put("d", 4);

Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
Map.Entry<String, Integer> entry;
while (iterator.hasNext()) {
    entry = iterator.next();
    if (entry.getValue() % 2 == 0) {
        iterator.remove();
    }
}
System.out.println(map);
```

使用Hashmap的entrySet生成一个iterator，然后使用iterator遍历hashmap，对符合某种要求的元素进行删除。

记住要导俩包，一个是Map，一个是Iterator。

参考资料：[Java之HashMap迭代删除使用方法小结](https://blog.csdn.net/liuyueyi25/article/details/90679495)
