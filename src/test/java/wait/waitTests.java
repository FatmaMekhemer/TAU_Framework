package wait;

import Base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class waitTests extends BaseTests {
    @Test
    public void clickUntilHidden(){
        var loading=home.clickonDynamic().clickOnExample1();
        loading.clickOnStart();
        Assert.assertEquals(loading.getLoadedText(),"Hello World!","Incorrect message");
    }
}
