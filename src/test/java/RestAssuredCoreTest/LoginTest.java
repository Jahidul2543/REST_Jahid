package RestAssuredCoreTest;

import com.jahid.RestAssueredCore.RESTCalls;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import utils.PayloadConverter;
import utils.Url;

import java.io.IOException;


public class LoginTest {
  Response response;
    @Test
   public void doLogin() throws IOException {
        String loginPayload = PayloadConverter.generateString("JiraLogIn.json");
        String endPointURI = Url.getEndPoint("/rest/auth/1/session");
        response = RESTCalls.POSTRequest(endPointURI, loginPayload);

        String stringResponse = response.getBody().asString();
        System.out.println("********Response************");
        System.out.println(stringResponse);

        JsonPath jsonPath = new JsonPath(stringResponse);
        String sessionID = jsonPath.get("session.value");
        System.out.println("SessionID: " + sessionID);
        System.out.println("Thread id"+Thread.currentThread().getId());
    }
}
