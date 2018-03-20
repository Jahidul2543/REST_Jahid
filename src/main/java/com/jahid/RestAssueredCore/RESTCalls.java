package com.jahid.RestAssueredCore;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RESTCalls {
    /*
    * This call will be responsible to fire request
    *
    * */
    public static Response response;
    public static Response GETRequest(String uRI){
        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.contentType(ContentType.JSON);
        Response response = requestSpecification.get(uRI);
        return response;
    }
    public  static Response POSTRequest(String uRI, String stringJSON){
        RequestSpecification requestSpecification = RestAssured.given().body(stringJSON);
        requestSpecification.contentType(ContentType.JSON);
        Response response = requestSpecification.post(uRI);
        return response;
    }
    public static Response PUTRequest(String uRI, String stringJSON){
        RequestSpecification requestSpecification = RestAssured.given().body(stringJSON);
        requestSpecification.contentType(ContentType.JSON);
        Response response = requestSpecification.put(uRI);
        return response;
    }
    public static Response DELETERequest(String uRI, String stringJSON){
        RequestSpecification requestSpecification = RestAssured.given().body(stringJSON);
        requestSpecification.contentType(ContentType.JSON);
        Response response = requestSpecification.delete(uRI);
        return response;
    }

}
