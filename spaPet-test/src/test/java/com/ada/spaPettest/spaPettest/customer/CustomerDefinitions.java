package com.ada.spaPettest.spaPettest.customer;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CustomerDefinitions {

    private RequestSpecification request = RestAssured.given()
            .baseUri("http://localhost:8080")
            .contentType(ContentType.JSON);
    private Response response = null;
    private Customer customer = new Customer();

    @Given("an existing customer with invalid email and password")
    public void anExistingCustomerWithInvalidEmailAndPassword() {
        customer.setEmail("invalid_email@example.com");
        customer.setPassword("invalid_password");
    }

    @When("the customer attempts to log in")
    public void theCustomerAttemptsToLogIn() {
        response = request.body(customer).when().post("/login");
    }

    @Then("the system returns a 403 Unauthorized status")
    public void theSystemReturnsUnauthorizedStatus() {
        response.then().statusCode(403);
    }

    @Then("the error message is displayed to the customer")
    public void theErrorMessageIsDisplayedToTheCustomer() {

        if (response.getStatusCode() == 403) {
        } else {
            String errorMessage = response.jsonPath().getString("error");
        }
    }
}

