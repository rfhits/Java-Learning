# Java on VSCode

首先呢，我的课程组推荐是用idea写Java，不过呢，用vscode好久了，反正也是写一些小程序玩，先用vscode顶着。

## JDK

这个自行百度教程吧，具体就是安装个JDK，设置下path就好了。

在cmd里输个java有反应就行

## 安装插件

要安装的插件，可以见Bilibili上的这篇[教程](https://www.bilibili.com/video/BV18z4y1X7Yf)

就是个pack以及剩下的5个，装多了好像也不碍事（摊手。

![要安装的扩展](/img/要安装的扩展.jpg)

## 写Java

同样地，还是见[Bilibili的这篇教程](https://www.bilibili.com/video/BV18z4y1X7Yf)，既可以写项目，也可以随手新建个java文件，写个hello world。

## 自定义代码段

可以见这篇[教程](https://www.cnblogs.com/dotnetcrazy/p/9950431.html)，就是`Ctrl`+`Shift`+`P`调出命令面板，然后搜`snippet`，

因为曾经用过idea，深受`psvm`的影响，哈哈。

分享下自己的自定义代码段：

```none
"println": {
	"prefix": "println",
	"body": [
		"System.out.println(${1:\"Hello World\"});",
	],
	"description": "System.out.println"
},
"psvm": {
	"prefix": "psvm",
	"body": [
		"public static void main(String[] args) {",
		"    ${1}",
		"}"
	],
	"description": "public static void main"
},
```

## 代码风格

安装一个叫做`CheckStyle for Java`的扩展，在扩展的详细描述里的Gif有教咋用。

## 生成getter和setter方法

可以见这篇[文章](https://blog.csdn.net/qq_41106844/article/details/106303295)。
