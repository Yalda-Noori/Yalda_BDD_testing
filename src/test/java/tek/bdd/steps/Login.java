package tek.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import tek.bdd.pages.LoginPage;

import tek.bdd.pages.createAccount;
import tek.bdd.pages.homepages;
import tek.bdd.utility.SeleniumUtility;

public class Login extends SeleniumUtility {
    @Given( "Click on the login Button" )
    public void clickOnTheLoginButton() {
       clickOnElement(LoginPage.LoginButton);
    }
    @When("enter the username {string}")
    public void enter_the_username(String UserName) {
        enterValue(LoginPage.UserName, UserName);
    }
    @When("enter the password {string}")
    public void enter_the_password(String password) {
        enterValue(LoginPage.Password,password);
    }
    @When("click the Sign in button")
    public void click_the_sign_in_button() {
        clickOnElement(LoginPage.SignIn);
    }
    @Then("Validate The Title {string}")
    public void validate_the_title(String expectedTitle) {
        String actualTitle= getElementText(LoginPage.CustomerService);
        Assert.assertEquals("Validate The Page Title",expectedTitle,actualTitle);
    }

    @When("enter wrong username  {string}")
    public void enter_wrong_username(String UserName) {
        enterValue(LoginPage.UserName, UserName);
    }
    @When("enter wrong  password {string}")
    public void enter_wrong_password(String Password) {
        enterValue(LoginPage.Password,Password);
    }

    @Then("should see an error message{string}")
    public void should_see_an_error_message(String expectedError) {
        String actualError = getElementText(createAccount.Error);
        Assert.assertEquals("Validated The Error", expectedError, actualError);
    }



}
