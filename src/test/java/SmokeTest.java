import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SmokeTest {

    DataFile data=new DataFile();
    String ApiUrl= data.ApiUrl;

    //Send the api and check the response
    @Test
    void ApiResponse() {
        Response response = RestAssured.get(ApiUrl);
        System.out.println(ApiUrl);
        int StatusCode = response.statusCode();
        Assert.assertEquals(StatusCode, 200);

    }

}
