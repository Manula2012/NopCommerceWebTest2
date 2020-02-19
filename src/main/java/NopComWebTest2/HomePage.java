package NopComWebTest2;

import org.openqa.selenium.By;

public class HomePage extends Utils {
    private By _registerLink = By.className("ico-register");
    private By _compareAppleMacBook = By.xpath("//div[@class='product-grid home-page-product-grid']/div[2]/div[2]/div/div[2]/div[3]/div[2]/input");
    private By _compareHtcOneM8 = By.xpath("//div[@class='product-grid home-page-product-grid']/div[2]/div[3]/div/div[2]/div[3]/div[2]/input");
    private By _productComparison = By.linkText("product comparison");
    private By _compareProducts = By.xpath("//h1[text()='Compare products']");
    private By _applemacBookPro13 = By.xpath("//div[@data-productid=\"4\"]/div[2]/h2/a");


    public void clickOnRegisterButton()

    {
        clickOnElement(_registerLink);
    }


    public void clickOnAddToCompareListAppleMacBook() {
       clickOnElement(_compareAppleMacBook);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public void clickOnAddToCompareListHtcOneM8()
    {
        clickOnElement(_compareHtcOneM8);
    }

    public void clickOnProductComparison()
    {
        clickOnElement(_productComparison);
        }


    public void waitForDisplayComparePage()
    {
        waitForVisible(_compareProducts,50);
    }

    public void clickOnAppleMacBook()
    {
        clickOnElement(_applemacBookPro13);
    }

}
