package tests;

import org.testng.annotations.Test;
import pages.SauceDemoInventory;
import pages.SauceDemoLogin;
import utilities.Driver;

public class SauceDemoTest {

    //Navigate to https://www.saucedemo.com/
    //Enter the user name as standard_user
    //Enter the password as secret_sauce
    //Click on login button.
    //- Choose price low to high with soft Assert.
    //- Verify item prices are sorted from low to high with hard Assert.

    @Test
    public void test(){
        Driver.getDriver().get("https://www.saucedemo.com/");

        SauceDemoLogin lp=new SauceDemoLogin();

        lp.enterUserName("standard_user");
        lp.enterPassword("secret_sauce");
        lp.clickLogin();

        SauceDemoInventory ip = new SauceDemoInventory();

        ip.sortBy("Price (low to high)");
        ip.validateProductsAreSorted();

    }

}
