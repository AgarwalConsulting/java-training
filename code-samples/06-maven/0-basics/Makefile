validate:
	echo "Validating POM.xml"

compile:
	mkdir -p ./make-target/classes
	javac -d ./make-target/classes src/main/java/*.java

package: validate compile
	jar cvf ./make-target/output.jar ./make-target/classes/*

clean:
	rm -rf make-target
