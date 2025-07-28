package logging_12;

public class logging_1 {
    /*
    see if there is one condition like let's say one api is working fine locally but not on production the we check this logs

    logging is an essential aspect of application
development that allows developers to monitor
and troubleshoot their applications.

Spring Boot supports various logging
frameworks, such as Logback, Log4j2, and
Java Util Logging (JUL)

Logback: A popular logging framework that serves as the default in many Spring Boot
applications. It offers a flexible configuration and good performance.

Log4j2: Another widely used logging framework with features such as asynchronous
logging and support for various output formats.

Java Util Logging (JUL): The default logging framework included in the Java Standard
Edition. While it's less feature-rich than some third-party frameworks, it is
straightforward and is part of the Java platform.


Spring Boot comes with a default logging
configuration that uses Logback as the default
logging implementation. It provides a good
balance between simplicity and flexibility.


The default configuration is embedded
within the Spring Boot libraries, and it may
not be visible in your project's source code.

If you want to customize the logging
configuration, you can create your own logback-
spring.xml or logback.xml file in the
src/main/resources directory. When Spring Boot
detects this file in your project, it will use it
instead of the default configuration.


and whatever that we seen in the terminal is itself a log
e.g
025-07-24(date) 19:35:51.247(time)  INFO(status - info/error ,etc)  120360(process id) --- [           main](thread) c.R.myJournalApp.JournalApplication_1(package)   (log) --->> : Starting JournalApplication_1 using Java 20.0.2 on OMEN16 with PID 120360 (D:\



logging levels--->
Logging levels help in categorizing log
statements based on their severity. The
common logging levels are
TRACE
DEBUG
INFO
WARN
ERROR

severity leveles are form top to bottom ,
if we set logging level is TRACE the others below trace also shows
but if we set to error then it will show only error
 it cam be set in xml/yml file

We can set the desired logging level
for specific packages or classes,
allowing them to control the amount
of information logged at runtime.

By default,
logging is enabled for
INFO

WARN

ERROR




Spring Boot provides annotations like
@Slf4j & @Log4j2

that you can use to automatically inject
logger instances into your classes



private static final Logger logger = LoggerFactory.getLogger(JournalEntryService. class);
instead of this just write @Slf4j  ( like @Data in lombok)

write this in the class you wanted to implement the log

see we can use sysout to print but the lig provides more flexibility

    slf4j-> simple logging fasad 4 java



Spring Boot allows us to configure logging
using properties or YAML files


BY DEFAULT INFO , ERROR , WARN IS ENABLED
TRACE & DEBUG IS NOT  so to enable it use logback.xml / application.yml

we can alos off for particular file

logging:
 level:
net:
engineeringdigest:
journalApp:
service:
UserService: OFF


but good practive to create logback.xml file in resouces and write all logs their itself

     */
}
