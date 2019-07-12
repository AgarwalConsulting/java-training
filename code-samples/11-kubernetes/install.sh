#!/usr/bin/env bash

set -e

echo "Installing kubectl..." # https://kubernetes.io/docs/tasks/tools/install-kubectl/#install-kubectl-on-linux

curl -LO https://storage.googleapis.com/kubernetes-release/release/$(curl -s https://storage.googleapis.com/kubernetes-release/release/stable.txt)/bin/linux/amd64/kubectl

chmod +x ./kubectl

sudo mv ./kubectl /usr/local/bin/kubectl

sudo ln -s /usr/local/bin/kubectl /usr/bin/kubectl

echo "Installing docker-machine..." # https://computingforgeeks.com/installing-docker-ce-ubuntu-debian-fedora-arch-centos/

sudo yum remove docker docker-common docker-selinux docker-engine

sudo yum install -y yum-utils device-mapper-persistent-data lvm2

sudo yum-config-manager --add-repo https://download.docker.com/linux/centos/docker-ce.repo

sudo yum -y install docker-ce docker-ce-cli containerd.io

sudo systemctl start docker && sudo systemctl enable docker


echo "Installing kvm..." # https://computingforgeeks.com/how-to-run-minikube-on-kvm/

sudo yum -y install epel-release
sudo yum -y install libvirt qemu-kvm virt-install virt-top libguestfs-tools bridge-utils

sudo systemctl start libvirtd
sudo systemctl enable libvirtd

echo "Installing minikube..." # https://kubernetes.io/docs/tasks/tools/install-minikube/#install-minikube-via-direct-download

curl -Lo minikube https://storage.googleapis.com/minikube/releases/latest/minikube-linux-amd64 && chmod +x minikube

sudo install minikube /usr/local/bin

rm minikube

echo "Installing docker-machine-driver-kvm2..."

curl -LO https://storage.googleapis.com/minikube/releases/latest/docker-machine-driver-kvm2

chmod +x docker-machine-driver-kvm2

sudo mv docker-machine-driver-kvm2 /usr/local/bin/

echo "Installation done! Please verfiy by running..."
echo "kubectl version"
echo "minikube version"
