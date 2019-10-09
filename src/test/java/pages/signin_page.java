package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import stepDefinations.webDriverClass;

public class signin_page  extends webDriverClass {



    public void clickSignInButton(){
        driver.findElement(By.linkText("Sign in")).click();
    }

    public void enterEmailId(String emailId) {
        driver.findElement(By.id("email")).sendKeys(emailId);
    }

    public void enterPassword(String password){
        driver.findElement(By.id("passwd")).sendKeys(password);
    }
}
