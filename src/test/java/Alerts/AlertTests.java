package Alerts;

import Base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertTests extends BaseTests {
    @Test
    public void acceptAlerts() {
        var alert = home.clickonAlerts();
        alert.clickOn1stButton();
        alert.acceptAlert1();
        Assert.assertEquals(alert.getResult(), "You successfully clicked an alert", "Invalid assertion result");
    }
    @Test
    public void cancelAlerts(){
        var alert = home.clickonAlerts();
        alert.confirmButton();
        String text=alert.getConfirmText();
        alert.cancelAlert();
        Assert.assertEquals(text,"I am a JS Confirm","Invalid second one");

    }
    @Test
    public void PromptAlerts(){
        var alert = home.clickonAlerts();
        alert.promptButton();
        String text="kkk";
        alert.enterTextPrompt(text);
        alert.acceptAlert1();
        Assert.assertEquals(alert.getResult(),"You entered: " +  text,"Invalid prompt one");

    }

}
