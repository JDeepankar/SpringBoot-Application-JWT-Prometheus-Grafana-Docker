FROM openjdk:22
EXPOSE 8080
ADD target/spring-kdemo.jar spring-kdemo.jar
ENTRYPOINT [ "java", "-jar", "/spring-kdemo.jar" ]
