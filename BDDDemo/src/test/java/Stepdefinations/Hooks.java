package Stepdefinations;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();

    }
}
