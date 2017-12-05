package com.common.page.interations;

import com.common.pageobject.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by hugof on 04/12/2017.
 */
public class Checkbox {

    protected WebElement element;

    public Checkbox (WebElement element){
        this.element = element;
    }

    public boolean isChecked(){
        return element.isSelected();
    }

    public void toggle(){
        element.click();
    }

    public void check(){
        if (!isChecked()){
            toggle();
        }
    }

    public void uncheck(){
        if (isChecked()){
            toggle();
        }
    }



}
