package com.ilcarro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage{
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[name='firstName']")
    WebElement inputName;
    @FindBy(css = "[name='lastName']")
    WebElement inputLastname;
    @FindBy(css = "[type='email']")
    WebElement inputEmail;
    @FindBy(css = "[name='password']")
    WebElement inputPassword;
    public RegistrationPage enterRegistrationDetails(String name, String lastname, String email, String password) {
        type(inputName, name);
        type(inputLastname, lastname);
        type(inputEmail,email);
        type(inputPassword,password);
        return this;
    }
    @FindBy(css = "[name='termsOfUse']")
    WebElement checkBox;
    public RegistrationPage checkTheBoxToAgree() {
        click(checkBox);
        return this;
    }

    @FindBy(css = "[type='submit']")
    WebElement yallaButton;
    public RegistrationPage clickOnYallaButton() {
        click(yallaButton);
        return this;
    }

    @FindBy(css = "h3")
    WebElement messageText;
    public RegistrationPage successMessage(String message) {
        assert shouldHaveText(messageText,message,5);
        return this;
    }

    public RegistrationPage userEntersExistingData() {
        return enterRegistrationDetails("Jenny", "Klein", "jenny.klein@mail.de", "Abc123456!");
    }

    @FindBy(css = "h3")
    WebElement message;
    public RegistrationPage errorMessage(String text) {
        assert shouldHaveText(message,text,5);
        return this;
    }
}