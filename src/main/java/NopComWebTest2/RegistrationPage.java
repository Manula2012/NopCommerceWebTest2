package NopComWebTest2;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage extends Utils {
    private By _firstName = By.name("FirstName");
    private By _lastname = By.name("LastName");
    private By _email = By.id("Email");
    private By _password = By.id("Password");
    private By _confirmPassword = By.id("ConfirmPassword");
    private By _registerButton = By.id("register-button");
    private String firstName = "Mala";
    private String lastName ="Wij";
    private String email = "manulasn2012+"+createTimeStamp()+"@gmail.com";
    private String password = "masw12";
    private String confirmPassword = "masw12";
    private static String timestamp = createTimeStamp();

    public void waitUntilDisplay() {
        waitForClickable(_registerButton, 50);
    }

    public void verifyFirstNameIsVisible() {
        waitForVisible(_firstName, 70);
    }

    public void verifyUserIsOnRegisterPage() {
        assertURL("register");
    }

    public void userEntersRegistrationDetails() {
        sendText(_firstName,firstName);
        sendText(_lastname, lastName);
        sendText(_email,email);
        sendText(_password,password);
        sendText(_confirmPassword, confirmPassword);
        clickOnElement(_registerButton);

    }
}





