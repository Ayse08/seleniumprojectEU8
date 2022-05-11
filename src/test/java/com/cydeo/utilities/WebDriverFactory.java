package com.cydeo.utilities;

//TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
//1- Open a chrome browser
//2- Go to: https://login1.nextbasecrm.com/
//3- Verify “remember me” label text is as expected:
//Expected: Remember me on this computer
//4- Verify “forgot password” link text is as expected:
//Expected: Forgot your password?
//5- Verify “forgot password” href attribute’s value contains expected:
//Expected: forgot_password=yes


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

    public static WebDriver getDriver(String browserType){

        if (browserType.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();

        }else if(browserType.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();

        }else{
            System.out.println("Given browser type dos not exist/or is not currently supported");
            System.out.println("Driver = null");
            return null;
        }
    }



}
