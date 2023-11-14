package tek.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import tek.bdd.pages.createAccount;
import tek.bdd.pages.homepages;
import tek.bdd.utility.SeleniumUtility;

public class CreateAccount extends SeleniumUtility {
    @When( "User clicks on Create Primary Account Button" )
    public void user_clicks_on_create_primary_account_button() {
        clickOnElement(homepages.createbutton);

    }


    @Then( "the form title should be {string}" )
    public void theFormTitleShouldBe(String expectedTitle) {
        String actualTitle = getElementText(createAccount.pageTitle);
        Assert.assertEquals("Validated The Title", expectedTitle, actualTitle);

    }

    @Given( "Click on the Create Primary Account Holder page" )
    public void click_on_the_create_primary_account_holder_page() {
        clickOnElement(homepages.createbutton);
    }

    @When( "Enter email address {string}" )
    public void enter_email_address(String EmailAddress)
    {
        enterValue(createAccount.EmailAddress, EmailAddress);
    }

    @When( "Enter First Name{string}" )
    public void enter_first_name_deniz(String FirstName)
    {
        enterValue(createAccount.FirstName, FirstName);
    }

    @When( "Select Gender{string}" )
    public void select_gender_fe_male(String gender) {

        enterValue(createAccount.Gender, gender);
    }

    @When( "Enter Employment Status{string}" )
    public void enter_employment_status_internship(String EmploymentStatus) {
        enterValue(createAccount.EmploymentStatus, EmploymentStatus);


    }

    @When( "Select Title {string}" )
    public void select_title(String Title) {
        enterValue(createAccount.Title, Title);

    }

    @When( "Enter Last Name{string}" )
    public void enter_last_name_karam(String LastName) {
        enterValue(createAccount.LastName, LastName);
    }

    @When( "Select Marital Status {string}" )
    public void select_marital_status_single(String maritalStatus) {
        enterValue(createAccount.MaritalStatus, maritalStatus);
    }

    @When( "Enter Date Of Birth{string}" )
    public void enter_date_of_birth(String DOB) {
        enterValue(createAccount.DateOfBirth, DOB);
    }

    @When( "Click on the Create  Account" )
    public void click_on_the_create_account() {
        clickOnElement(createAccount.CreateAccountButton);
    }

    @Then( "Navigate The Email Address{string}" )
    public void should_see_the_email_address_as_expected(String expectedEmail) {
        String actualEmail = getElementText(createAccount.Email);
        Assert.assertEquals("Validated The Email", expectedEmail, actualEmail);
    }


    @Then( "The error message should be {string}" )
    public void the_Error_Message_Should_Be_ERROR(String expectedError) {
        String actualError = getElementText(createAccount.Error);
        Assert.assertEquals("Validated The Error", expectedError, actualError);
    }
    }
