## Binary Tree API

This is an application built on the Spring framework and wrapped as maven module,
that allows to create a binary tree, and find a common anscestor given 2 nodes.

### Getting Started

Please install the following tools:

- [JDK 1.8](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven 3](https://maven.apache.org/download.cgi)

### Running the API

Once You have cloned the repository, from the project root folder please execute the following command:

```
$ mvn clean package install
```

The above command will generate the binary distribution in `/target/` folder, so to run the API, please execute the 
following

```
$ cd target
$ java -jar tree-api-0.0.1-SNAPSHOT.jar
```

The above command will start the application in the port 8080. Thus, please go to 
http://localhost:8080/swagger-ui.html, for detailed documentation about the available operations.

### Dev Mode

The application comes with a set of unit tests. So from the project root folder, please
execute:

```
$ mvn test
```

Enjoy it, and do not forget to have fun!!