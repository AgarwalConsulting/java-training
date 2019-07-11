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
    </proxy>
  </proxies>
```

### Step 2

Add another proxy for secured connections within `<proxies></proxies>`

```xml
  <proxy>
    <id>optional</id>
    <active>true</active>
    <protocol>https</protocol>
    <host>10.19.16.165</host>
    <port>8080</port>
    <nonProxyHosts></nonProxyHosts>
  </proxy>
```

### Step 3

```bash
  mkdir -p ~/.m2/
  cp /usr/share/maven/conf/settings.xml ~/.m2/
```

### Step 4

```bash
  rm -rf ~/.m2/repository
```
