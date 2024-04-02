package org.example.Selenium1703;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sel17 {

    //Xpath Axes

    @Test
    public void testVWOLogin()  {
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/xpath/");
        driver.manage().window().maximize();

        //this will print the text of the following div tag
        //System.out.println( driver.findElement(By.xpath("//div[@class=\"Mammal\"]/following::div")).getText());

        //this will print all the div tag's text inside its own div tag
        //System.out.println( driver.findElement(By.xpath("//div[@class=\"Mammal\"]/self::div")).getText());

        //this will only print the div tags value after mammal div tag
        //System.out.println( driver.findElement(By.xpath("//div[@class=\"Mammal\"]/following-sibling::div")).getText());

        //This will print only the first div tag value inside it
        //System.out.println(driver.findElement(By.xpath("//div[@class=\"Mammal\"]/child::div")).getText());

        //this will print the text of all the div in the page
        //System.out.println(driver.findElement(By.xpath("//div[@class='Mammal']/ancestor::div")).getText());

        //this will print all the div value from Animal div
        //System.out.println(driver.findElement(By.xpath("//div[@class='Animal']/descendant-or-self::div")).getText());



        driver.close();

    }
}
