package com.library.pages;

import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(id = "inputEmail")
    private WebElement useremailElement;

    @FindBy(id = "inputPassword")
    private WebElement passwordElement;

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void login() throws InterruptedException{
        String student_email = ConfigurationReader.getProperty("student_email");
        String student_password = ConfigurationReader.getProperty("student_password");

        useremailElement.sendKeys(student_email);
        Thread.sleep(2000);
        passwordElement.sendKeys(student_password, Keys.ENTER);
    }



}
