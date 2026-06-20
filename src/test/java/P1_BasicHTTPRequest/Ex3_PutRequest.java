package P1_BasicHTTPRequest;
import org.testng.annotations.Test;
import java.util.HashMap;
import java.util.LinkedHashMap;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class Ex3_PutRequest
{
    @Test
    public void Tc_PostRequest()
    {
        LinkedHashMap data= new LinkedHashMap();
        data.put("id","3");
        data.put( "name","SHIVA");
        data.put("location", "PUNE");
        data.put("phoneNo", "787874664");

        String [] courses={"JAVA","SELENIUM"};
        data.put("course", courses);

        given()
                .contentType("application/json")
                 .body(data)
        .when()
        .put("http://localhost:3000/students/3")
                .then()
                .statusCode(200)
                .log().all();
    }
}
