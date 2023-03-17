package Implementation;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommanClass {
   public WebDriver driver;
    @Before
    public void setup() {
        driver=WebDriverManager.chromedriver().create();

    }
    @Test
    public void initializeWebdriver(){

        
    }
}
