package other;

import com.common.page.interations.Checkbox;
import com.common.pageobject.FunctionalTestLifecycle;
import com.common.pageobject.PageObject;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyTest extends FunctionalTestLifecycle{

    //public PageObject po;

    /*
    @Test
    public void myteste(){
        System.out.println("teste");
    }

    @Test
    public void test2(){
        driver.get("http://www.google.com");
        //pageObjects.gotoPage("http://www.google.com");

    }
     */

    @Test
    public void searchBar(){
        //driver.get("http://www.google.com");
        //PageObject po = new PageObject("Chrome");
        //po.getDriver().get("http://AAA");
        driver.getDriver().get("http://www.google.com");

        Checkbox cb = new Checkbox(driver.getElement("lst-ib"));

        //SearchBar searchBar = new SearchBar(driver);
        //driver.findElement(By.id("lst-ib")).click();

        //searchBar.enterString("Teste");
    }
}
