FROM openjdk:18
COPY ./build/libs/graphql-1.0-SNAPSHOT.jar /app/graphql-1.0-SNAPSHOT.jar
WORKDIR /app
ENTRYPOINT ["java", "-jar", "graphql-1.0-SNAPSHOT.jar"]
EXPOSE 8080