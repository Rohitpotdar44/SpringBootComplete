package Relationships_6;

public class RelationshipDemo_1 {
// basically we are building  login functionality for uses
// in db there are several users so correct user will show only it's corresponding journals
// basically we are started to build connection between JournalEntry and User through this (so basically we are building this authentication)

//    ******* See myJournalApp
// means basically for the authentication purpose we have to make a link between the journalEntry and Users
// now write that all repo,service,controller for user
// key concepts are @DBRef (to make a link between the journalEntry and Users) and @Indexed(unique = true) (to make username unique)

// now we doesn't encode that password yet so we are seeing that now
    // and also we are making use of that link we made between them


    // now in JournalEntryController_Copy_7 we write methods that curd operations on the journal entries present in it
    // but we have to make crud operations according to the user
    // so change that methods
    // for changing that methods , changing them in service is the good practice instead of controller

    // 1) that GetMapping
    // 2) PostMapping
    // 3) GetById is same as it is because there is no need of user here ( we are seeing this later when we are dealing with authentication (username and password)
    // 4) DeleteMapping -> aslo there is one concept called as cascade delete -> see it



    //**********************************************
    /*
      TRANSACTIONAL


       SEE TRANSACTIONAL IS NOTHING BUT THE IF WE APPLY @Transactional to any class then
      then spring recognise that all the stuff written in that class consider it as a one container and implement at once
      means if error occur in between to any particular statement then entire operation should not be executed
      and successful operations should be roll back

       now the question is who manage this transactions so it is managed by Platform transaction manager interface
      which implements MongoTransactionManager which contains all necessary methods and it takes the implementation of
      MongoDatabaseFactory which handles all db related operations

      for that purpose in main method we have to write ( Not always in the main method, but rather in your Spring config or application class, you'd configure the transaction manager as a bean.)
        @Bean
MongoTransactionManager transactionManager(MongoDatabaseFactory dbFactory) {
    return new MongoTransactionManager(dbFactory);
}
        @EnableTransactionManagement also in main method

     we encountered with this error Transaction numbers are only allowed on a replica set member or mongos' on server localhost:27017.
     because on localhost in mongodb to transaction to happen it requires *****replication****  , and atlas provies this

     so to manage transactions we make a use of mongo atlas  -> and write related info in application properties



    @Transactional in Spring is used to define a block of code (usually a method) as a single unit of work. If any part of that unit fails, the entire unit rolls back.

In the case of MongoDB, transactions are managed by MongoTransactionManager, which implements PlatformTransactionManager. It requires a MongoDatabaseFactory to interact with the database.

However, transactions only work in MongoDB if the database is part of a replica set. When running MongoDB locally (standalone), you will get the error:
"Transaction numbers are only allowed on a replica set member..."

To avoid this, you can use MongoDB Atlas, which has built-in replica set support. Make sure your application.properties or application.yml contains the proper connection URI for Atlas.









    **************************************************************
    then go to atlas -> make account
    it gives username and password then uri
    paste that uri in the application properties
    so it links collection
    then check yo


     */








}
