# java-maven-demo

通过源代码创建，云帮平台会自动识别为java-mavan项目，通过maven构建并打包为war

## 本地运行

确保本地环境安装了Java和Maven 

```bash
$ git clone https://github.com/goodrain-apps/java-maven-demo.git
$ cd java-maven-demo
$ mvn install
$ java $JAVA_OPTS -jar target/dependency/webapp-runner.jar --port $PORT target/*.war
```

## 部署到云帮

按照 [新建应用-源码构建](https://www.rainbond.com/docs/stable/user-lang-docs/java/docs/stable/user-app-docs/addapp/addapp-code.html) 的步骤操作，当代码提交完成后，平台就能够识别出项目所使用的语言。
