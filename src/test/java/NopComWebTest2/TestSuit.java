package NopComWebTest2;

import org.junit.runner.Computer;
import org.testng.annotations.Test;

public class TestSuit extends BaseTest {
    HomePage homepage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultPage  registrationResultPage = new RegistrationResultPage();
    CompareProductsPage compareProductsPage = new CompareProductsPage();
    AppleMacBookPro13 appleMacBookPro13 = new AppleMacBookPro13();
    EmailAFriendAppleMacBook emailAFriendAppleMacBook = new EmailAFriendAppleMacBook();
    NonRegisteredEmailAFriendAppleMac nonRegisteredEmailAFriendAppleMac= new NonRegisteredEmailAFriendAppleMac();
    ComputerPage computerPage = new ComputerPage();


    @Test
    public void userShouldAbleToRegisterSuccessfully() {
        homepage.clickOnRegisterButton();
        registrationPage.verifyUserIsOnRegisterPage();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        registrationPage.verifyFirstNameIsVisible();
        registrationPage.waitUntilDisplay();
        registrationPage.userEntersRegistrationDetails();
        registrationResultPage.verifyUserSeeRegistrationSuccessMessage();


    }

    @Test

    public void userShouldAbleToCompareSuccessfully() {

        homepage.clickOnAddToCompareListAppleMacBook();
        homepage.clickOnAddToCompareListHtcOneM8();
        homepage.clickOnProductComparison();
        //homepage.waitForDisplayComparePage();
        compareProductsPage.varifyUserSeeCompareProductsMessage();
    }

    @Test

    public void registeredUserShouldAbleToEmailAFriendSuccessfully()

    {   homepage.clickOnRegisterButton();
        registrationPage.verifyUserIsOnRegisterPage();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        registrationPage.verifyFirstNameIsVisible();
        registrationPage.waitUntilDisplay();
        registrationPage.userEntersRegistrationDetails();
        registrationResultPage.verifyUserSeeRegistrationSuccessMessage();
        emailAFriendAppleMacBook.clickOnContinue();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        homepage.clickOnAppleMacBook();
        appleMacBookPro13.clickOnEmailAFriendButton();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        emailAFriendAppleMacBook.userEntersEmailAFriendDetails();
        emailAFriendAppleMacBook.verifyUserSeeEmailAFriendSentMessage();
    }

    @Test
    public void unregisteredUserWillSeeErrorMessage()
    {
        homepage.clickOnAppleMacBook();
        appleMacBookPro13.clickOnEmailAFriendButton();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        nonRegisteredEmailAFriendAppleMac.userEntersEmailsAFriendDetails();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        nonRegisteredEmailAFriendAppleMac.verifyUnregisteredUserWillSeeErrorMessageForEmailAFriend();

    }

    @Test
    public void userShouldAbleToSeePriceSortedHighToLow()
    {
        computerPage.clickOnComputer();

    }


}
