FROM openjdk:16-alpine3.13

WORKDIR /app
COPY . .
RUN ./mvnw package

CMD ["java", "-jar", "target/sample-0.0.1-SNAPSHOT.jar"]