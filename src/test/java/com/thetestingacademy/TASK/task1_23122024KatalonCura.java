package com.thetestingacademy.TASK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class task1_23122024KatalonCura {
    @Test
    public void testKatalonStudioLoginPage() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--incognito");

        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        WebElement make_appointment = driver.findElement(By.id("btn-make-appointment"));
        make_appointment.click();

        WebElement Username = driver.findElement(By.id("txt-username"));
        Username.sendKeys("John Doe");

        WebElement Password = driver.findElement(By.id("txt-password"));
        Password.sendKeys("ThisIsNotAPassword");

        WebElement login_button = driver.findElement(By.id("btn-login"));
        login_button.click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");


        Thread.sleep(3000);

        driver.quit();
    }
}



//Second way

//@Test
//public void test2_23122024KatalonCura() throws Exception {
//
//    ChromeOptions options=new ChromeOptions();
//    options.addArguments("--start-maximized");
//
//    WebDriver driver=new ChromeDriver(options);
//    driver.get("https://katalon-demo-cura.herokuapp.com/");
//    //Appointment button
//    WebElement makeAppointmentButton= driver.findElement(By.id("btn-make-appointment"));
//    makeAppointmentButton.click();
//
//    // find username and password fields
//    WebElement username=driver.findElement(By.id("txt-username"));
//    WebElement password= driver.findElement(By.id("txt-password"));
//
//    username.sendKeys("John Doe");
//    password.sendKeys("ThisIsNotAPassword");
//
//    WebElement submitbutton=driver.findElement(By.id("btn-login"));
//    submitbutton.click();
//
//    String expectedUrl="https://katalon-demo-cura.herokuapp.com/#appointment";
//    String actualurl=driver.getCurrentUrl();
//
//    if(actualurl.equals(expectedUrl)){
//        System.out.println("Actual and Expected URLs are same "+expectedUrl);
//    }
//    else{
//        throw new Exception("Actual and expected urls are not same");
//    }
//    driver.quit();
//}
//

