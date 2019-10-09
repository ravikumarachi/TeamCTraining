package pages;

import cucumber.api.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import stepDefinations.webDriverClass;

public class registration_page extends webDriverClass {


    public void enterNewEmailId(String newEmailId) {
        driver.findElement(By.id("email_create")).sendKeys(newEmailId);
    }

    public void clickonCreateAnAccountButton() throws InterruptedException {
        driver.findElement(By.id("SubmitCreate")).click();
        //wait for 10 seconds
        Thread.sleep(5000);
    }

    public void enterDetails(DataTable table) {
        System.out.println(table.getGherkinRows().get(1).getCells().get(3));
        String dob = table.getGherkinRows().get(1).getCells().get(3);
        String[] dob1 = dob.split("/");

        new Select(driver.findElement(By.id("days"))).selectByValue(dob1[0]);
        if (dob1[1].equalsIgnoreCase("FEBRUARY")) {
            new Select(driver.findElement(By.id("months"))).selectByValue("2");
        }
        new Select(driver.findElement(By.id("years"))).selectByValue(dob1[2]);

    }

    public void clickCheckBox(String checkbox1) {
        if (driver.findElement(By.id("newsletter")).isSelected() == true) {
        } else {
            driver.findElement(By.id("newsletter")).click();
        }


    }
}
