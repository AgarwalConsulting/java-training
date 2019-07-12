# Kubernetes

## Installation

### Setting up kubectl

From: https://kubernetes.io/docs/tasks/tools/install-kubectl/#install-kubectl-on-linux

* Step 1: Install the latest release

```bash
  curl -LO https://storage.googleapis.com/kubernetes-release/release/$(curl -s https://storage.googleapis.com/kubernetes-release/release/stable.txt)/bin/linux/amd64/kubectl
```

* Step 2: Make it executable

```bash
  chmod +x ./kubectl
```

* Step 3: Move the binary in to your PATH.

```bash
  sudo mv ./kubectl /usr/local/bin/kubectl
```

* Step 4: Test to ensure the version you installed is up-to-date:

```bash
  kubectl version
```

### Setting up kvm or virtualbox

```bash
  sudo yum install kvm
```

### Setting up minikube

* Step 1: Install the latest binary

```bash
  curl -Lo minikube https://storage.googleapis.com/minikube/releases/latest/minikube-linux-amd64 && chmod +x minikube
```

* Step 2:

```bash
  sudo install minikube /usr/local/bin
```
