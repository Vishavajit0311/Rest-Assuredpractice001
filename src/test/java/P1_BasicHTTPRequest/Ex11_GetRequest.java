package P1_BasicHTTPRequest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Ex11_GetRequest {

    @Test
    public void Tc2_getReqiest()
    {
        given()
                .contentType("Application/json");
        when()
                .get("http://localhost:3000/students/1")
        .then()
                .statusCode(200)
                .log().all();

    }
}
