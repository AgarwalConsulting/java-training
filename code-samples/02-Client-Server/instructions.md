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
</dependencies>
```
