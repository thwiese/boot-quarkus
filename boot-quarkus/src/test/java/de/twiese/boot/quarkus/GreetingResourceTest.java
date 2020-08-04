package de.twiese.boot.quarkus;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class GreetingResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/C:/dev/tool/git-2.18/hello")
          .then()
             .statusCode(200)
             .body(is("hello"));
    }

}