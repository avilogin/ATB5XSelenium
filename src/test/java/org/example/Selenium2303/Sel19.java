package org.example.Selenium2303;

import io.qameta.allure.Description;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sel19 {
    EdgeDriver driver;
    @BeforeTest
    public void openBrowser(){
        driver = new EdgeDriver();
    }











    @Test(groups = "QA")
    @Description("Test Case Description")
    public void testPositive() throws InterruptedException {
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();
        // CSS Selectors - tagName id -> #, class -> . , custom [@attribute=value]
        // CSS selectors are used to select elements in an HTML or XML document. (tag based lang.)
        // tag -> <pramod> value</pramod>
        // ID, className, name, customAttribute

        // LinkText, Partial Lik - Anchor Tag finder by Selenium


        // Xpath -> //input[@id='login-username'] -> input#login-username
        // //input[@data-qa='hocewoqisi'] -> input[data-qa='hocewoqisi']
        //  input[data-qa$='si'] -> $ ends with, ^ starts with * contains





    }


    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
