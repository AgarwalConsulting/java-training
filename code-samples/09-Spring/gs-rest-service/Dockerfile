FROM maven:latest
WORKDIR /app
# COPY ./settings.xml ~/.m2/
COPY ./pom.xml .
RUN mvn dependency:go-offline -B
COPY . .
RUN mvn package
ENTRYPOINT [ "java", "-jar", "target/gs-rest-service-0.1.0.jar" ]
