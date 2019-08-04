# Kubernetes

[Kubernetes](https://kubernetes.io/) is a container orchestration platform at scale.

![Kubernetes](https://upload.wikimedia.org/wikipedia/commons/b/be/Kubernetes.png)

[Glossary](https://kubernetes.io/docs/reference/glossary)

## Setup

```bash
  curl https://raw.githubusercontent.com/AgarwalConsulting/java-training/master/code-samples/11-kubernetes/install.sh -o /tmp/install.sh
  chmod 744 /tmp/install.sh
  /tmp/install.sh
```

Or clone the repo and run `./install.sh`

## Getting Started

### Single node cluster using minikube

```bash
  minikube start --vm-driver=kvm2

  # ./source.sh
  export NO_PROXY=$no_proxy,$(minikube ip)

  kubectl version
```

### Multi node cluster using Kind

[Kubernetes in Docker](https://github.com/kubernetes-sigs/kind/)

```bash
  export HTTP_PROXY=http://10.19.16.165:8080
  export HTTPS_PROXY=http://10.19.16.165:8080
```

## Resources

In-browser Hands-on: [Playground](https://www.katacoda.com/courses/kubernetes)

Workshops:

* [Basic](https://github.com/gsaslis/kubernetes-basics-workshop)
* [Advanced](https://github.com/GoogleCloudPlatform/kubernetes-workshops)

Videos:

* [Kubernetes 101 Workshop](https://www.youtube.com/watch?v=H-FKBoWTVws)
