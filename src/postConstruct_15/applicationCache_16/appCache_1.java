package postConstruct_15.applicationCache_16;

public class appCache_1 {


/*
see we hvae to handle frequently used and changing configuration


so currently we are using only static field and then we are hard coded -> ya it reduces the complexity and operations but not providing the flexibility

second oprion is to store in db but problem is we have to bring data from db frequently

so to solve this problem we are using appCache which bring data from db and put in java file


so for that purpose we are basically creating one collection in the mongodb and in the insert doc we are writin greq fields like key(whether_api) and value (that url)

then create pojo for appCache ( class and repository)

see code better



then we have to re run app mainy time for we are creating controller for that init method in admin controller





 */







}
