# TDD Workshop

## Instructions

Refer Kata Catalog: https://github.com/AgarwalConsulting/kata-catalog/blob/master/katas/String%20Calculator.md

### Create an empty maven project

```
  mvn archetype:generate \
    -DgroupId=com.algogrit.java \
    -DartifactId=tdd-kata \
    -DarchetypeArtifactId=maven-archetype-quickstart \
    -DinteractiveMode=false \
    -DarchetypeVersion=1.4
```

## Rules

- Don't write any production (`src/main/...`) code, until you have a corresponding failing test
- For each step in the kata, write a simple test in `src/test/...`, add `assert*` statements to it.
- Run your tests, after you have written the production code
- Refactor

## References

- https://junit.org/junit4/javadoc/latest/org/junit/Assert.html
