package addressbook.appmanager;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationHelper {
    private ChromeDriver driver;

    public NavigationHelper(ChromeDriver driver) {
        this.driver = driver;
    }

    public void goToGroupPage() {
       driver.findElementByLinkText("groups").click();
    }
}
