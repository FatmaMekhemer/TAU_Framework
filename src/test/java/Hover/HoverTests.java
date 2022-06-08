package Hover;

import Base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HoverTests extends BaseTests {
    @Test
    public void hoverPicturesUser1(){
        var hover=home.clickHovers();
        var caption= hover.hoverOverFigure(1);
       // Assert.assertTrue(caption.captionIsDisplayed(),"Not Displayed!");
        // Assert.assertEquals(caption.getTitle(),"name: user1","Incorrect title");
        //Assert.assertEquals(caption.getLinkText(),"View profile","Incorrect Link Text");
        //Assert.assertTrue(caption.getLink().endsWith("/users/1"),"Incorrect link");

    }
}
