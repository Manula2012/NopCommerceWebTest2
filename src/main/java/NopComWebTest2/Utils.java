package NopComWebTest2;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils extends BasePage  {

    public static void clickOnElement(By by)
    {
        driver.findElement(by).click();
    }

    public static String getTextFromElement(By by)
    {
        return driver.findElement(by).getText();
    }

    public static String createTimeStamp()
    {
        DateFormat dateFormat = new SimpleDateFormat("ddMMHHmmss");
        Date date = new Date();
        return (dateFormat.format(date));
    }

    public void waitForVisible(By by, int time)
    {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }


    public static void assertURL(String text)
    {
        Assert.assertTrue(driver.getCurrentUrl().contains(text));
    }

    public void sendText(By by,String text)
    {
        driver.findElement(by).sendKeys(text);
        waitForClickable(by, 20);

    }

    public static void assertTextMessage(String message, String expected,By by)
    {
        String actual = getTextFromElement(by);
    }
    public static void waitForClickable(By by, int time)
    {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }


}
