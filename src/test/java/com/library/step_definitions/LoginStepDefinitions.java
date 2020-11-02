package com.library.step_definitions;

import com.library.pages.HomePage;
import com.library.pages.LoginPage;
import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Given("user is on the landing page")
    public void user_is_on_the_landing_page() {
        String URL = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(URL);

    }

    @When("user logs in")
    public void user_logs_in() throws InterruptedException{
        loginPage.login();

    }
    @Then("user should see {string} page title")
    public void user_should_see_page_title(String string) {
        String actualTitle = homePage.getPageTitleText();
        Assert.assertEquals(string, actualTitle);


    }

}
