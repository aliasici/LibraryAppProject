package com.library.pages;

import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(id = "inputEmail")
    private WebElement usermailElement;

    @FindBy(id = "inputPassword")
    private WebElement passwordElement;

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void login(){
        String student_email = ConfigurationReader.getProperty("student_email");
        String student_password = ConfigurationReader.getProperty("student_password");

        usermailElement.sendKeys(student_email);
        passwordElement.sendKeys(student_password, Keys.ENTER);
    }



}
