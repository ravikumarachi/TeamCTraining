package stepDefinations;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pages.signin_page;

import java.sql.Array;
import java.util.ArrayList;

public class signin_sd extends webDriverClass {

    public signin_page spage = PageFactory.initElements(driver, signin_page.class);


    @When("^I click on sign in button on home page$")
    public void iClickOnSingInButtonOnHomePage() {
        spage.clickSignInButton();
        spage.clickSignInButton();
        spage.clickSignInButton();
        spage.clickSignInButton();
        spage.clickSignInButton();



//        driver.findElement(By.linkText("Sign in")).click();
    }

//    @Given("^I enter email id as \"([^\"]*)\"$")
//    public void iEnterEmailIdAs(String emailid) throws Throwable {
//        driver.findElement(By.id("email")).sendKeys(emailid);
//    }
//
//    @And("^I enter password as \"([^\"]*)\"$")
//    public void iEnterPasswordAs(String password) throws Throwable {
//
//        driver.findElement(By.id("passwd")).sendKeys(password);
//
//    }

    @When("^I click on sign in button on sign in page$")
    public void iClickOnSignInButtonOnSignInPage() {
        spage.clickSignInButton();

        driver.findElement(By.id("SubmitLogin")).click();
    }




    @Given("^I select \"([^\"]*)\" from subject heading drop down box$")
    public void iSelectFromSubjectHeadingDropDownBox(String subjectheading) {

        new Select(driver.findElement(By.id("id_contact"))).selectByIndex(2);
        spage.clickSignInButton();
    }

    @Given("^I enter order reference as \"([^\"]*)\"$")
    public void iEnterOrderReferenceAs(String orderref) throws Throwable {

        spage.clickSignInButton();
        driver.findElement(By.id("id_order")).sendKeys(orderref);
    }

    @Given("^I enter text in message box as \"([^\"]*)\"$")
    public void iEnterTextInMessageBoxAs(String textmessage) throws Throwable {

        driver.findElement(By.id("message")).sendKeys(textmessage);
    }

    @When("^I click on send button$")
    public void iClickOnSendButton() {

        driver.findElement(By.id("submitMessage")).click();
    }


    @Given("^I enter emai id as \"([^\"]*)\"$")
    public void iEnterEmaiIdAs(String emailid) {

        driver.findElement(By.id("email")).sendKeys(emailid);

    }

    @Given("^I enter email id as \"([^\"]*)\" in contact us page$")
    public void iEnterEmailIdAsInContactUsPage(String emailid) throws Throwable {
        driver.findElement(By.id("email")).sendKeys(emailid);

    }

    @Given("^I dont select subject heading from the list provided$")
    public void iDontSelectSubjectHeadingFromTheListProvided() {

        new Select(driver.findElement(By.id("id_contact"))).selectByIndex(0);
    }


    String actual_errormsg;
    String expected_errormsg;

    @Then("^I should see error message as \"([^\"]*)\"$")
    public void iShouldSeeErrorMessageAs(String expected_errormsg) {

        actual_errormsg = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li")).getText();

        Assert.assertEquals(expected_errormsg, actual_errormsg);
        //Assert.assertNotEquals(expected_errormsg, actual_errormsg);
        Assert.assertTrue(actual_errormsg.contains("Authentication"));

    }

    Boolean actualButton;

    @And("^I should see sign in button$")
    public void iShouldSeeSignInButton() {
        actualButton = driver.findElement(By.name("SubmitLogin")).isDisplayed();
        Assert.assertTrue(actualButton);

    }

//    @And("^I should see \"([^\"]*)\" text on the Sign in Button$")
//    public void iShouldSeeTextOnTheSignInButton(String expectedText) {
//        String actualText;
//        actualText = driver.findElement(By.name("SubmitLogin")).getText();
//        Assert.assertTrue(actualText.contains(expectedText));
//
//    }

    @Then("^I should see error message as \"([^\"]*)\" on top$")
    public void iShouldSeeErrorMessageAsOnTop(String expected_errormsg) {

        actual_errormsg = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li")).getText();

        Assert.assertEquals(expected_errormsg, actual_errormsg);

    }

    @Then("^I should see error message as \"([^\"]*)\" for no password$")
    public void iShouldSeeErrorMessageAsForNoPassword(String expected_errormsg) {
        actual_errormsg = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li")).getText();

        Assert.assertEquals(expected_errormsg, actual_errormsg);

    }

    @Then("^I should see error message as \"([^\"]*)\" for no data entering$")
    public void iShouldSeeErrorMessageAsForNoDataEntering(String expected_errormsg) {

        actual_errormsg = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li")).getText();

        Assert.assertTrue(actual_errormsg.contains(expected_errormsg));
    }

    @Then("^I should see text as \"([^\"]*)\"$")
    public void iShouldSeeTextAs(String expectedtext) {
        String actualtext;

        actualtext = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p")).getText();
        Assert.assertEquals(expectedtext, actualtext);
    }

    @And("^I should see contact us button on home page$")
    public void iShouldSeeContactUsButtonOnHomePage() {

        actualButton = driver.findElement(By.id("contact-link")).isDisplayed();
        Assert.assertTrue(actualButton);
    }

    @And("^I should see \"([^\"]*)\" text on contact us button$")
    public void iShouldSeeTextOnContactUsButton(String expected_Text) {
        String actual_Text;
        actual_Text = driver.findElement(By.id("contact-link")).getText();

        Assert.assertTrue(actual_Text.contains(expected_Text));

    }


    @Then("^I should see error message as \"([^\"]*)\" with no heading$")
    public void iShouldSeeErrorMessageAsWithNoHeading(String expected_errormsg) {
        actual_errormsg = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/ol/li")).getText();

        Assert.assertEquals(expected_errormsg, actual_errormsg);

    }

    @Then("^I should see error message as \"([^\"]*)\" with no email id$")
    public void iShouldSeeErrorMessageAsWithNoEmailId(String expected_errormsg) {

        actual_errormsg = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/ol/li")).getText();
        Assert.assertTrue(actual_errormsg.contains(expected_errormsg));

    }

    @Then("^I should see error message as \"([^\"]*)\" with no message$")
    public void iShouldSeeErrorMessageAsWithNoMessage(String expected_errormsg) {

        actual_errormsg = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/ol/li")).getText();
        Assert.assertEquals(expected_errormsg, actual_errormsg);

    }

    @Then("^I should see error message as \"([^\"]*)\" with no data$")
    public void iShouldSeeErrorMessageAsWithNoData(String expected_errormsg) {

        actual_errormsg = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/ol/li")).getText();
        Assert.assertEquals(expected_errormsg, actual_errormsg);
    }

    @Then("^I should not see text as \"([^\"]*)\"$")
    public void iShouldNotSeeTextAs(String expected_errormsg) {

        actual_errormsg = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/ol/li")).getText();
        Assert.assertNotEquals(expected_errormsg, actual_errormsg);

    }

    @Given("^I enter email id as \"([^\"]*)\"$")
    public void iEnterEmailIdAs(String emailId) {
        spage.enterEmailId(emailId);
    }

    @And("^I enter password as \"([^\"]*)\"$")
    public void iEnterPasswordAs(String password) {
        spage.enterPassword(password);

    }
}
