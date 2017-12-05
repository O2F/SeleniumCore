package com.common.pageobject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverDeploy {

    public static WebDriver setWebdriver(String webDriverName){

        switch(webDriverName){
            case "chrome": case "Chrome": case "CHROME":
                System.setProperty("webdriver.chrome.driver","C:\\Users\\hugof\\Desktop\\selenium\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();
                return driver;
            default:
                System.out.println("Error loading driver");
                throw new NullPointerException();
        }


    }
}
