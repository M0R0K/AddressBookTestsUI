package addressbook.appmanager;

import org.openqa.selenium.chrome.ChromeDriver;

public class HelperBase {
    protected ChromeDriver driver;

    public HelperBase(ChromeDriver driver) {
        this.driver = driver;
    }

    protected void click(String locator) {
        driver.findElementByName(locator).click();
    }

    protected void type(String locator, String text) {
        click(locator);
        driver.findElementByName(locator).sendKeys(text);
    }
}
