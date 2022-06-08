package javascript;

import Base.BaseTests;
import org.testng.annotations.Test;

public class javascriptTests extends BaseTests {
    @Test
    public void testScrollToTable(){
        home.clickOnLargeAndDeep().scrollToTable();
    }
    @Test
    public void testScrollParagraph(){
        home.clickOnInfinite().scrollToParagraph(5);
    }
}
