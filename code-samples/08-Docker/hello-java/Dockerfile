FROM java:alpine
WORKDIR /app
COPY ./Hello.java /app
RUN javac Hello.java
ENTRYPOINT ["java", "Hello"]
