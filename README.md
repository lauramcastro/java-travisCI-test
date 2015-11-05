# java-travisCI-test
Testing TravisCI for simple Java projects

## Ant
Branch `ant' contains a manually-produced project structure and a manually-written `build.xml` file.

## Maven
Branch `maven` contains an automatically generated project structure and `pom.xml` file. The command used for generation is:

`mvn -B archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DgroupId=vvs -DartifactId=java-travisCI-test`
