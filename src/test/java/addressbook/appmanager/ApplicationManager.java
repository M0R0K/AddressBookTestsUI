package addressbook.appmanager;

import org.openqa.selenium.chrome.ChromeDriver;

public class ApplicationManager {
    public ChromeDriver driver;
    private  NavigationHelper navigationHelper;
    private  GroupHelper groupHelper;
    private  SessionHelper sessionHelper;

    public void init() {
        System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost/addressbook/");
        groupHelper = new GroupHelper(driver);
        navigationHelper = new NavigationHelper(driver);
        sessionHelper = new SessionHelper(driver);
        sessionHelper.login("admin", "secret");
    }



    public void stop() {
      driver.quit();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }
}
