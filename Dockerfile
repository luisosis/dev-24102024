FROM openjdk:17
ARG JAR_FILE=target/project_base-0.0.1.jar
COPY ${JAR_FILE} app_demo.jar
EXPOSE 8090
ENTRYPOINT ["java", "-jar", "/app_demo.jar"]