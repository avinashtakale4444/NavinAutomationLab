package Stepdefinations;

import Implementation.CommanClass;
import io.cucumber.java.en.Given;

public class Login extends CommanClass {
    @Given("hit the url")
    public void hit_the_url() {
       driver.get("https://www.google.com/");
    }
}
