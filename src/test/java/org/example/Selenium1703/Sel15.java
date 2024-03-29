package org.example.Selenium1703;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Sel15 {

    @Test
    public void testVWOLogin() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();
       WebElement button_Element =  driver.findElement(By.id("btn-make-appointment"));

//        WebElement btnElement_CN = driver.findElement(By.className("btn.btn-dark.btn-lg"));
//        WebElement btnElement_PTEXT = driver.findElement(By.partialLinkText("Make"));
//        WebElement btnElement_LTEXT = driver.findElement(By.partialLinkText("Make Appointment"));
//        WebElement btnElement_AT = driver.findElement(By.xpath("//a[@href='./profile.php#login']"));
//       Not RECOM WebElement btnElement_TagName = driver.findElement(By.tagName("a")); // Multiple a tag  - not recommended

       button_Element.click();
       Thread.sleep(3000);
       Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/profile.php#login");

       //WebElement username = driver.findElement(By.id("txt-username"));
        // username.sendKeys("John Doe");


//       WebElement password = driver.findElement(By.xpath("//input[@id='txt-password']"));
//       password.sendKeys("ThisIsNotAPassword");

       List<WebElement> list_pass = driver.findElements(By.xpath("//input[@placeholder='Password']"));
       list_pass.get(1).sendKeys("ThisIsNotAPassword");

       driver.findElement(By.id("btn-login")).click();

        driver.close();

    }
}
