# Setup Docker proxy

1. Create a `.docker` dir in `HOME`

```
  mkdir ~/.docker
```

2. Create a file `config.json` with the following content:

`cat ~/.docker/config.json`

```json
{
 "proxies":
 {
   "default":
   {
     "httpProxy": "http://10.19.16.165:8080",
     "httpsProxy": "http://10.19.16.165:8080"
   }
 }
}
```
