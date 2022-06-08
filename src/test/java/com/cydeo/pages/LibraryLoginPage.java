package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {

    //#1- initialize the driver instance and object of the class
    public LibraryLoginPage(){ // this is the default constructor
        PageFactory.initElements(Driver.getDriver(), this); // we call a method from selenium which allows us to implement PageFactory
    }
}
