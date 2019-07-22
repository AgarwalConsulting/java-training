# Maven

Creating an empty maven project for source & target 1.7:

```bash
  mvn archetype:generate \
  -DgroupId=com.algogrit.java \
  -DartifactId=scratchpad \
  -DarchetypeArtifactId=maven-archetype-quickstart \
  -DinteractiveMode=false \
  -DarchetypeVersion=1.4
```

## Default Lifecycle

* validate - validate the project is correct and all necessary information is available.
* compile - compile the source code of the project.
* test - run tests using a suitable unit testing framework. These tests should not require the code be packaged or deployed.
* package - take the compiled code and package it in its distributable format, such as a JAR.
* verify - run any checks to verify the package is valid and meets quality criteria.
* install - install the package into the local repository, for use as a dependency in other projects locally.
* deploy - Runs install in a CI/CD environment. Done in an integration or release environment, copies the final package to the remote repository for sharing with other developers and projects.

## Multi-module projects

### Parent `pom.xml`

```xml
  <packaging>pom</packaging>

  <modules>
      <module>child1</module>
      <module>child2</module>
  </modules>
```

### Child `pom.xml`

```xml
  <packaging>jar/war</packaging>

  <parent>
      <groupId>parent-group-id</groupId>
      <artifactId>parent-artifactId</artifactId>
      <version>1.0</version>
  </parent>
```

## Demo

* https://github.com/sit/maven-workshop

## Exercises

* https://github.com/mattpwest/Maven-Exercises
