# Docker

## Problem

I have a machine with the following specs:

```
  64 CPU cores
  128 GB RAM
  1 TB SSD
```

I have built in an application in a [microservice architecture](https://microservices.io/). With the following specs:

```
  # Service A

  Node.js process
  Postgres 10
```

```
  # Service B

  Java process
  Postgres 9
```

How do I run both of these services on my machine?

## Installation Check

Verify installation with:

```bash
docker run hello-world:latest
```

## Steps to create your own image and run a container

* Write your own `Dockerfile` [Ref: https://docs.docker.com/engine/reference/builder]
  - Refer [hello-go/Dockerfile](https://github.com/AgarwalConsulting/java-training/blob/master/code-samples/08-Docker/hello-go/Dockerfile)
* `docker build -t ${image-name}:${tag-name} .`
* `docker run ${image-name}`

Dockerfile - default name for docker file
latest - default tag name

## Create a simple image and push to docker registry

* Register on https://hub.docker.com
* Sign up using `docker login`
* Create a simple "Hello, world!" container based on `alpine` linux
  * This container prints `Hello, World!` when `run`
  * Build using `docker build -f Dockerfile -t ${username}/${image-name}:${tag-name} .`
* Push the image to `hub.docker.com` under your username in a `username/image-name` format
  * `docker push ${username}/${image-name}:${tag-name}`
* Make sure to run the image in the person next to your computer
  * `docker run ${username}/${image-name}`

## Other Resources

* Building a docker-like container from scratch using Go: [Video](https://www.youtube.com/watch?v=MHv6cWjvQjM&t=1316s), [Code](https://github.com/lizrice/containers-from-scratch)
