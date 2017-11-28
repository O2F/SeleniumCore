package com.common.pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.EmptyStackException;

public class WebDriverDeploy {

    public WebDriver setWebdriver(String webDriverName){

        switch(webDriverName){
            case "chrome": case "Chrome": case "CHROME":
                System.setProperty("webdriver.chrome.driver","/home/hpfernandes/Downloads/chromedriver");
                WebDriver driver = new ChromeDriver();
                return driver;
            default:
                System.out.println("Error loading driver");
                throw new NullPointerException();
        }


    }
}
