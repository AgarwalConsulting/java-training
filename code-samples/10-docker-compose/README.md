# Docker Compose

## Installation

* Step 1: Install latest version of `docker-compose`

```bash
  sudo curl -L "https://github.com/docker/compose/releases/download/1.24.0/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose
```

* Step 2: Make it an executable

```bash
  sudo chmod +x /usr/local/bin/docker-compose
```

* Step 3: Create a symbolic link

```bash
  sudo ln -s /usr/local/bin/docker-compose /usr/bin/docker-compose
```
