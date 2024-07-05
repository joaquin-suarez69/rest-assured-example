package client;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredClient {
    String baseURL;

    public RestAssuredClient(String baseURL) {
        this.baseURL = baseURL;
    }

    public Response get(String path){
        RequestSpecification httpRequest = RestAssured.given()
                .log()
                .all(true);
        httpRequest.baseUri(baseURL);
        httpRequest.header("Content-Type", "application/json");
        return httpRequest.get(path);
    }
}
