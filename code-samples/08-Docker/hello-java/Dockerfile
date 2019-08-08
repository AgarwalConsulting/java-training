FROM openjdk:alpine AS builder
WORKDIR /app
COPY ./Hello.java /app
RUN javac Hello.java
# ENTRYPOINT ["java", "Hello"]

FROM openjdk:8-jre-alpine
COPY --from=builder /app/Hello.class /
CMD ["java", "Hello"]
