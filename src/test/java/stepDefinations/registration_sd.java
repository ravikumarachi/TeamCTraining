package stepDefinations;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;
import pages.registration_page;

public class registration_sd extends webDriverClass {
    public registration_page regPage  = PageFactory.initElements(driver, registration_page.class);




    @Given("^I enter new email id as \"([^\"]*)\"$")
    public void iEnterNewEmailIdAs(String newEmailId) {
        regPage.enterNewEmailId(newEmailId);
    }

    @When("^I click on Create an account button$")
    public void iClickOnCreateAnAccountButton() throws InterruptedException {
        regPage.clickonCreateAnAccountButton();
    }

    @And("^I enter below details:$")
    public void iEnterBelowDetails(DataTable table) {
        regPage.enterDetails(table);
    }

    @When("^I click \"([^\"]*)\" check box$")
    public void iClickCheckBox(String checkbox1) {
        regPage.clickCheckBox(checkbox1);
    }
}
