package other;

import com.common.pageobjects.PageObjects;
import com.common.pageobjects.WebDriverDeploy;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class MyTest extends Exception{

    //private static WebDriver driver;
    //WebElement element;

    @BeforeClass
    public static void setDriver(){
        //driver = new WebDriverDeploy().setWebdriver("Chrome");
    }

    @Test
    public void myteste(){
        System.out.println("teste");
    }

    @Test
    public void test2(){
       // driver.get("http://www.google.com");
        //pageObjects.gotoPage("http://www.google.com");

    }
}
