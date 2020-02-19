package NopComWebTest2;

import org.openqa.selenium.By;

public class AppleMacBookPro13 extends Utils
{

    private By _emailAFriend = By.xpath("//input[@value='Email a friend");

    public void verifyUserIsOnAppleMacBookPage()
    {
        assertURL("apple-macbook-pro-13-inch");
    }

    public void clickOnEmailAFriendButton()
    {
        clickOnElement(_emailAFriend);
    }




}
