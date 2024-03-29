package org.example.Selenium2303;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.qameta.allure.Description;

public class Sel18 {

    EdgeDriver driver;
    @BeforeTest
    public void openBrowser(){
        // Create Session via the API and Session ID is generated
        driver = new EdgeDriver();
    }

    @Test(groups = "QA")
    @Description("Test Case Description")
    public void testVWOLogin_positive() throws InterruptedException {
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();
    }

    @Test(groups = "QA")
    @Description("Test Case Description")
    public void testVWOLogin_negative() throws InterruptedException {
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();
    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
