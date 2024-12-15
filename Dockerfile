FROM openjdk:8
EXPOSE 1010
ADD target/spring-docker.jar spring-docker.jar
ENTRYPOINT ["java","-jar","/spring-docker.jar"]