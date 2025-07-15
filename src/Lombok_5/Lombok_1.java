package Lombok_5;

public class Lombok_1 {

/*
Lombok is a popular library in
the Java ecosystem, often used
in Spring Boot applications.



It aims to reduce the boilerplate
code that developers have to write,
such as getters, setters,
constructors, and more.


Lombok achieves this by generating this
code automatically during compilation,
based on annotations you add to your
Java classes.


public class JournalEntry_6 {
// now entry has it's id , title  , content
    // now to map id as primary key give @Id annotation
    @Id
    private ObjectId id;
    private  String title;
    private String content;
    private LocalDateTime localDateTime;
}

means our entity class only look like this , rest of it is generated during compilation by lombok

Lombok generates bytecode for methods like getters,
setters, constructors, equals(), hashCode(), and
toString(), as specified by the annotations used in
your code. This generated code is added to the
compiled class files (.class files)


The Java Compiler compiles your classes, including the
generated code. This means that the generated methods
become part of your compiled class files.

When you run your application, the generated
methods are available for use, just like any other
methods in your classes.


basically lombok scans for specific annotations and generates at compile time

such as
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Builder


*************************
@Data ->>>Equivalent to @Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndWashCode. |

so instead of that all write only @Data
 */

}
