import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SmokeTest {

    String ApiUrl = "http://universities.hipolabs.com/search";

    @Test
    void ApiResponse() {
        Response response = RestAssured.get(ApiUrl);
        System.out.println(ApiUrl);
        int StatusCode = response.statusCode();
        Assert.assertEquals(StatusCode, 200);

    }

}
