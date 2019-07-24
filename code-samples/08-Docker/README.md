# Docker

## Installation Check

Verify installation with:

```bash
docker run hello-world:latest
```

## Simple Problem

Create your own `hello-java` example similar to `hello-go`!

## Steps to create your own image and run a container

* Write your own `Dockerfile` [Ref: https://docs.docker.com/engine/reference/builder]
  - Refer [hello-go/Dockerfile](https://github.com/AgarwalConsulting/java-training/blob/master/code-samples/08-Docker/hello-go/Dockerfile)
* `docker build -t <image-name>:<tag-name> .`
* `docker run <image-name>`

Dockerfile - default name for docker file
latest - default tag name

## Other Resources

* Building a docker-like container from scratch using Go: [Video](https://www.youtube.com/watch?v=MHv6cWjvQjM&t=1316s), [Code](https://github.com/lizrice/containers-from-scratch)
