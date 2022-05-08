package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_Locator_getText {
    public static void main(String[] args) {


        //TC #1: NextBaseCRM, locators and getText() practice
        //1- Open a chrome browser
       // WebDriverManager.chromedriver().setup();
       // WebDriver driver = new ChromeDriver();

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();


        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Enter incorrect username: “incorrect”
       // driver.findElement(By.className("login-inp")).sendKeys("Incorrect");
        // if we write like this we can not re-use it, we need to locate again
        WebElement inputUsername = driver.findElement(By.className("login-inp"));
        inputUsername.sendKeys("incorrect");

        //4- Enter incorrect password: “incorrect”
        // to auto generate local variable
        // Mac: option + enter
        //Windows: alt + enter

        WebElement inputPassword = driver.findElement(By.name("USER_PASSWORD"));
        inputPassword.sendKeys("incorrect");

        //5- Click to login button.
        WebElement loginButton = driver.findElement(By.className("login-btn"));
        loginButton.click();

        //6- Verify error message text is as expected:
        //Expected: Incorrect login or password
        WebElement errorMessage = driver.findElement(By.className("errortext"));

        String expectedErrorMessage = "Incorrect login or password";
        String actualErrorMessage = errorMessage.getText();
        //if we don't put getText it will give a compile error because "errorMessage" is not a string
        // When we add getText it returns to a String

        if (actualErrorMessage.equals(expectedErrorMessage)){
            System.out.println("Error Massage verification PASSED!");
        }else{
            System.out.println("Error message verification FAILED!!!");
        }

        //
        //
        //
        //
        //PS: Inspect and decide which locator you should be using to locate web
        //elements.


    }
}
