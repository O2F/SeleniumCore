package com.common.page.interations;

import com.common.pageobject.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Inputs extends PageObject{
    /**
     * May not be needed
     * @param driver
     */


    public Inputs (WebDriver driver){
        super(driver);
    }

    public void typeStringUsingElementId(String string, String id){
        driver.findElement(By.id(id)).sendKeys(string);
    }

    public void typeStringUsingElementName(String string, String name){
        driver.findElement(By.name(name));
    }

    public void typeStringUsingElementXpath(String string, String xpath){
        driver.findElement(By.id(xpath)).sendKeys(string);
    }

    public void typeStringUsingElementCss(String string, String css){
        driver.findElement(By.cssSelector(css)).sendKeys();
    }


}
