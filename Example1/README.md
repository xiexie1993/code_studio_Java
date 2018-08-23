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

### Windows

+ Step1:安装JDK
    + [下载地址](http://www.oracle.com/technetwork/java/javase/downloads/index.html)

+ Step2:配置环境变量
    + 计算机--->属性--->高级系统设置--->高级-->环境变量--->系统变量--->新建（修改）
        + JAVA_HOME      配置JDK安装路径（默认 C:\Program Files\Java\jdk1.7.0_79）
        + PATH           配置JDK命令文件的位置（默认 C:\Program Files\Java\jdk1.7.0_79\bin）或 %JAVA_HOME%\bin;%JAVA_HOME%\jre\bin;
（win7注意原来的Path的变量值末尾有没有;号，如果没有，先输入；号再输入上面的代码）
        + CLASSPATH      配置类库文件位置（默认 C:\Program Files\Java\jdk1.7.0_79\lib） 或 .;%JAVA_HOME%\lib;%JAVA_HOME%\lib\tools.jar

+ Step3:检验是否配置成功
    + 运行cmd 输入 javac 和 java -version （java 和 -version 之间有空格），若 显示版本信息 则说明安装和配置成功。

## 开发集成环境

### Eclipse（Win）

+ 下载并解压缩（注：eclipse是开源 windows软件包是绿色免安装，只是要先配置号java环境）
    + [eclipse下载地址](https://www.eclipse.org/downloads/)

+ 使用
    + Step1： 创建Java项目
    + Step2： 创建程序包
    + Step3： 编写Java源程序
    + Step4： 运行java程序
> 详见 EclipseInsMan.md

### MyEclipse(是在eclipse 基础上加上自己的插件开发而成的功能强大的企业级集成开发环境)

+ 下载并解压缩
    +  + [MyEclipse下载地址]

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



+ 问题2：2018-08-22 20:43:24
    + 描述
    ~~~
    cmd命令行中java报错：找不到或无法加载主类 HelloWorld
    ~~~
    + 原因
    + 解决/处理
    ~~~
       右击桌面上“这台电脑” > “属性” > “高级系统设置” > “环境变量”；在系统变量中选中CLASSPATH变量，点击“编辑”，其变量值修改为：.;%JAVA_HOME%\lib;%JAVA_HOME%\lib\tools.jar
       即修改CLASSPATH = .;%JAVA_HOME%\lib;%JAVA_HOME%\lib\tools.jar
    ~~~
    + 参考资料
        + [cmd命令行中java报错：找不到或无法加载主类 HelloWorld](https://blog.csdn.net/wmc_bk/article/details/56314278)

+ 问题3：2018-08-22 20:44:22
    + 描述
    ~~~
    cmd命令行中java报错：找不到或无法加载主类 HelloWorld
    ~~~
    + 原因
    + 解决/处理
    ~~~
        方法1： 用文本编辑器打开另存为ANSI,
        方法2： 在cmd窗口下执行javac命令是，写为javac -encoding utf-8 -d .  文件名

    ~~~
    + 参考资料
        + [cmd下javac 错误: 编码GBK的不可映射字符](https://blog.csdn.net/u012848709/article/details/52719045)
