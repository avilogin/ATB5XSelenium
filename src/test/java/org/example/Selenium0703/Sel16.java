package org.example.Selenium0703;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Sel16 {

    @Test
    public void testVWOLogin() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();
       WebElement button_Element =  driver.findElement(By.id("btn-make-appointment"));
       button_Element.click();
       Thread.sleep(3000);
       Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/profile.php#login");

       //Xpath Functions

        driver.findElement(By.xpath("//a[contains(@href,'katalon')]"));//this will find if the given value is present in the code or not.
        driver.findElement(By.xpath("//h3[(text() = 'We Care About Your Health')]"));//this will find the exact text in the codes
        driver.findElement(By.xpath("//a[contains(text(),'Appointment')]"));//this will find the given text in the whole program

        //1:43
        driver.close();

    }
}
