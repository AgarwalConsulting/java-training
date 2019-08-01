# SOAP API

## Introduction

* https://www.baeldung.com/jax-ws

## How-to

* https://spring.io/guides/gs/producing-web-service/#scratch

## How-to detailed

* `mkdir soap-example; cd soap-example`
* `mkdir -p src/{main,test}/java/hello src/main/resources`
* Add the following contents to a file called `pom.xml`, then `cat pom.xml`:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>org.springframework</groupId>
    <artifactId>gs-producting-web-service</artifactId>
    <version>0.1.0</version>

    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.1.6.RELEASE</version>
    </parent>

    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
          <groupId>org.springframework.boot</groupId>
          <artifactId>spring-boot-starter-web-services</artifactId>
        </dependency>
        <dependency>
          <groupId>wsdl4j</groupId>
          <artifactId>wsdl4j</artifactId>
        </dependency>
    </dependencies>

    <properties>
        <java.version>1.8</java.version>
    </properties>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
            <plugin>
              <groupId>org.codehaus.mojo</groupId>
              <artifactId>jaxb2-maven-plugin</artifactId>
              <version>1.6</version>
              <executions>
                <execution>
                  <id>xjc</id>
                  <goals>
                    <goal>xjc</goal>
                  </goals>
                </execution>
              </executions>
              <configuration>
                <schemaDirectory>${project.basedir}/src/main/resources/</schemaDirectory>
                <outputDirectory>${project.basedir}/src/main/java</outputDirectory>
                <clearOutputDir>false</clearOutputDir>
              </configuration>
            </plugin>
        </plugins>
    </build>
</project>
```

* Add the following contents to a file `src/main/resources/countries.xsd`:

```xml
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:tns="http://spring.io/guides/gs-producing-web-service"
           targetNamespace="http://spring.io/guides/gs-producing-web-service" elementFormDefault="qualified">

    <xs:element name="getCountryRequest">
        <xs:complexType>
            <xs:sequence>
                <xs:element name="name" type="xs:string"/>
            </xs:sequence>
        </xs:complexType>
    </xs:element>

    <xs:element name="getCountryResponse">
        <xs:complexType>
            <xs:sequence>
                <xs:element name="country" type="tns:country"/>
            </xs:sequence>
        </xs:complexType>
    </xs:element>

    <xs:complexType name="country">
        <xs:sequence>
            <xs:element name="name" type="xs:string"/>
            <xs:element name="population" type="xs:int"/>
            <xs:element name="capital" type="xs:string"/>
            <xs:element name="currency" type="tns:currency"/>
        </xs:sequence>
    </xs:complexType>

    <xs:simpleType name="currency">
        <xs:restriction base="xs:string">
            <xs:enumeration value="GBP"/>
            <xs:enumeration value="EUR"/>
            <xs:enumeration value="PLN"/>
        </xs:restriction>
    </xs:simpleType>
</xs:schema>
```

## Examples

* http://www.dneonline.com/calculator.asmx

## Other Resources

* https://docs.oracle.com/javaee/6/tutorial/doc/bnayn.html
