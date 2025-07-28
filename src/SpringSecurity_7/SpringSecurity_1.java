package SpringSecurity_7;

public class SpringSecurity_1 {
/*

    see whatever we done yet is regarding the username and we don't make a use of password in our logic

    and also it is not a good practice to write that username in the api to pass it is not secure

    so to add the security we are going to learn the Spring Security


        Spring Security is a powerful and highly
customizable security framework that is often
used in Spring Boot applications to handle
authentication and authorization.

Authentication --->
The process of verifying a user's identity
(e.g., username and password)

Authorization -->
The process of granting or denying access to
specific resources or actions based on the
authenticated user's roles and permissions.


how to add(configure ) the spring spring security add this dependency
<dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-security</artifactId>
</dependency>


Once the dependency is added, Spring
Boot's auto-configuration feature will
automatically apply security to the
application.

By default, Spring Security
uses HTTP Basic
Authentication.

The client sends an Authorization header (lest side of that body in postman)
Authorization: Basic <encoded-string>
The server decodes the string, extracts the
username and password, and verifies them. If
they're correct, access is granted. Otherwise, an
"Unauthorized" response is sent back.

Encoding--->
Credentials are combined into a string like
username:password
which is then encoded using Base64


By default, all endpoints will be secured.
Spring Security will generate a default user
with a random password that is printed in the
console logs on startup.

#if we are not giving the password here then springboot give it us in the console
# and we can give the username in the postman also
and then after successful auth we are able to get the entries
now we are secured our endpoints but we are using only one password so we need customization

so we write the one Configuration class for that purpose


why there is need of this class-> we are secured all endpoints through the process earlier
but if we want to secure the particular one , or we earlier using only one user so to configure this things we require this configuration class


@Configuration -> for beans
@EnableWebSecurity    ---> This annotation signals Spring to enable its web security support. This is what makes your application secured. It's used in conjunction with @Configuration. (basically it customize the spring security)
public class SecurityConfig extends WebSecurityConfigurerAdapter {  ---> WebSecurityConfigurerAdapter is a utility class in the Spring Security framework that provides default configurations and allows customization of certain features. By extending it, you can configure and customize Spring Security for your application needs.
@Override
protected void configure(HttpSecurity http) throws Exception {
http
.authorizeRequests()
.antMatchers("/hello").permitAll()
.anyRequest( ).authenticated()
.and()
.formLogin();
}
}


// create one package config and write this down there

@Configuration
@EnableWebSecurity


**************************
    and then we get error on WebSecurityConfigurerAdapter because it is deprecated in the latest verion so we are going to figure it out

    so instead of it use this
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{

    }

 The method filterChain(HttpSecurity http) is where you configure your app's security rules.

It tells Spring Security what to allow and what to block.

Think of it like a "gatekeeper" setup:
You're telling Spring:
🔒 "Who can enter?"
🚫 "What should be blocked?"
✅ "Which paths don't need login?"
🔐 "Do I need a login form?"


| Part                  | Meaning               | Simple Explanation                                                                                                                                                                                                           |
| --------------------- | --------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `public`              | Access Modifier       | This means the method can be accessed from **anywhere** in your Spring Boot project. It's visible to the framework (Spring) so it can call this method.                                                                      |
| `SecurityFilterChain` | Return Type           | This is a **Spring Security object** that contains your **security filters and rules**. It's what gets applied to incoming web requests to check who can access what.                                                        |
| `filterChain`         | Method Name           | This is just the **name of the method**. You can name it anything (like `securityConfig()`), but `filterChain` is a common name used in examples.                                                                            |
| `(HttpSecurity http)` | Method Parameter      | Spring gives you this `http` object. It’s like a **toolbox** that lets you write your security rules — like `.authorizeHttpRequests()` and `.formLogin()`.                                                                   |
| `throws Exception`    | Exception Declaration | If something goes wrong in configuration (e.g. a method fails), this allows it to **throw an exception** instead of crashing the app. It's required because Spring methods like `http.build()` may throw checked exceptions. |


// Explanation of the components in that filterChain method



http.authorizeRequests(): This tells Spring Security to start authorizing the requests.

.antMatchers("/hello”).permitAll(): This part specifies that HTTP requests matching the path
/hello should be permitted (allowed) for all users, whether they are authenticated or not.

.anyRequest().authenticated(): This is a more general matcher that specifies any request
(not already matched by previous matchers) should be authenticated, meaning users have
to provide valid credentials to access these endpoints.

.and(): This is a method to join several configurations. It helps to continue the configuration
from the root (HttpSecurity).

.formLogin(): This enables form-based authentication. By default, it will provide a form for
the user to enter their username and password. If the user is not authenticated and they try
to access a secured endpoint, they'll be redirected to the default login form.


*************************************************************
But no worries now we downgraded our springboot version so we are able to use WebSecurityConfigurerAdapter -> it only shows  us warnings but it is ok

<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>2.7.18</version> <!-- ← downgrade here -->
    <relativePath/> <!-- lookup parent from repository -->
</parent>
this is how we downgrade our version













***************
. means method chaining


http
.authorizeRequests()
.antMatchers("/hello").permitAll() ; // apply on return type of http .authorizeRequests()
.anyRequest( ).authenticated() // apply on return type of  .antMatchers("/hello").permitAll()
.and() : // again we    go to http and then we apply .formLogin(); on it
.formLogin();


You can access /hello without any
authentication. However, if you try to
access another endpoint, you'll be
redirected to a login form.

When we use the .formLogin() method in our
security configuration without specifying
loginPage("/custom-path"), the default login
page becomes active.


Spring Security provides an in-built
controller that handles the /login path. This
controller is responsible for rendering the
default login form when a GET request is
made to /login.

By default, Spring Security also provides logout
functionality. When .logout() is configured, a
POST request to /logout will log the user out and
invalidate their session.

Basic Authentication, by its
design, is stateless.

Stateless means see we are passing the username and password in the header by encrypting it ,
but if we have to send the request again then we have to send the request from scratch
in short the request doesn't aware about what it's previous request does

Some applications do mix Basic Authentication with session
management for various reasons. This isn't standard behavior and
requires additional setup and logic. In such scenarios, once the
user's credentials are verified via Basic Authentication, a session
might be established, and the client is provided a session cookie.
This way, the client won't need to send the Authorization header
with every request, and the server can rely on the session key
to identify the authenticated user.


When you log in with Spring Security, it manages your authentication across multiple requests, **despite
HTTP being stateless.**

1.Session Creation: After successful authentication, an HTTP session is formed. Your authentication
details are stored in this session. (session means basically to remember things)

2.Session Cookie: A JSESSIONID cookie is sent to your browser, which gets sent back with subsequent
requests, helping the server recognize your session.

3.SecurityContext: Using the JSESSIONID, Spring Security fetches your authentication details for each
request.

4.Session Timeout: Sessions have a limited life. If you're inactive past this limit, you're logged out.

5.Logout: When logging out, your session ends, and the related cookie is removed.

6.Remember-Me: Spring Security can remember you even after the session ends using a different
persistent cookie (typically have a longer lifespan) .

In essence, Spring Security leverages sessions and cookies, mainly JSESSIONID, to ensure you remgak
authenticated across requests.


We want our Spring Boot application to
authenticate users based on their
credentials stored in a MongoDB database.

This means that our users and their
passwords (hashed) will be stored in
MongoDB, and when a user tries to log in, the
system should check the provided
credentials against what's stored in the
database.       ( which is done by configure method itself ) so springboot does it automatically


now we are starting to work on our application that authenticate users based on their username and password
like username and passwords are stored in the atlas
so delete whatever present in the atlas and then creating two fresh users and then adding entries of each

so that purpose we are staring to write our filerChain method


Now we have to follow these four steps to complete the authentication->
basically we are storing that initial username and password entered by user in the mongodb and then at the time of auth we are checking it


[] A User entity to represent the user data model.

[] A UserRepository to interact with MongoDB.

[] userDetailsService implementation to fetch user details.

[] A configuration SecurityConfig to integrate everything with Spring Security.




    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/journalCopies/**") // ** is called wildcard pattern means any endpoint after journalCopies
                .authenticated()
                .anyRequest().permitAll()
                .and()
                .httpBasic();
    }



    now we write this method inside the configure  , but in the journalEntryController still we are passing usernames
    directly in the endpoint , and password is also not in hash format so we are now passing in the ***header*** itself


    1)  A User entity to represent the user data model.
            ---->>>>> now for the first task we need to create user entity
            nothing but that user entity class that we are already created
           ******* but have to add one more field in that is list of roles
           this is for the authorization purpose means which user can do what

            like this private List<String> roles;


    2) A UserRepository to interact with MongoDB.

        which is already done

        public interface userRepository_13 extends MongoRepository<User_12, ObjectId> {

    //  now we have to declare one method which returns Username ,  for that userName purpose
    User_12 findByUserName(String username); //
    // now create respective method in the services



    3) userDetailsService implementation to fetch user details.

    now for the userDetailsService in the springboot we have userDetailsService interface

    i.e
    public interface UserDetailsService {
    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}
        at it contains loadUserByUsername method so to use it's we have to create one class which implements this
        let's say userDetailsServiceImpl class

        now we have to write content in this for the user means if uer found the do what and if not then do what

    see that class



    4) A configuration SecurityConfig to integrate everything with Spring Security.

        we have already made SecurityConfig class but in that we written all about endpoints and all
        *** but nothing about user ***



// ok now we are done with these four steps

then also we are still left with the that endpoints problem like passing username in that header it self
so to fix this issue we have to modify the controllers in the journal entry controller

now before that we are able to see that in the user controller userService_14.saveEntry(userInDb); we are saving the user entry directly in the db
 // it's service method
 public void saveEntry(User_12 user12){          // service here uses save() method from the Repository
        userRepository_13.save(user12);
    }

    so here the problem is we are saving here password asa it is without encrypting them

    so for that purpose we have to do some modification
    like we have to make one implementation of the password encoder and then update the saveEntry  method accordingly


     *********************************************

     ok then upto this we are stored user password in encrypted format and all right

    now there is still one work is remaining that is that endpoints and that methods in the user and journal controller
    that we have to modify

    *******************
    now first we are doing this for the user

    so first change is there is getAllUsers() method in the userController we are removing for now
    because we write it later in the admin  i.e
     @GetMapping
    public List<User_12> getAllUsers(){
        return userService_14.getAllEntries();
    }

    now next there is
     @PostMapping

    public void addNewUser(@RequestBody User_12 myUser) {
        userService_14.saveEntry( myUser);
    }         now this should be public beacuse any one can create user and it not requires any type of auth

    so move it in publicController so are renaming the existing healthCheck to the public controller

    and then for the put method we are modifying it beacasue it should be authenticated and that endpoint should be modified for that



    ok now to update that put method we are firstly removing that endpoint and then

    now the concept here is in springboot the details of the authenticated user is managed and stored by SecurityContextHolder so we are making use of it


}


 */








}
