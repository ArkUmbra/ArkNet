springmvc-thymeleaf-bootstrap
=============================
This is a simple "seed" project to be used as the basis for new projects,
especially sample applications.

It is a Spring Boot-enabled project that employs Spring MVC, Thymeleaf
templates, and Twitter Bootstrap. It *roughly* recreates the behavior of 
the Spring ToolSuite Spring MVC Template project. 

After cloning this project, you can build using the Gradle wrapper:

```sh
$ gradlew build
```

After the build completes, you can either deploy the WAR file at
build/libs/mvc-thymeleaf-bootstrap-0.1.0.war to your favorite servlet
container or you can run it using an embedded Tomcat from the command
line:

```sh
$ java -jar build/libs/mvc-thymeleaf-bootstrap-0.1.0.war
```

To use this as a "seed" for your own projects, delete the .git directory,
commit it to your own repository, then develop on top of it.
