# 1. Base Java 17 image
FROM openjdk:17-jdk-slim

# 2. Set working directory
WORKDIR /app

ARG JAR_FILE=deployment-study-0.0.1-SNAPSHOT.jar

# 3. Copy JAR file into container
COPY ../build/libs/${JAR_FILE} deployment-study.jar

# 5. Command to run the application
ENTRYPOINT ["java", "-jar", "deployment-study.jar"]