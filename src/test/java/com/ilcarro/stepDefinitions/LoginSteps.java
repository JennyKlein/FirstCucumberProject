package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.HomePage;
import com.ilcarro.pages.LoginPage;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;

import static com.ilcarro.pages.BasePage.driver;

public class LoginSteps {
    LoginPage login;

    @And("User clicks on Login link")
    public void click_On_Login_Link() {
    new HomePage(driver)clickOnLoginLink();
    }
    @And("User enters correct data")
    public void User_enters_correct_data(){
        login = new LoginPage(driver);
        login.enterData("test222@gmail.com","Test12345!");
    }
    @And("User clicks on Yalla button")
    public void User_clicks_on_Yalla_button(){
        login.clickOnYalla();

            }
}
