package ResponseEntity_4;

public class ResponseEntity_1 {


    // if we want http code with the API response then we will make as use of ResponseEntity
    // there is one sign like 200 Ok Request successful. The server has responded as required.
    // it tells that there is no error at server side
    // consider postman as client and Tomcat server processing it's requests so by seeing OK postman knows status
    // but whatever we done yet in every case we get 200 OK
    // we we will fix it later
    // these are various types of codes , mentioned here





    /*
    HTTP status code -----

An HTTP status code is a three-digit numeric code
returned by a web server as part of the response to an
HTTP request made by a client

HTTP status codes are grouped into
five categories based on their first
digit




1xx (Informational)
---->
These status codes indicate that the request was received
and understood, and the server is >>>>continuing to process it.<<<<<<
These are typically used for informational purposes and
rarely seen in practice.



2xx (Successful)

--->>>
These status codes
indicate that the request
was successfully received,
understood, and >>>>>processed by the server<<<<<


200 OK: The request has been successfully processed, and the
server is returning the requested resource. (like when GET )

201 Created: The request has been fulfilled, and a new resource
has been created as a result. (like when POST )

204 No Content: The request was successful, but there is no
response body (typically used for operations that don't return
data, like a successful deletion). (like when DELETE )



 3xx (Redirectional):
 -->>

 These status codes indicate that further action
is needed to complete the request. They are
used when the client needs to take additional
steps to access the requested resource.


301 Moved Permanently: The requested resource has been permanently moved to a
different URL.

302 Found : The HTTP status code 302 indicates that the requested resource has been
temporarily moved to a different URL. When a server sends a response with a 302 status
code, it typically includes a Location header field that specifies the new temporary URL
where the client should redirect to.

304 Not Modified: The client's cached version of the requested resource is still valid, so
the server sends this status code to indicate that the client can use its cached copy.



4xx (Client Error)
---> These status codes indicate that there was an
error on the client's part, such as a malformed
request or authentication issues.


400 Bad Request: The server cannot understand or
process the client's request due to invalid syntax or other
client-side issues.

401 Unauthorized: The client needs to provide
authentication credentials to access the requested
resource.

403 Forbidden: The client is authenticated, but it does not
have permission to access the requested resource.








5xx (Server Error)
----->>>

These status codes indicate that there was
an error on the server's part while trying to
fulfill the request.


500 Internal Server Error: A generic error message indicating that
something went wrong on the server, and the server could not handle the
request.

502 Bad Gateway: The server acting as a gateway or proxy received an
invalid response from an upstream server.

503 Service Unavailable: The server is currently unable to handle the
request due to temporary overloading or maintenance.





OK NOW WE SEEN THAT ALL HTTP STATUS CODES BUT HOW TO SEND IT WITH THE OUR CONTROLLER METHODS SUCH AS GET MAPPING
WE CAN DO IT BY ****RESPONSE ENTITY *******


The ResponseEntity class is part of
the Spring Framework and is
commonly used in Spring Boot
applications to customize the HTTP
response.


It provides methods for setting the
response status, headers, and body. You
can use it to return different types of data
in your controller methods, such as JSON,
XML, or even HTML.


You can use generics with
ResponseEntity to specify
the type of data you are
returning.



     */




}
