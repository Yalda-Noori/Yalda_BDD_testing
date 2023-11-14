package tek.bdd.steps;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import tek.bdd.pages.homepages;
import tek.bdd.utility.SeleniumUtility;

public class HomePage extends SeleniumUtility {
    @Then("Validate the page title to be {string}")
    public void Validation(String expectedTitle){
        String actualTitle= getElementText(homepages.pageTitle);
        Assert.assertEquals("Validate",expectedTitle,actualTitle);
    }
    @Then("Validate the create primary button is existed")
    public void validateCreate(){
        isElementEnabled(homepages.createbutton);
    }
}
