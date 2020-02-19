package NopComWebTest2;

import org.openqa.selenium.By;

public class ComputerPage extends Utils {

    private By _computer = By.xpath("//ul[@class='top-menu mobile']/li[1]");

    public void verifyUserIsOnComputerPage()
    {
        assertURL("computers");
    }

    public void clickOnComputer()
    {
        clickOnElement(_computer);
    }


}
