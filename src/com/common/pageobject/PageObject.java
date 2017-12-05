package com.common.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageObject {
    protected WebDriver driver;

    public PageObject(String  driver){

        //this.driver = new WebDriverDeploy().setWebdriver("Chrome");
        this.driver = new WebDriverDeploy().setWebdriver(driver);
        PageFactory.initElements(this.driver,this);
    }

    public WebDriver getDriver(){
        return this.driver;
    }

    public WebElement getElement(String locatorName) throws NoSuchElementException{

        WebElement element = elementLocatorType(locatorName,0);

        if(element!=null){
            return element;
        }
        throw new NoSuchElementException("No Element Found");
    }

    private WebElement elementLocatorType(String locatorName, int count){
        try{
            switch (count){
                case 0:
                    return this.driver.findElement(By.id(locatorName));
                case 1:
                    return this.driver.findElement(By.name(locatorName));
                case 2:
                    return this.driver.findElement(By.xpath(locatorName));
                case 3:
                    return this.driver.findElement(By.cssSelector(locatorName));
                default:
                     return null;
            }
        }catch (NoSuchElementException e){
            //System.out.println(count);
            return elementLocatorType(locatorName, ++count);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;

    }

    public void close(){
        this.driver.close();
    }
}
