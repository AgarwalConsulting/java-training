#!/usr/bin/env bash

echo "Installing docker-compose..."

curl -L "https://github.com/docker/compose/releases/download/1.24.1/docker-compose-$(uname -s)-$(uname -m)" -o /tmp/docker-compose

sudo mv /tmp/docker-compose /usr/local/bin/docker-compose

sudo chmod +x /usr/local/bin/docker-compose

sudo ln -sf /usr/local/bin/docker-compose /usr/bin/docker-compose

echo "Installation complete! Please verfiy using: "
echo "  docker-compose version"
