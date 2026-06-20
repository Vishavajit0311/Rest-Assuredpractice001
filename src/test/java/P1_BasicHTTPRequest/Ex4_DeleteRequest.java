package P1_BasicHTTPRequest;
import org.testng.annotations.Test;
import java.util.HashMap;
import java.util.LinkedHashMap;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class Ex4_DeleteRequest
{
    @Test
    public void Tc_PostRequest()
    {
        given()
                .contentType("application/json")
        .when()
                .delete("http://localhost:3000/students/2")
        .then()
                .statusCode(200)
                .log().all();
    }
}
