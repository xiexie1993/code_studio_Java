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

## 参考资料