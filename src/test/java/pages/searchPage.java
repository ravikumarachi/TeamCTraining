package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import stepDefinations.webDriverClass;

public class searchPage extends webDriverClass {



    public void enterText(String searchText){
        driver.findElement(By.name("search_query")).sendKeys(searchText);
    }


    public void clickSearchButton() {
        driver.findElement(By.name("submit_search")).click();
    }


    public void assertText(String expectedText) {
        String actualText;
        actualText = driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1/span[2]")).getText();

        Assert.assertEquals(expectedText,actualText);


    }
}
