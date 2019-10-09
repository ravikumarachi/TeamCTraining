package stepDefinations;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;
import pages.searchPage;

public class search_sd extends webDriverClass {
    public searchPage search_Page = PageFactory.initElements(driver,searchPage.class);




    @Given("^I enter \"([^\"]*)\" in search field$")
    public void iEnterInSearchField(String searchText){
        search_Page.enterText(searchText);
    }

    @When("^I click search button$")
    public void iClickSearchButton() {
        search_Page.clickSearchButton();


    }

    @Then("^I should see \"([^\"]*)\"$")
    public void iShouldSee(String expectedText) {
        search_Page.assertText(expectedText);

    }
}
