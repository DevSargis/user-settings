# Step 1: Use an official Java runtime as the base image
FROM openjdk:17-jdk-slim

# Step 2: Set the name of the jar file to copy
ARG JAR_FILE=target/user-service-0.0.1-SNAPSHOT.jar

# Step 3: Copy the built jar from your project into the image
COPY ${JAR_FILE} app.jar

# Step 4: Set the command to run the jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
