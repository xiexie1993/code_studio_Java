# Eclipse使用说明记录

### 开源Eclipse（Win7）


+ 下载并解压缩（注：eclipse是开源 win7软件是绿色免安装，只是要先配置号java环境）
    + [eclipse下载地址](https://www.eclipse.org/downloads/)

### 使用

+ 使用总纲
    + Step1： 创建Java项目
    + Step2： 创建程序包
    + Step3： 编写Java源程序
    + Step4： 运行java程序

+ 例子1：创建Java应用（Java Project / Java Application）
    + Step1： 创建Java项目
        + a、选择菜单栏 --> File(文件) --> New (新建) --> Project / Java Project --> 输入项目名和选择项目存放路径
    + Step2： 创建程序包
        + a、选中左侧工作区的项目下的src --> 右键 调出菜单（或者选择菜单栏 --> File(文件))  --> New (新建) --> Package （程序包） --> 输入包名（一般域名反写，如：com.baidu 则会在src下建立文件夹 ，src/com/baidu）
    + Step3： 编写Java源程序
        + a、选中左侧工作区的项目下的src下的其中一个程序包（如：com.baidu）--> 右键 调出菜单（或者选择菜单栏 --> File(文件))  --> New (新建) --> class --> 在面板上输入类名（如：HelloWorld则会在src下的库（com.baid）建立源文件 （如：src/com/baidu/HelloWorld.java）,这时你就可以写相应的代码了
    + Step4： 运行java程序
        + a、选中左侧工作区的项目下的src下的其中一个程序包下的一个class --> 右键 调出菜单（或者选择菜单栏 --> File(文件)) --> Run As --> Java Application （注：该类中需要有个 public static void main(String[] arags) 作为入口）
~~~
Eclipse的Java Project的目录结构

./
├─EclipseExam
├─bin            编译后生成的字节码文件存放目录成
├─src            编辑程序时的源文件（包和类的源文件存放目录）
├─.classpath     项目中的类文件的位置
└─.project       项目信息（项目名等）

~~~

+ 例子2：导入包（导入Scanner工具类：获取用户输入信息）
    + Scanner类位于java.util包中，使用时需要导入此包
    + 步骤：
        + Step1: 导入java.util.Scanner
            + 在包声明的下面（即 package xxx.xxx 的下面） import java.util.Scanner
        + Step2: 创建Scanner对象
            + Scanner input = new Scanner(System.in);// 创建Scanner对象
        + Step3: 接收并保存用户输入的值
            + int score= input.nextInt();//获取整数

## 参考资料

+ [Java:包进行类管理](https://blog.csdn.net/zzwtyds/article/details/78204137)

+ [各种语言常见的包管理工具](https://www.tianmaying.com/tutorial/package-manager)

+ [Java 包(package)](http://www.runoob.com/java/java-package.html)

+ [java中最常用的包和类（一）](https://blog.csdn.net/piratesjjcf/article/details/52506458)

+ [GitHub 上那些值得一试的 Java 开源库](https://www.oschina.net/news/75257/github-java-opensource-library)

+ [JDK中常用包及其类和功能详细剖析](https://blog.csdn.net/u011915230/article/details/53113525)