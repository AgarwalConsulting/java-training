# Docker

Verify installation with:

```bash
docker run hello-world:latest
```

## Steps to create your own image and run a container

* Write your own `Dockerfile` [Ref: https://docs.docker.com/engine/reference/builder]
* `docker build -t ${image-name}:${tag-name} .`
* `docker run ${image-name}`
```

Dockerfile - default name for docker file
latest - default tag name
