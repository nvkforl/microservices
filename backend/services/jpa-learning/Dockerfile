FROM adoptopenjdk/openjdk15:jdk-15.0.1_9-alpine
ARG JAR_FILE=target/*.jar
ARG envVal
COPY ${JAR_FILE} app.jar
ENV envValue=$envVal
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=${envValue}","app.jar"]