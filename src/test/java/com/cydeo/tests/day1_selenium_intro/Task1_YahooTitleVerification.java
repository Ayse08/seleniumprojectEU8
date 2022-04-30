package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitleVerification {
    public static void main(String[] args) {

        // TC #1 : Yahoo Title Verification

        // do setup for browser driver
        WebDriverManager.chromedriver().setup();

        //1. Open Chrome browser
        WebDriver driver = new ChromeDriver();

        // Make our page fullscreen
        driver.manage().window().maximize();

        //2. go to https://www.yahoo.com
        driver.get("https://www.yahoo.com");

        //3. verify title:
        // expected: Yahoo France | Actualités, mail et recherche
        String expectedTitle = "Yahoo France | Actualités, mail et recherche";

        //actual title comes from the browser
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("title is as expected. Verification PASSED!");
        }else{
            System.out.println("Title is NOT as expected. Verification FAILED!");
        }






    }
}
