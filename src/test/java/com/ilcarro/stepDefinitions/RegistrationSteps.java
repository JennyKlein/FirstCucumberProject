package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.HomePage;
import com.ilcarro.pages.RegistrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;


import static com.ilcarro.pages.BasePage.driver;

public class RegistrationSteps {

    RegistrationPage registration;

    @And("User clicks on Sign Up link")
    public void click_on_sign_up_link() {
        new HomePage(driver).clickOnSignUpLink();
    }

    @And("User enters data")
    public void entersData() {
        registration = new RegistrationPage(driver);
        registration.enterRegistrationDetails("Jenny", "Klein", "jenny.klein@mail.de", "Abc123456!");
    }

    @And("Check the box to agree to the terms of use and privacy policy")
    public void check_the_box_to_agree() {
        registration.checkTheBoxToAgree();
    }

    @And("User click on Yalla button")
    public void clickOnYalla() {
        registration.clickOnYallaButton();
    }

    @Then("User verifies that the success message is displayed")
    public void success_Message() {
        registration.successMessage("Registered");
    }

    @And("User enters data that already exists")
    public void user_enters_data_that_already_exists () {
        registration = new RegistrationPage(driver);
        registration.userEntersExistingData();
    }

    @Then("User receives a message that the user already exists")
    public void failure_message() {
        registration.errorMessage("Registration failed");
    }


}