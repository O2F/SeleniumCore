package com.common.pageobject;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class FunctionalTestLifecycle {
    /**
     * Class representing a test suite lifecycle operations prior and posterior to the tests
     */
    protected static WebDriver driver;

    @BeforeClass
    public static void suiteSetUp(){
        /**
         * This method setups the initial test suite
         * It serves as the bare minimum for the setup
         */
        driver = new WebDriverDeploy().setWebdriver("Chrome");
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass
    public static void suiteTearDown(){
        /**
         * This method tears down the test suite
         * It serves has the bare minimum for a tear down
         */
        driver.close();
    }

    // Test Setup (@Before) and test teardown (@After) are not added here for the time being

}
