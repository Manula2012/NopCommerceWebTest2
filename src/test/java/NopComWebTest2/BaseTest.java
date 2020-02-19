package NopComWebTest2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utils {
    BrowserSelector browserSelector = new BrowserSelector();

    @BeforeMethod
    public void openBrowser() {
        browserSelector.setupBrowser();
    }

    @AfterMethod
    public void closeBrowser()
    {
        browserSelector.closeBrowser();
    }
}
