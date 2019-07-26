#!/usr/bin/env bash

# Start a Kubernetes locally
minikube start

kubectl cluster-info

# Create a deployment
kubectl run kubernetes-bootcamp --image=gcr.io/google-samples/kubernetes-bootcamp:v1 --port=8080

# Start Kubeproxy in the background
kubectl proxy &

# Check if the server in the pod is accessible
curl http://localhost:8001/version
export POD_NAME=$(kubectl get pods -o go-template --template '{{range .items}}{{.metadata.name}}{{"\n"}}{{end}}')
echo Name of the Pod: $POD_NAME
curl http://localhost:8001/api/v1/namespaces/default/pods/$POD_NAME/proxy/

# Apply a nginx deployment
kubectl apply -f https://k8s.io/examples/controllers/nginx-deployment.yaml

# Status
kubectl get nodes
kubectl get namespaces
kubectl get pods -o wide
kubectl get deployments
