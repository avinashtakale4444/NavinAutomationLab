package Selenium;

import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class Hooks {
    @Before
    public void setup() {
        WebDriver driver= WebDriverManager.chromedriver().create();
        driver.get("https://www.toolsqa.com/selenium-webdriver/webdrivermanager/");
    }
}
