package com.cydeo.tests.day5_testNG_intro_dropdowns;

import org.testng.annotations.Test;

public class TestNG_Intro {

    @Test // when we add @Test and tap enter it becomes runnable
    public void test1(){ // when we write this method only we can not run
        System.out.println("Test 1 is running...");
    }

    @Test
    public void test2(){
        System.out.println("Test 2 is running...");
    }

}
