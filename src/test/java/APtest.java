import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class APtest {

    @Test
    void test1(){

      Response response= RestAssured.get("http://universities.hipolabs.com/search");

      int StatusCode=response.statusCode();
        Assert.assertEquals(StatusCode,200);

    }

    @Test
    void test2(){

        Response response= RestAssured.get("http://universities.hipolabs.com/search");

        int StatusCode=response.statusCode();
        Assert.assertEquals(StatusCode,200);

    }

}
