package Frames;

import Base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FrameTests extends BaseTests {
    @Test
    public void tesWigi(){
        var frame=home.clickonWisi();
        frame.clearExistedArea();
        String text1="hello";
        String text2="world";
        frame.setTextArea(text1);
        frame.decreaseIndenentButton();
        frame.setTextArea(text2);
        Assert.assertEquals(frame.getTextFromEditor(),text1+text2,"Incorrect frame");
    }
}
