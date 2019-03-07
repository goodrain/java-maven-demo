# java-maven-demo

通过源代码创建，云帮平台会自动识别为 java-maven 项目，通过 maven 构建并打包为 jar

## 本地运行

确保本地环境安装了Java和Maven 

```bash
$ git clone https://github.com/goodrain/java-maven-demo.git
$ cd java-maven-demo
$ mvn install
$ java $JAVA_OPTS -jar target/dependency/webapp-runner.jar --port $PORT target/*.jar
```
