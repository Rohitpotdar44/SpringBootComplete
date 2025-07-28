package API_14;

public class API {

//REFER API RESPONSE , API SERVICE PACKAGE AND USER CONTROLLER LAST METHOD -> FOR THE GET METHOD
    // FOR THE POST METHOD JUST REPLACE THAT RESPONSE ENTITY NULL TO
    /*
    User user = User.builder() .userName ("Vipul") .password ("Vipul") .build();
HttpEntity<User> httpEntity = new HttpEntity<>(user);
ResponseEntity<WeatherResponse> response = restTemplate.exchange(finalAPI, HttpMethod.POST, httpEntity, WeatherResponse.class);


NOW PASSING THROOUGH HEADERS  , HEADER MEANS NOTHING BUT IT IS THE EXTRA INFORMATION
AND ACCORDING TO API WE HAVE TO WHETHER PASS IN BODY OR HEADER

BASIC WORKING
HttpHeaders httpHeaders = new HttpHeaders();

httpHeaders.set("key", "value");

User user = User.builder().userName("Vipul").password("Vipul").build();
HttpEntity<User> httpEntity = new HttpEntityk>(user, httpHeaders);




NOW USING 11 LABS API


NOW NEXT PART IS @Sevice and @Component annotation

see both service and component are used to create beans because as in service there is the business logic it is the best practice to annotatae it with @Service




    NOW NEXT CONCEPT IS @Value annotation

    is Syntax is @Value("${propertyName}")

    see we are writing any sensitive data like api key in normal file and push it on git hub

    so to avoid this and the property related to it in the application.yml and use there




     */

}
