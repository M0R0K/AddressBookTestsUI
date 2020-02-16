package addressbook.appmanager;

import org.openqa.selenium.chrome.ChromeDriver;

public class SessionHelper extends HelperBase {

    public SessionHelper(ChromeDriver driver) {
        super(driver);
    }

    public void login(String username, String password) {
        type("user", username);
        driver.findElementByName("user").click();
        driver.findElementByName("user").sendKeys(username);
        driver.findElementByName("pass").click();
        driver.findElementByName("pass").sendKeys(password);
        driver.findElementByXPath("//input[@value='Login']").click();
    }
}
