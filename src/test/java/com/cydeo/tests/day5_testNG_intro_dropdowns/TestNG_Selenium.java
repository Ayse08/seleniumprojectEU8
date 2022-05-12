package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_Selenium {

    @Test
    public void selenium_test(){
       //Do Browser driver setup
        //Open browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

       // Maximize the page
        driver.manage().window().maximize();

       //Implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

       //Get : "http://google.com"
        driver.get("http://google.com");

        //Assert : title is "google"


    }

}
