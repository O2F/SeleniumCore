package other;

import com.common.pageobject.FunctionalTestLifecycle;
import com.common.pageobject.PageObject;
import com.webpage.pageobjects.SearchBar;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyTest extends FunctionalTestLifecycle{
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
        driver.get("http://www.google.com");

        SearchBar searchBar = new SearchBar(driver);
        //driver.findElement(By.id("lst-ib")).click();

        searchBar.enterString("Teste");
    }
}
