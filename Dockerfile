# Use a base image with Java and a minimal Linux distribution
FROM openjdk:11-jre-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file of your Spring application into the container
COPY target/stocks-backend-spring-0.0.1-SNAPSHOT.jar /app/

# Expose the port your Spring Boot application will listen on
EXPOSE 8080

# Define the command to run your Spring Boot application when the container starts
CMD ["java", "-jar", "stocks-backend-spring-0.0.1-SNAPSHOT.jar"]
