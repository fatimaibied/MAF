import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;


public class FunctionalTest {
     DataFile data=new DataFile();
    String ApiUrl= data.ApiUrl;
    String AssertTrue;
    String AssertFalse;


    //Test Case 1: Check the Api Response Code
    @Test
    void ApiResponse() {
        Response response = RestAssured.get(ApiUrl);
        System.out.println(ApiUrl);
        int StatusCode = response.statusCode();
        Assert.assertEquals(StatusCode, 200);

    }

    //Test Case 2: Searching using the Api Parameter "alpha_two_code"
    @Test
    void alpha_two_code() {
        AssertTrue = data.alpha_two_code;

        ApiUrl = Allfunctions.AddTheParametersInApi("alpha_two_code");
        Allfunctions.assertResponce(ApiUrl, AssertTrue);
    }

    //Test Case 3: Searching using the Api Parameter "domains"
    @Test
    void domains() {
        AssertTrue = data.domains;

        ApiUrl = Allfunctions.AddTheParametersInApi("domains");
        Allfunctions.assertResponce(ApiUrl, AssertTrue);

    }

    //Test Case 4: Searching using the Api Parameter "country"
    @Test
    void country() {
        AssertTrue = data.country;

        ApiUrl = Allfunctions.AddTheParametersInApi("country");
        Allfunctions.assertResponce(ApiUrl, AssertTrue);


    }

    //Test Case 5: Searching using the Api Parameter "state-province"
    @Test
    void state_province() {
        AssertTrue = data.state_province;

        ApiUrl = Allfunctions.AddTheParametersInApi("state-province");
        Allfunctions.assertResponce(ApiUrl, AssertTrue);

    }

    //Test Case 6: Searching using the Api Parameter "web_pages"
    @Test
    void web_pages() {
        AssertTrue = data.web_pages;

        ApiUrl = Allfunctions.AddTheParametersInApi("web_pages");
        Allfunctions.assertResponce(ApiUrl, AssertTrue);

    }

    //Test Case 7: Searching using the Api Parameter "name"
    @Test
    void name() {
        AssertTrue = data.name;
        ApiUrl = Allfunctions.AddTheParametersInApi("name");
        Allfunctions.assertResponce(ApiUrl, AssertTrue);

    }

    //Test Case 8: Searching using two Parameters
    @Test
    void Two_Parameters() {
        int l=data.AllParameters.length;

        for (int i=0; i<l;i++)
        {
            for (int j=0; j<l;j++)
            {
              if (i!=j)
              {
                  String p1=data.AllParameters[i];
                  String p2=data.AllParameters[j];
                  String AssertTrueP1=data.AllParametersValues[i];
                  String AssertTrueP2=data.AllParametersValues[j];
                  ApiUrl = Allfunctions.AddTwoParametersInApi(p1,p2);
                  Allfunctions.assertResponceTwoParameters(ApiUrl, AssertTrueP1 ,AssertTrueP2);


              }

            }
        }

    }
}