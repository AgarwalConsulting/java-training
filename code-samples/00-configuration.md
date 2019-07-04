# Configuration

### Step 1

```
  sudo gedit /usr/share/maven/conf/settings.xml
```

Edit the xml, remove `http://` inside `<host>`:

```xml
  <proxies>
    <proxy>
      ...
      <host>http://</host>
    <proxy>
    ...
  </proxies>
```

### Step 2

```bash
  mkdir -p ~/.m2/
  cp /usr/share/maven/conf/settings.xml ~/.m2/
```

### Step 3

```bash
  rm -rf ~/.m2/repository
```
