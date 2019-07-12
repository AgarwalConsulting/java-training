#!/usr/bin/env bash

set -e

echo "Installing kubectl..." # https://kubernetes.io/docs/tasks/tools/install-kubectl/#install-kubectl-on-linux

curl -LO https://storage.googleapis.com/kubernetes-release/release/$(curl -s https://storage.googleapis.com/kubernetes-release/release/stable.txt)/bin/linux/amd64/kubectl

chmod +x ./kubectl

sudo mv ./kubectl /usr/local/bin/kubectl

sudo ln -s /usr/local/bin/kubectl /usr/bin/kubectl

echo "Installing kvm..."

sudo yum install kvm

echo "Installing minikube..." # https://kubernetes.io/docs/tasks/tools/install-minikube/#install-minikube-via-direct-download

curl -Lo minikube https://storage.googleapis.com/minikube/releases/latest/minikube-linux-amd64 && chmod +x minikube

sudo install minikube /usr/local/bin

rm minikube

echo "Installation done! Please verfiy by running..."
echo "kubectl version"
echo "minikube version"
