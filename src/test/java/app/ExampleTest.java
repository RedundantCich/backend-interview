package app;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

public class ExampleTest {

    @Test
    void testExample() {
        RestAssured.given()
                .baseUri("https://stephen-king-api.onrender.com/")
                .when()
                .get("api/books")
                .then()
                .statusCode(200);
    }
}
