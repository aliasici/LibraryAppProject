package com.library.pages;

import com.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    @FindBy(className ="navbar-brand")
    private WebElement pageTitleElement;

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public String getPageTitleText(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return pageTitleElement.getText().trim();
    }


}
