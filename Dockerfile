FROM openjdk:17-jdk-alpine

RUN mkdir "app"
COPY . /app
WORKDIR /app

CMD docker-compose -f app/docker-compose.yaml up -d

EXPOSE 8080
ENTRYPOINT ["java","-jar","target/mongodb_docker-0.0.1-SNAPSHOT.jar"]