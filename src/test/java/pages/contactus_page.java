package pages;

import org.openqa.selenium.By;
import stepDefinations.webDriverClass;

public class contactus_page extends webDriverClass {



    public void clickSignInButton(){
        driver.findElement(By.linkText("Sign in")).click();
    }

}
