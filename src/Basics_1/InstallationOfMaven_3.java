package Basics_1;

public class InstallationOfMaven_3 {

// install maven (binary link -> zip)
// extract
//copy path upto bin
// goto env
// set everything in system variables(at bottom)
// mvn -version


// Maven Build banane ke kam ata hai (Means Maven is the build automation toll) and dependencies ko manage karta hai
//A build is the process of converting your source code (Java + resources) into a deliverable format — usually a .jar or .war file — that can be run or deployed.
//Maven manages dependencies using the pom.xml file.

// Maven is a build automation and project management tool used in Java projects.
//
//🔹 Simple Definition:
//Maven helps you manage your project’s dependencies, build process, and project structure using a standard configuration file called pom.xml.




// Explanation for dependencies part


// if we want to use any external library or dependency then we have manually download it's jar file and import it , but maven has this in built functionality

// e.g open csv   -> search maven open csv -> then 1st website then latest version-> copy that code and paste it in pom.xml -> then reload maven -> then in ext depen we can seen open csv
// just copy that dependency and put in pom.xml that's it



// Explanation for build automation tool part


/*

 A Build Lifecycle is Made Up of Phases
 Each of these build lifecycles is defined by a different list of build phases, wherein a build phase represents a stage in
 the lifecycle.
 For example, the default lifecycle comprises of the following phases (for a complete list of the lifecycle phases, refer to
 the Lifecycle Reference):

 = validate - validate the project is correct and all necessary information is available
 = compile - compile the source code of the project
 =test -test the compiled source code using a suitable unit testing framework. These tests should not require the  code be packaged or deployed
 = package - take the compiled code and package it in its distributable format, such as a JAR.
 = verify - run any checks on results of integration tests to ensure quality criteria are met
 = install -install the package into the local repository, for use as a dependency in other projects
 = deploy - done in the build environment, copies the final package to the remote repository BR developers and projects.


// now to see run following commands


//1) firstly come into the working directory

 then
       1] mvn validate
       2] mvn compile
       3] mvn test
       4] mvn package
       now inside target jar file is created
       so by doing java -jar [that name of jar file] -> so by doing this also we can run the spring boot project
       5] mvn install
       6] mvn clear



    ✅ 1) mvn validate
Checks if your project is correct and ready to build.

It checks if pom.xml is fine and required files/directories exist.

Doesn’t compile anything.

🧠 Think of it as a basic project health check.

✅ 2) mvn compile
Compiles the Java source code in your project.

Converts .java files → .class files (bytecode).

Stores the .class files in the target/classes folder.

🧠 It’s like turning your code into a form the JVM understands.

✅ 3) mvn test
Runs unit tests written in your project.

Executes code inside src/test/java.

Uses testing frameworks like JUnit.

🧠 Checks if your functions behave correctly before packaging.

✅ 4) mvn package
Creates a .jar (or .war) file of your project.

After compiling and testing, it bundles the app into one file inside the target/ folder.

🧠 It’s like zipping your entire app into a single file to run or deploy.

🟢 Now you can run it using:
bash
Copy
Edit
java -jar demo-0.0.1-SNAPSHOT.jar
✅ 5) mvn install
Installs the JAR into your local Maven repository (usually in ~/.m2/repository)

This allows other local Maven projects to use it as a dependency.

🧠 It’s like saving your built app in your computer’s local app library. (it's like saving that open csv that we use locally inside that m2 directory and uses whenever required later )

✅ 6) mvn clean
(You wrote clear, but the correct word is clean)

Deletes the target/ folder

Removes compiled code, JARs, reports, etc.

Useful when starting a fresh build.

🧠 It resets the build — like cleaning your desk before starting work again.


















 */





}

