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

  # ./source.sh
  export NO_PROXY=$no_proxy,$(minikube ip)

  kubectl version
```

## Resources

In-browser Hands-on: [Playground](https://kubernetes.io/docs/tutorials/)

Workshops:

* [Basic](https://github.com/gsaslis/kubernetes-basics-workshop)
* [Advanced](https://github.com/GoogleCloudPlatform/kubernetes-workshops)
