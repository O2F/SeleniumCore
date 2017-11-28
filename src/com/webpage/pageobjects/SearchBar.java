package com.webpage.pageobjects;

import com.common.page.interations.Inputs;
import com.common.pageobject.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchBar extends PageObject{

    //@FindBy(id="lst-ib")
    private WebElement searchField;
    private Inputs input = new Inputs(driver);

    public SearchBar(WebDriver driver){
        super(driver);
    }

    public void enterString(String string){
          input.typeStringUsingElementId(string,"lst-ib");
    }
}
