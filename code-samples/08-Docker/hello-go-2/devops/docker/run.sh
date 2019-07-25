#!/usr/bin/env bash

GOOS=linux go build hello.go
docker run -v `pwd`:/app hello-go-2
