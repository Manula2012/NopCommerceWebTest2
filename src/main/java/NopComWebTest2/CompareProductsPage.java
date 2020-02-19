package NopComWebTest2;

import org.openqa.selenium.By;

public class CompareProductsPage extends Utils {

    private By _compareProductsMessage = By.xpath("//div[@class='page-title']/h1");
    String expected = "Compare products";

    public void varifyUserSeeCompareProductsMessage()
    { assertURL("compareproducts");
      assertTextMessage("compare products message successful",expected,_compareProductsMessage);

    }









}