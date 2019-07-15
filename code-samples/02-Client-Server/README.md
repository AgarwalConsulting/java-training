# Instructions

## Generate an empty maven project

```bash
mvn archetype:generate \
-DgroupId=com.algogrit.java \
-DartifactId=spark-hello-world \
-DarchetypeArtifactId=maven-archetype-quickstart \
-DinteractiveMode=false \
-DarchetypeVersion=1.4
```

## Add the following snippet to pom.xml

Refer: http://sparkjava.com/tutorials/maven-setup

```xml
  <dependencies>
    <dependency>
        <groupId>com.sparkjava</groupId>
        <artifactId>spark-core</artifactId>
        <version>2.5</version>
    </dependency>
    <dependency>
        <groupId>org.slf4j</groupId>
        <artifactId>slf4j-simple</artifactId>
        <version>1.7.21</version>
    </dependency>
  </dependencies>
```

Also modify:

```xml
  <maven.compiler.source>1.8</maven.compiler.source>
  <maven.compiler.target>1.8</maven.compiler.target>
```

from `1.7` to `1.8`.

## Replace the code in App.java

```java
package com.algogrit.java;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");
    }
}
```
