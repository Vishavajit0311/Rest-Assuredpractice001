package P1_BasicHTTPRequest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class Ex1_GetRequest1
{

//    @Test
//    public void Tc1_getRequest()
//    {
//        given()
//                .contentType("application/json")
//        .when()
//                .get("http://localhost:3000/students/1")
//        .then()
//                .statusCode(200)
//                .log().all();
//
//    }

    @Test
    public void  TC2_getRequest()
    {
        given()
                .contentType("applictiona/json")
        .when()
                .get("http://localhost:3000/students/4")
        .then()
                .statusCode(404)
                .log().all();
    }
}


