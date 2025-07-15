package Basics_1;

public class InternalWorking_5
{

/*

in java we manually creates obj as Student student=new Student();

but in spring boot this is not the case we go to Spring IOC (Inversion of control) and it gives us the obj
so we are externalize the creation of the obj



******************
IOC container keeps the record of all classes and  objs

so in spring boot control is inverted now



********************
Application Context is the way to implement the IOC container


in short when we want obj then we go to IOC container we can also called it as application context becaz it is a way to implement it



********Now how IOC Container knows the all info about class

bacaz IOC container scans entirely and then it searches for @Component annotation when it founds this anotation it keep it in IOC Container

@Component is the annotation that provides info , and it can be also used for fields, classes, interfaces ,methods

@Component is an annotation used to mark a Java class as a Spring-managed component.

A bean is any object that is managed by the Spring container.

@Component is like adding a person to a guest list.

The bean is the person who actually enters the party (Spring container).

so bean means obj in IOC container

so anything that contains @Component is bean so we don;t need to create or initialize it every time





***********now @SpringBootApplication*************

IT IS WRITTEN FOR THE MAIN METHOD ONY(WHICH IS THE ENTRY POINT OF THE PROGRAM)


---now what @SpringBootApplication do -
it basically does following three tasks (means it does the work of three diff annotations by itself )

such as -->

@Configuration  ---> if we write configuration on any class then we are able to create beans with the help of function
@EnableAutoConfiguration   --> it automates the configuration means we put mongodb's dependencies in com.xml and in application properties we gie it's port creds , then spring boot does all config
@ComponentScan ---> scan beans (IOC Container / Application Context)

               ---> now while scanning there is one obvious case that particular class or .... we want to scan must reply under base package (entry of program) in our case base package is package com.rsp.demo

                **********************
                ---> see Car and MyClass e.g
















 */




}
