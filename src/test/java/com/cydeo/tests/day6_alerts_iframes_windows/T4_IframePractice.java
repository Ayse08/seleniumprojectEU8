package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_IframePractice {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {

        //TC #1: Information alert practice
//1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//2. Go to website: https://practice.cydeo.com/iframe
        driver.get("https://practice.cydeo.com/iframe");
    }

    // @Ignore // first way to ignore the test
    @Test // second way to skip: put // before @Test
    public void iframe_test(){
        //4. Assert: “Your content goes here.” Text is displayed.
        // We need to switch otherwise : "NoSuchElement" exception
        //We need to switch driver's focus to iframe
        // option#1- switching to iframe using id attribute value
        //driver.switchTo().frame("mce_0_ifr");

        //option #2- passing index number of iframe
        //driver.switchTo().frame(0);

        // option #3- locate as web element and pass in frame() method
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")));

        //Locate the p tag
        WebElement yourContentGoesHereText = driver.findElement(By.xpath("//p"));

        Assert.assertTrue(yourContentGoesHereText.isDisplayed());

        //5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
        // to be able to verify the header, we must switch back to "main HTML"

        driver.switchTo().parentFrame();

        WebElement headerText = driver.findElement(By.xpath("//h3"));

        //assertion of header test is displayed or not
        Assert.assertTrue(headerText.isDisplayed());

    }

}
