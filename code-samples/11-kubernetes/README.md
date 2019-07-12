# Kubernetes

[Kubernetes](https://kubernetes.io/) is a container orchestration platform at scale.

![Kubernetes](https://upload.wikimedia.org/wikipedia/commons/b/be/Kubernetes.png)

## Setup

```bash
  curl https://raw.githubusercontent.com/AgarwalConsulting/java-training/master/code-samples/11-kubernetes/install.sh -o /tmp/install.sh
  chmod 744 /tmp/install.sh
  /tmp/install.sh
```

Or clone the repo and run `./install.sh`

## Getting Started

```bash
  minikube start --vm-driver=kvm2

  kubectl version
```

## Resources

In-browser Hands-on: [Playground](https://training.play-with-kubernetes.com/kubernetes-workshop/)

Workshops:

* [Basic](https://github.com/gsaslis/kubernetes-basics-workshop)
* [Advanced](https://github.com/GoogleCloudPlatform/kubernetes-workshops)
