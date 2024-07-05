package services.pet;

import helpers.PetStoreHelper;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.Random;

import static org.testng.Assert.assertEquals;

public class CreatePetTest {
    PetStoreHelper petStoreHelper = new PetStoreHelper();

    Random random = new Random();
    Integer id = random.nextInt(10);
    String petName = "Pet Joa2";
    String[] status = {"disponible","pendiente", "adoptado"};

    @Test
    public void createPetHappyPath(){
        Response response = petStoreHelper.createPet(id, petName, status[0]);
        assertEquals(response.getStatusCode(),200,  "Creacion fallida");
        assertEquals(response.jsonPath().getString("id"),String.valueOf(id),"Id no corresponde");
        assertEquals(response.jsonPath().getString("name"),petName, "nombre no corresponde");
        assertEquals(response.jsonPath().getString("status"),status[0],"status no corresponde");
    }

    @Test
    public void createPetWithExistingId(){
        Response response = petStoreHelper.createPet(6, petName, status[0]);
        assertEquals(response.getStatusCode(),200,  "Creacion fallida");
    }

}
