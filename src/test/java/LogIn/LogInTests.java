package LogIn;

import Base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.secureAreaPage;

public class LogInTests extends BaseTests {
    @Test
    public void succesfullLogin() {
        LoginPage login = home.FormAuthetication();
        login.setUsername("tomsmith");
        login.setPassword("SuperSecretPassword!");
        secureAreaPage sec=login.LogInClick();
        Assert.assertEquals(sec.getStatusAlert(),"You logged into a secure area!\n" +
                "×","Alert text incorrect");

    }


}
