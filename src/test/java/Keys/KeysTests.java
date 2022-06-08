package Keys;

import Base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KeysTests extends BaseTests {
    @Test
    public void enterKeys() {
        var key=home.clickKeyPresses();

        key.enterText("A"+ Keys.BACK_SPACE);
        Assert.assertEquals(key.getResult(),"You entered: BACK_SPACE","Invalid");
    }
    @Test
    public void enterkey2(){
        var key=home.clickKeyPresses();
        key.enterPI();
      //  Assert.assertEquals();
    }

}
