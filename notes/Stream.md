# Stream

简化了for循环

流的操作分为中间操作符和终止操作符。

接下来以一个`List<String>`为例讲解

```
List<String> strings = Arrays.asList("abc", "abc", "bcd", "cde", "efg");
```

## 创建流

串行和并行创建流，分别是`strings.stream()`和`strings.parallelStream()`，一般直接使用串行。

```
Stream stringStream = strings.stream();
```

## 中间操作符

### filter()

```
Stream filteredStream = strings.stream().filter(str-> str.contains("b"));
```

包含字符"b"的元素被流了下来

### map()

映射，对流中所有元素做统一处理，比如所有字符串加前缀buaa

```
List<String> mapped = 
        strings.stream().map(str -> str + "buaa").collect(Collectors.toList());
System.out.println(mapped);
```

### flatmap()

将流中每个元素映射到一个流，然后在把这些流“拍”成一个流。

```
List<Character> charList =
                strings.stream().flatMap(str -> str2charStream(str)).collect(Collectors.toList());
System.out.println(charList);

public static Stream<Character> str2charStream(String str) {
    List<Character> characterLsit = new ArrayList<>();
    for (Character character : str.toCharArray()) {
        characterLsit.add(character);
    }
    return characterLsit.stream();
}
```

输出结果为：`[a, b, c, a, b, c, b, c, d, c, d, e, e, f, g]`

### sorted()


### distinct()

distinct()依据的是equals()去重

```
Stream distinsctedStream = strings.stream().distinct();
```

详见[此](https://blog.csdn.net/D_A_I_H_A_O/article/details/113185516)。

### limit()

limit(long maxsize);

就是要拿几个元素出来，比如按成绩排个序，然后拿前3个出来。

```
Stream limitededStream = strings.stream().limited(the number u want);
```

### skip()

跳过前几个

## 终止操作符

### forEach()

```
strings.stream().forEach(str -> System.out.println(str));
```

### anyMatch()

返回布尔类型

```
Boolean anyMatch = strings.stream().anyMatch(str -> str.contains("de"));
System.out.println(anyMatch); // true
```

类似地有`allMatch()`和`noneMatch()`

### findFirst()

返回流的第一个

返回的是一个Optional()实例
