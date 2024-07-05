package helpers;

import client.RestAssuredClient;
import config.APIConstants;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import models.request.CreatePetRequest;
import models.response.CreatePetRequestResponse;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.post;

public class PetStoreHelper extends RestAssuredClient {

    public PetStoreHelper() {
        super(APIConstants.PetStore.BASE_URL);
    }

    /*public CreatePetRequestResponse createPetRequestResponse(Integer id, String name){

    }*/
    public Response createPet(Integer id, String name, String status){
        CreatePetRequest createPetRequest = CreatePetRequest.builder()
                .id(id)
                .name(name)
                .status(status)
                .build();
        RestAssured.baseURI = APIConstants.PetStore.BASE_URL;
        return given()
        .contentType(ContentType.JSON)
        .body(createPetRequest)
                .when().post("/pet").thenReturn();
    }
}
