#!/usr/bin/env bash

export NO_PROXY=$no_proxy,172.17.0.0/16
export HTTP_PROXY="http://10.19.16.165:8080"
export HTTPS_PROXY="http://10.19.16.165:8080"

export no_proxy=$no_proxy,172.17.0.0/16
export http_proxy="http://10.19.16.165:8080"
export https_proxy="http://10.19.16.165:8080"

export NO_PROXY=$NO_PROXY,$(minikube ip)
export no_proxy=$no_proxy,$(minikube ip)
