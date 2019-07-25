FROM maven as builder
# COPY settings.xml /root/.m2/
WORKDIR /app
COPY pom.xml /app
RUN mvn dependency:go-offline -B
COPY . /app
RUN mvn clean package
# ENTRYPOINT [ "java", "-jar", "/app/target/gs-rest-service-0.1.0.jar" ]

FROM anapsix/alpine-java
RUN adduser -D non-root
USER non-root
WORKDIR /app
COPY --from=builder /app/target/gs-rest-service-0.1.0.jar .
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "/app/gs-rest-service-0.1.0.jar" ]
