FROM openjdk:11
EXPOSE 8082
ADD target/userService-0.0.1-SNAPSHOT.jar /home/ajit/new/userService-0.0.1-SNAPSHOT.jar
WORKDIR /home/ajit/new
ENTRYPOINT ["java", "-jar", "userService-0.0.1-SNAPSHOT.jar"]