#!/usr/bin/env bash

set -e

echo "Setting up docker proxy settings..."
mkdir -p ~/.docker
cp docker-config.json ~/.docker/config.json

echo "Fetching kubernetes source..."
mkdir -p ~/.go/src/k8s.io/kubernetes
export GOPATH=$HOME/.go
git clone https://github.com/kubernetes/kubernetes.git ~/.go/src/k8s.io/kubernetes

echo "Creating kind cluster..."
# kind delete cluster
kind build node-image
kind create cluster --config kind-config.yml
