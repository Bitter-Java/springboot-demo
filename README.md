springboot-demo
===
![JDK-8](https://img.shields.io/badge/jdk-v8-blue)
[![google code style](https://img.shields.io/badge/codestyle-google-blue)](https://google.github.io/styleguide/javaguide.html)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

A springboot demo application

## Usage

- Directly using maven: `mvn spring-boot:run`
- From executable jar file:

```bash
mvn clean package -Dmaven.test.skip
java -jar target/springboot-demo-0.0.1-SNAPSHOT.jar
```

> error: The main class org. apache. maven. wrapper. MavenWrapperMain cannot be found or
> loaded: `mvn -N io.takari:maven:wrapper`

- From within your IDE right click run `SpringbootDemoApplication.java`

## test

> Use curl to authenticate the interface

```bash
curl --request GET -sL \
  --url 'http://localhost:8081/'

```