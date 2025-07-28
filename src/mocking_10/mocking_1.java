package mocking_10;

public class mocking_1 {

    /*

    Mockito -


     see in normal scenarios if we want to test or implement any method ,  outside that class the then
     then we have to make a use of @Autowired means we have to like import it

        consider this e/g below see we have too small applcation now but in the bigger projects it's makes the lot of delay to load


     public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User_12 user = userRepository13.findByUserName(username);  // so instead of getting from this in db we make a use of mock to give any dummy variable

        // and directly able to test this
        if (user != null) {
            // now it ask for UserDetails so
            return org.springframework.security.core.userdetails.User.builder()
                    .username(user.getUserName())
                    .password(user.getPassword())
                    .roles(user.getRoles().toArray(new String[0]))  // if the size of array is  greater than 0 then it will resize itself
                    .build();

        } else {
                throw new UsernameNotFoundException("User not found"+username);
        }
    }



        see means basic purpose of this is while perform any operation like testing
        if we don't want to always make the connection with the database and bringing this from database
        and want to run things independently and faster the we make use of mock

        there three main annotations used
        @Mock -> when wants to deal with spring context ( normal way )
        @MockBean  -> do not wants to deal with spring context ( independently )
        @InjectMock  -> do not wants to deal with spring context ( independently )

        for more details see userServiceDetailsImplTests


     */


}
