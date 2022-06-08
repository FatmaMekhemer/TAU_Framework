package Dropdown;

import Base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDownTests extends BaseTests {
    @Test
    public void selectedOptions() {
        var dropDownpage = home.clickDropDown();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String option="Option 1";
        dropDownpage.selectOption(option);
        var selected=dropDownpage.getSelectedOptions();
        Assert.assertEquals(selected.size(),1,"Incorrect numbers selected");
        Assert.assertTrue(selected.contains(option),"option not selected ");

    }

}
