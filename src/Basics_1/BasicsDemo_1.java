package Basics_1;

public class BasicsDemo_1 {

    /*
     * Spring Boot is a framework for
     * building applications in the Java
     * programming language.
     *
     * Spring Boot makes it easy to create
     * stand-alone, production-grade Spring
     * based Applications that you can
     * just run
     *
     *
     * The core Spring framework already
     * reduces boilerplate code and provides
     * a lot of helpful features for Java
     * applications.
     *
     *
     * However, Spring Boot takes this convenience
     * to the next level by focusing specifically on
     * reducing the effort required to set up and
     * configure a Spring application.
     *
     *
     * While Spring does simplify many tasks like
     * creating web applications,
     * working with databases,
     * managing transactions and more
     *
     *
     * But setting up a Spring project can
     * still involve quite a bit of manual
     * configuration.
     *
     *
     *
     *
     *
     *
     *
     *
     *
     * Spring Boot Advantages -
     *
     * Auto-Configuration - Inbuilt tomcat server
     *
     * Standalone Applications - Runs independently on a device or system without
     * needing a web browser or external server.
     *
     *
     *
     *
     * // Without Spring Boot, setting up a basic RESTful API requires manual
     * configuration.
     *
     *
     * // Controller
     *
     * @RestController
     *
     * @RequestMapping("/api")
     * public class MyController {
     *
     * @GetMapping("/hello")
     * public String sayHello() {
     * return "Hello from Spring!";
     * }
     * }
     * // Application Main
     * public class SpringApp {
     * public static void main(String[] args) {
     * ApplicationContext context = new
     * AnnotationConfigApplicationContext(MyController.class);
     * }
     * }
     *
     *
     *
     * // basically here we have to make a use of ApplicationContext , it proides
     * bean , bean means they store obj like Student student = new Student() , when
     * it is in bin then we can reuse it , doesn't need to create new every time
     * // but  we have to do this all manual work in spring , which is not the case in the springboot
     *
     *
     *
     *
     *
     * We use the @SpringBootApplication
     * annotation on the main class. This single
     * annotation replaces the need for setting
     * up a manual Spring application context.
     *
     *
     * import org.springframework.boot.SpringApplication;
     * import org.springframework.boot.autoconfigure.SpringBootApplication;
     * import org.springframework.web.bind.annotation.GetMapping;
     * import org.springframework.web.bind.annotation.RestController;
     * // With Spring Boot, the setup process is greatly simplified.
     * // Controller
     *
     * @RestController
     *
     * @SpringBootApplication
     * public class SpringBootApplicationExample {
     *
     * @GetMapping("/api/hello”)
     * public String sayHello() {
     * return "Hello from Spring Boot!";
     *
     *
     * public static void main(String[] args) {
     * SpringApplication.run(SpringBootApplicationExample.class, args);
     *
     * }
     *
     *
     * here SpringBootApplication does it all without any manual work
     *
     * We no longer need to explicitly create an
     * application context using
     * AnnotationConfigApplicationContext as
     * Spring Boot handles that behind the
     * scenes.
     *
     *
     * We use SpringApplication.run() to start
     *
     * the application, and Spring Boot takes
     *
     * care of configuring the embedded web
     * server and other necessary components.
     *
     *
     *
     * The @SpringBootApplication annotation
     * alone brings in a lot of pre-configured
     * features, including
     * automatic component scanning and
     * embedded server configuration,
     * which would have required more steps in
     * traditional Spring setup.
     *
     *
     *
     *
     *
     *
     *
     */


}
