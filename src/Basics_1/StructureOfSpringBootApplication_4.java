package Basics_1;

public class StructureOfSpringBootApplication_4 {

    /*

    Any project that contains pom.xml file then the build toll for that project is maven


    Now we are trying to understand the structure of the Spring Boot Application



    1) .idea -> intellij related configuration

    2)  .mvn ->  is we make a use of mvn wrapper then it contains it's jar

    3)  . gitignore -> not to commit

    4)  src ->  main -> contains core functionality ---> java  ----->code


                                                    ---> resources  ---> contains properties

                                                                            -----> static ---> contains files such as images ,etc

                                                                            -----> applications properties ----> properties that we are using in our project such as configuration of mongo db etc

                                                                            -----> templates ---> used earlier , not that much imp


                test -> tests related to the main (such as to test any method that written in main)



    5) pom.xml -> stands for *****project object model xml***

                    --> it contains info such as how this project is build which libraries used etc.





                <?xml version="1.0" encoding="UTF-8"?>   ----> version


                	-----------> everything is written inside the project tag <-----------
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>




----------->inherits required plugins and dependencies from the particular parent <-----------

	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>3.3.13</version>
		<relativePath/> <!-- lookup parent from repository -->
	</parent>




----------->whatever we do while spring initializer (g a v) <-----------

	<groupId>com.rsp</groupId>
	<artifactId>demo</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<name>SpringBootProject</name>
	<description>myFirstSpringBootProject</description>
	<url/>
	<licenses>
		<license/>
	</licenses>
	<developers>
		<developer/>
	</developers>
	<scm>
		<connection/>
		<developerConnection/>
		<tag/>
		<url/>
	</scm>


    ----------->it tells maven the version of java <-----------
	<properties>
		<java.version>20</java.version>
		<maven.compiler.source>20</maven.compiler.source>
		<maven.compiler.target>20</maven.compiler.target>
	</properties>


	---------->to add external dependencies <-----------
	<dependencies>


		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>

		<!-- https://mvnrepository.com/artifact/com.opencsv/opencsv -->
		<dependency>
			<groupId>com.opencsv</groupId>
			<artifactId>opencsv</artifactId>
			<version>5.11.2</version>
		</dependency>

	</dependencies>



	<build>
		<plugins>  ----------->helps in packaging your code in .jar or .war <-----------
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
			</plugin>
		</plugins>
	</build>

</project>




************************************

now  inside out target folder the is .jar file and there is another .jar.original

now .jar is also called as fat jar because it contains all dependencies , plugins etc   , it contains all tom cat server related all stuff so we don't require any external server

and  .jar.original   contains only compiled code





*************Repackaging*****************


when we do mvn package then it creates .jar.original and .jar called as  Repackaging and this is possible due to plugins

plugin fist creates .jar.original then repakage old jar into .jar which contains all depen and all then new fat jar considered as jar


/*



🧩 What is Repackaging in Spring Boot?
Repackaging means:

🧃 Taking your compiled Java project and wrapping it into a single runnable .jar file that contains everything — your code plus all dependencies.

So the result is a self-contained file (a "fat JAR" or "uber JAR") that you can just run using:

bash
Copy
Edit
java -jar myapp.jar
🛠️ Why is Repackaging Needed?
When you build a normal Java project:

You get .class files (compiled bytecode)

You still need to manually include .jar libraries to run it

But Spring Boot apps are meant to be easily run anywhere (like microservices or web apps), so...

✅ We repackage the app:

✅ Your compiled code (.class files)

✅ All 3rd-party libraries (like Spring, MongoDB, etc.)

✅ Configurations (like application.properties)

✅ Embedded server (like Tomcat)

All packed into one executable .jar file.

🔁 When does it happen?
When you run this:

bash
Copy
Edit
mvn package
Spring Boot (using the spring-boot-maven-plugin) will:

Compile your code

Gather all dependencies

💥 Repackage them into a single .jar file

📦 Example
Let's say you have a project with:

Your code

Spring Boot

MongoDB driver

👉 After mvn package, you'll get:

bash
Copy
Edit
target/myjournalapp-0.0.1-SNAPSHOT.jar
You can now run it anywhere using:

bash
Copy
Edit
java -jar target/myjournalapp-0.0.1-SNAPSHOT.jar
You don’t need to install Spring, MongoDB driver, or Tomcat. All are already inside that JAR.

📌 Summary
Term	Meaning
Repackaging	Packing your app + libraries into one .jar
Why?	So it runs independently without needing external setup
When?	Happens during mvn package (or Gradle's bootJar)
Tool used	spring-boot-maven-plugin or spring-boot-gradle-plugin
Result	One .jar file with everything you need to run the app









     */


}
