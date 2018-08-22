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
    + CLASSPATH      配置类库文件位置（默认 C:\Program Files\Java\jdk1.7.0_79\lib） 或 .;%JAVA_HOME%\lib;%JAVA_HOME%\lib\tools.jar

+ Step3:命令行测试
    + 执行命令 java 、javac

## 开发集成环境

### Eclipse（Win7）

### MyEclipse()

## 目录结构

~~~

./
├─ demo.java
├─ PrintThreadState.java
└─ README.md

~~~

+ 演示/使用步骤：
    + step1: 命令行进入该目录，执行 javac -encoding utf-8 -d . demo.java ,进行编译,会生成 demo.class 、Thread1.class、Thread2.class字节码文件
    + step2: 再执行 java demo （注：执行对应的字节码文件，不需要加.class）

## 问题记录

+ 问题1
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



+ 问题2
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

+ 问题3：    cmd命令行中java报错：找不到或无法加载主类 HelloWorld 
    + 描述
    ~~~
        C:\MyWorkSpace\PublicGit\code_studio_Java\Thread_Example1>javac demo.java
        demo.java:10: 错误: 编码GBK的不可映射字符
                        System.out.println("褰撳墠绾跨▼鏄? "+Thread.currentThread().getName());
                                                   ^
        demo.java:28: 错误: 编码GBK的不可映射字符
                        System.out.println("褰撳墠绾跨▼鏄? "+Thread.currentThread().getName());
    ~~~
    + 原因
    + 解决/处理
    ~~~
        方法1： 用文本编辑器打开另存为ANSI,
        方法2： 在cmd窗口下执行javac命令是，写为javac -encoding utf-8 -d .  文件名
    ~~~
    + 参考资料
        + [cmd下javac 错误: 编码GBK的不可映射字符](https://blog.csdn.net/u012848709/article/details/52719045)

+ 问题4：类A是公共的,应在名为A.java的文件中声明错误
    + 描述
    ~~~
    C:\MyWorkSpace\PublicGit\code_studio_Java\Thread_Example1>javac -encoding utf-8 -d . demo.java
    demo.java:1: 错误: 类First是公共的, 应在名为 First.java 的文件中声明
    public class First extends Thread{
    ~~~
    + 原因
    + 解决/处理
    ~~~
        一个 *.java 文件中,只能有一个public 的类,而且这个public修饰的这类必需要和这个文件名相同.
        //BOSS.java 
        public final class Boss extends Employee{ }
        你把public去掉就可以了.
    ~~~
    + 参考资料
        + [类A是公共的,应在名为A.java的文件中声明错误](https://blog.csdn.net/leafinsnowfield/article/details/47068825)

## 参考资料

+ [一道简单的java面试题，让我重新审视了自己](https://m.baidu.com/?from=1000953f#iact=wiseindex%2Ftabs%2Fnews%2Factivity%2Fnewsdetail%3D%257B%2522linkData%2522%253A%257B%2522name%2522%253A%2522iframe%252Fmib-iframe%2522%252C%2522id%2522%253A%2522feed%2522%252C%2522index%2522%253A0%252C%2522url%2522%253A%2522https%253A%252F%252Fmbd.baidu.com%252Fnewspage%252Fdata%252Flandingpage%253Fs_type%253Dnews%2526dsp%253Dwise%2526context%253D%25257B%252522nid%252522%25253A%252522news_9228471000487366853%252522%25257D%2526pageType%253D1%2526n_type%253D1%2526p_from%253D-1%2526innerIframe%253D1%2522%252C%2522isThird%2522%253Afalse%252C%2522title%2522%253Anull%257D%257D)