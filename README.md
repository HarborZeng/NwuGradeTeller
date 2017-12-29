# NwuGradeTeller
# 关于NGT
NGT是一个西北大学的第三方成绩查询系统，仅支持查询当前学期的成绩。
![preview]()

# 建议运行环境
- Intellij IDEA 2017.3
- Tomcat 8.5
- Gradle 4.4.1 [下载地址](https://gradle.org/)
- JDK 1.8
- 你可以去[http://tomcat.apache.org/whichversion.html](http://tomcat.apache.org/whichversion.html)查看对应版本

# 项目所用到的依赖
```
testCompile group: 'junit', name: 'junit', version: '4.12'
// https://mvnrepository.com/artifact/javax.servlet/javax.servlet-api
compile group: 'javax.servlet', name: 'javax.servlet-api', version: '3.0.1'
// https://mvnrepository.com/artifact/javax.servlet/jstl
compile group: 'javax.servlet', name: 'jstl', version: '1.2'
```


# build方法指南
## 方法1: 使用Gradle编译
- clone本项目
`git clone https://github.com/HarborZeng/NwuGradeTeller.git`

- cd至项目目录
`cd NwuGradeTeller`

- 使用Gradle来build
[关于Gradle来build Web Application](https://guides.gradle.org/building-java-web-applications/)
如果您已配好Gradle环境的话，执行
`./gradlew build`
既可成功编译
如果出现编码异常错误，参考[Gradle项目中文乱码的解决办法](http://blog.csdn.net/u011054333/article/details/54175641)

- 成功之后，把`NwuGradeTeller\build\libs\nwugradeteller-1.0-SNAPSHOT.war`放到`Tomcat`的`webApps`目录下既可自动解压，重新运行tomcat既可使用

## 方法2: 使用Intellij IDEA来运行
- 在Intellij IDEA中打开本项目
- 配置tomcat运行环境
[!配置如下]()
- 成功运行

## 方法3：使用Intellij IDEA的Gradle来build
- 你要是选择这种方法，那你肯定是不需要我再教你怎么做的大佬了，唯一与注意的一点就是加上参数build，以防出错。
[!加上参数]()
如果还是编码异常，参考[Gradle项目中文乱码的解决办法](http://blog.csdn.net/u011054333/article/details/54175641)

# 法律文件
[agreement](https://github.com/HarborZeng/NwuGradeTeller/blob/master/src/main/webapp/agreement.html)
[LICENSE](https://github.com/HarborZeng/NwuGradeTeller/blob/master/LICENSE)