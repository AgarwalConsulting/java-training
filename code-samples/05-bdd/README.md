# BDD Workshop

## For existing tdd-kata

### Create appropriate dir structure within `tdd-kata`

```bash
  mkdir -p src/test/java/com/algogrit/java src/test/resources/com/algogrit/java
```

### Edit pom.xml and add the following under existing `dependencies` & `properties` appropriately

```xml
    <properties>
        <cucumber.version>4.2.6</cucumber.version>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>

    <dependencies>
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-java</artifactId>
            <version>${cucumber.version}</version>
            <scope>test</scope>
        </dependency>

        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-junit</artifactId>
            <version>${cucumber.version}</version>
            <scope>test</scope>
        </dependency>
    </dependencies>
```

### Create the following files

> $ cat src/test/java/com/algogrit/java/RunCucumberTest.java

```java
package com.algogrit.java;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"})
public class RunCucumberTest {
}
```

> $ cat src/test/java/com/algogrit/java/Stepdefs.java

```java
package com.algogrit.java;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;

public class Stepdefs {

}
```

### Create your first feature in `calculator.feature`

```bash
touch src/test/resources/com/algogrit/java/calculator.feature
mvn clean test
```
