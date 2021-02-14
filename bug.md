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
