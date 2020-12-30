package MiHCM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

 


public class HCM {
@Test 
    public void Test()
    {
	

    //   WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Drivers\\chromedriver.exe");
           // ChromeOptions options = new ChromeOptions();
          //     options.setHeadless(true);
             // System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
        
            //Headless 
            // ChromeOptions options = new ChromeOptions(); 
             //options.addArguments("--headless");
               WebDriver driver = new ChromeDriver();
                
           
                driver.get("http://demo.guru99.com/V4/");
            
                driver.findElement(By.name("uid")).sendKeys("mngr290639");
           
                driver.findElement(By.name("password")).sendKeys("YqYsajY");
             //   driver.findElement(By.name("password")).submit();
               driver.findElement(By.name("btnLogin")).click();
                
                
          WebDriverWait wait = new WebDriverWait(driver, 20);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[@class='heading3']/td")));
               //String heading =  driver.findElement(By.xpath("//tr[@class='heading3']/td")).getText();
                
                Assert.assertEquals(driver.findElement(By.xpath("//tr[@class='heading3']/td")).getText(), "Manger Id : mngr290639");
            
                driver.close();
                driver.quit();
    }
    
}