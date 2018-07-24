# JAVA例子：使用记事本编写Java程序

## JAVA 简介

+ 1995年，诞生，sun公司

+ 2009.4.20  ORACLE公司

## JAVA 体系结构

+ 基础核心（标准版本） Java SE 
    + 面向对象
    + API
    + JVM (Java Virtual Machine 即Java虚拟机)
    + ...

+ 企业版 Java EE 
    + JSP
    + EJB
    + 服务
    + ...

+ Java ME 
    + 移动设备
    + 游戏
    + 通信
    + ...

~~~

 源文件                 编译器          字节码文件             解释器
                 --->            --->                   --->                --->  MyProgram 
 myprogram.java         compiler        myProgram.class       interpreter

~~~



## Java环境配置

### windows7 64

+ Step1:安装JDK
    + [下载地址](http://www.oracle.com/technetwork/java/javase/downloads/index.html)

+ Step2:配置环境变量
    + JAVA_HOME      配置JDK安装路径（默认 C:\Program Files\Java\jdk1.7.0_79）
    + PATH           配置JDK命令文件的位置（默认 C:\Program Files\Java\jdk1.7.0_79\bin）
    + CLASSPATH      配置类库文件位置（默认 C:\Program Files\Java\jdk1.7.0_79\lib）

+ Step3:命令行测试
    + 执行命令 java 、javac

## 开发集成环境

### Eclipse（Win7）

### MyEclipse()

## 目录结构

~~~

./
├─ HelloWorld.java
└─ README.md

~~~

+ 演示/使用步骤：
    + step1: 命令行进入该目录，执行 javac HelloWorld.java ,进行编译,会生成 HelloWorld.class字节码文件
    + step2: 再执行 java HelloWorld （注：执行对应的字节码文件，不需要加.class）

## 问题记录

+ 问题1：2018-07-24 16:42:36
    + 描述
    ~~~
    C:\MyWorkSpace\TestSpace\JavaExePrj\Example1>javac HelloWorld.java
    HelloWorld.java:3: 错误: 找不到符号
            System.out.printLn("welcome to the Java!");
                      ^
      符号:   方法 printLn(String)
      位置: 类型为PrintStream的变量 out
    1 个错误
    ~~~
    + 解决/处理
        + System.out.println ("hello world");print后面的是ln的第一个l,不是大写的i,而是L的小写了l
    + 参考资料



+ 问题2：
    + 描述
    + 原因
    + 解决/处理
    + 参考资料