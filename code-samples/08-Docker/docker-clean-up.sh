#!/usr/bin/env bash

docker stop $(docker ps -aq) # Stop all containers
docker rm $(docker ps -aq) # Remove all containers
docker images prune # Cleanup old images
docker rmi $(docker images -f 'dangling=true' -q) # Remove untagged images
