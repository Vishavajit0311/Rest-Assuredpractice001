package P1_BasicHTTPRequest;
import org.testng.annotations.Test;
import java.util.HashMap;
import java.util.LinkedHashMap;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class Ex2_PostRequest
{
    @Test
    public void Tc_PostRequest()
    {
        LinkedHashMap data= new LinkedHashMap();
        data.put("id","3");
        data.put( "name","Shive");
        data.put("location", "Pune");
        data.put("phoneNo", "78787");

        String [] courses={"java","selenium"};
        data.put("course", courses);

        given()
                .contentType("application/json")
                .body(data)
        .when()
                .post("http://localhost:3000/students")
        .then()
            .statusCode(201)
                .log().all();




    }
}
