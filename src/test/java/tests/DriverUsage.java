package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class DriverUsage {
    //Go to URL: https://opensource-demo.orangehrmlive.com/
    //Verify title contains OrangeHRM.
    //Use Driver Class.

    @Test
    public void test1(){
        Driver.getDriver().get("https://opensource-demo.orangehrmlive.com/");
        String title= Driver.getDriver().getTitle();
        Assert.assertEquals(title,"OrangeHRM", "Test Failed. The title is not OrangeHRM");
        Driver.closeDriver();

    }
}
