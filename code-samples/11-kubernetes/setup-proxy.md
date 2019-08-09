# Setup Docker proxy

## Step 1: Create a `.docker` dir in `HOME`

```
  mkdir ~/.docker
```

## Step 2: Create a file `config.json` with the following content:

`cat ~/.docker/config.json`

```json
{
  "proxies":
  {
    "default":
    {
      "httpProxy": "http://10.19.16.165:8080",
      "httpsProxy": "http://10.19.16.165:8080",
      "noProxy": "localhost,127.0.0.0/8,::1,172.17.0.0/16"
    }
  }
}
```

## Step 3: Environment variables

```bash
export NO_PROXY=$no_proxy,172.17.0.0/16
export HTTP_PROXY="http://10.19.16.165:8080"
export HTTPS_PROXY="http://10.19.16.165:8080"

export no_proxy=$no_proxy,172.17.0.0/16
export http_proxy="http://10.19.16.165:8080"
export https_proxy="http://10.19.16.165:8080"
```
