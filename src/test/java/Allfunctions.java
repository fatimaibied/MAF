import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;


public class Allfunctions {


    public static   String AddTheParametersInApi( String Parameter) {
        DataFile data=new DataFile();
        String ApiUrl = data.ApiUrl;
        String ParametersValue=null;

        String ApiUrlWithParameters;

            switch (Parameter) {
                case "alpha_two_code":
                    ParametersValue = data.alpha_two_code;
                    break;
                case "domains":
                    ParametersValue = data.domains;
                    break;
                case "country":
                    ParametersValue = data.country;
                    break;
                case "state-province":
                    ParametersValue = data.state_province;
                    break;
                case "web_pages":
                    ParametersValue = data.web_pages;
                    break;
                case "name":
                    ParametersValue = data.name;
                    break;
                default:
            }
            ApiUrlWithParameters = ApiUrl + "?" + Parameter + "=" + ParametersValue;
            System.out.println(ApiUrlWithParameters);

        return ApiUrlWithParameters;
    }


    public static   String AddTwoParametersInApi( String Parameter1 ,String Parameter2) {
        DataFile data=new DataFile();
        String ApiUrl = data.ApiUrl;

        String [] ParametersValue= new String[2];
        String ApiUrlWithParameters;

        String [] All = new String[2];

        All[0] =Parameter1;
        All[1] =Parameter2;

    for (int i=0; i<All.length;i++){
        switch (All[i]) {
            case "alpha_two_code":
                ParametersValue[i] = data.alpha_two_code;

                break;
            case "domains":
                ParametersValue[i]= data.domains;
                break;
            case "country":
                ParametersValue[i]= data.country;
                break;
            case "state-province":
                ParametersValue[i]= data.state_province;
                break;
            case "web_pages":
                ParametersValue [i] = data.web_pages;
                break;
            case "name":
                ParametersValue [i]= data.name;
                break;

        }}
        ApiUrlWithParameters = ApiUrl + "?" + All[0] + "=" + ParametersValue[0]+"&"+ All[1] + "=" + ParametersValue[1];
        System.out.println(ApiUrlWithParameters);

        return ApiUrlWithParameters;
    }
    public static void assertResponce(String  ApiUrl,String AssertTrue) {

        Response response = RestAssured.get(ApiUrl);
        String body=response.getBody().asString();
        Assert.assertTrue(body.contains(AssertTrue));


    }

    public static void assertResponceTwoParameters(String  ApiUrl,String AssertTrueP1 ,String AssertTrueP2) {

        Response response = RestAssured.get(ApiUrl);
        String body=response.getBody().asString();
        Assert.assertTrue(body.contains(AssertTrueP1));
        Assert.assertTrue(body.contains(AssertTrueP2));


    }
}
