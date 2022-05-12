package com.cydeo.tests.day5_testNG_intro_dropdowns;

import org.testng.annotations.*;

public class TestNG_Intro {

    @BeforeClass
    public void setupMethod(){
        System.out.println("---> BeforeClass is running");
    }

    @AfterClass
    public void tearDownClass(){
        System.out.println("---> AfterClass is running!");
    }

    @BeforeMethod // even if we write this method only one time it will execute before each test
    public void setUpMethod(){
        System.out.println("----> BeforeMethod is running!");
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("---> AfterMethod is running!");
    }

    @Test (priority = 1)// when we add @Test and tap enter it becomes runnable
    public void test1(){ // when we write this method only we can not run
        System.out.println("Test 1 is running...");
    }

    @Test (priority = 2) // priority can change the running order, normally it runs in the alphabetic order
    public void test2(){
        System.out.println("Test 2 is running...");
    }

}
