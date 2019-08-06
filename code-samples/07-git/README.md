# Git

Take home practice problems: https://gitexercises.fracz.com/

Git parable: https://tom.preston-werner.com/2009/05/19/the-git-parable.html

```
Imagine that you have a computer that has nothing on it but a text editor and a few file system commands. Now imagine that you have decided to write a large software program on this system. Because you’re a responsible software developer, you decide that you need to invent some sort of method for keeping track of versions of your software so that you can retrieve code that you previously changed or deleted.
```

Gremlins Repo: https://github.com/AgarwalConsulting/gremlins

## Setup git

```bash
git config --global color.ui true
git config --global user.name 'Gaurav Agarwal'
git config --global user.email 'algogrit@gmail.com'
git config --global push.default current
```

## Resolutions

### 504 - Proxy error

```bash
unset HTTP_PROXY
unset HTTPS_PROXY
git config --global --unset http.proxy
git config --global --unset https.proxy
```
