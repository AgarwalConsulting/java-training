# Docker

Verify installation with:

```bash
docker run hello-world:latest
```

## Steps to create your own image and run a container

* Write your own `Dockerfile` [Ref: https://docs.docker.com/engine/reference/builder]
* `docker build -t ${image-name}:${tag-name} .`
* `docker run ${image-name}`

Dockerfile - default name for docker file
latest - default tag name

## Create a simple image and push to docker registry

* Register on https://hub.docker.com
* Sign up using `docker login`
* Create a simple "Hello, world!" container based on `alpine` linux
  * This container prints `Hello, World!` when `run`
  * Build using `docker build -t ${username}/${image-name}:${tag-name} .`
* Push the image to `hub.docker.com` under your username in a `username/image-name` format
  * `docker push ${username}/${image-name}:${tag-name}`
