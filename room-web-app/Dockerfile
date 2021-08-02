FROM maven:3.8.1-openjdk-11 as BUILDER
WORKDIR /build/
COPY pom.xml /build/
COPY src /build/src/
RUN mvn -f /build/pom.xml clean package

FROM openjdk:11
WORKDIR /app/
COPY --from=BUILDER /build/target/room-web-app-0.0.1-SNAPSHOT.jar /app/
ENTRYPOINT java -jar /app/room-web-app-0.0.1-SNAPSHOT.jar