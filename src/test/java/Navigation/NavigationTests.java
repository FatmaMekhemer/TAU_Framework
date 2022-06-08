package Navigation;

import Base.BaseTests;
import org.testng.annotations.Test;

public class NavigationTests extends BaseTests {
    @Test
    public void testNavigation(){
      home.clickonWisi();
      getWindow().goBack();
      getWindow().Refresh();
      getWindow().goToUrl("https://www.google.com/");
    }
    @Test
    public void switchTabs(){
        home.clickOnMultiplePages().clickHere();
        getWindow().switchToTabs("New Window");
    }

}
