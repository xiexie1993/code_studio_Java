# JAVA

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

### 开源Eclipse（Win7）


+ 下载并解压缩（注：eclipse是开源 win7软件是绿色免安装，只是要先配置号java环境）
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
├─ Example1                  例子1： 打印HelloWorld
|  ├─ HelloWorld.java        
|  └─ README.md              该部分例子自述文件
├─ Thread_Example1           例子2： 线程例子
|  ├─ demo.java  
|  └─ README.md              该部分例子自述文件
├─ Thread_Example2                  例子2： 打印Java中几种线程的状态
|  ├─ demo.java  
|  └─ README.md              该部分例子自述文件
├─ EclipseInsMan.md          Eclipse使用说明与记录
└─ README.md                 自述文件
 
~~~