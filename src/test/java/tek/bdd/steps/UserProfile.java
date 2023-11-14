package tek.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import tek.bdd.pages.LoginPage;
import tek.bdd.pages.UserProfilePage;
import tek.bdd.utility.SeleniumUtility;

public class UserProfile extends SeleniumUtility {
    @Then("click on the profile button")
    public void clickOnProfileIcon() throws InterruptedException {
        clickOnElement(UserProfilePage.profileButton);
    }
    @Then("validate that the Status {string}")
    public void validate_that_the_status(String expectedStatus) {
        String actualTitle= getElementText(UserProfilePage.Status);
        Assert.assertEquals("Validate The Page Title",expectedStatus,actualTitle);
    }
    @Then("validate that the User Type {string}")
    public void validate_that_the_user_type(String expectedUserType) {
        String actualTitle= getElementText(UserProfilePage.UserType);
        Assert.assertEquals("Validate The Page Title",expectedUserType,actualTitle);
    }
    @Then("validate that the Name {string}")
    public void validate_that_the_name(String expectedName) {
        String actualTitle= getElementText(UserProfilePage.Name);
        Assert.assertEquals("Validate The Page Title",expectedName,actualTitle);
    }
    @Then("validate that the Username {string}")
    public void validate_that_the_username(String expectedUserName) {
        String actualTitle= getElementText(UserProfilePage.Username);
        Assert.assertEquals("Validate The Page Title",expectedUserName,actualTitle);
    }
    @Then("validate that the Authorities {string}")
    public void validate_that_the_authorities(String expectedAuthorities) {
        String actualTitle= getElementText(UserProfilePage.Authorities);
        Assert.assertEquals("Validate The Page Title",expectedAuthorities,actualTitle);
    }
    @When("the user clicks on the profile button")
    public void the_user_clicks_on_the_profile_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the user clicks on the logout button")
    public void the_user_clicks_on_the_logout_button() {
      clickOnElement(UserProfilePage.logoutButton);
    }


}
