package com.thetestingacademy.TASK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class task_iDrive360_Login_Verify {
    @Test
    public void test_Method() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.idrive360.com/enterprise/login");
        Thread.sleep(30000);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        // Assert.assertEquals(driver.getTitle(),"IDrive® 360 - Sign in to your account");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.idrive360.com/enterprise/login");

        //Step 1: Verify the Email field
        //<input _ngcontent-xwa-c4=""
        // autofocus=""
        // class="id-form-ctrl ng-pristine ng-valid ng-touched"
        // id="username"
        // name="username"
        // type="email">
        Thread.sleep(30000);
        WebElement email_Field = driver.findElement(By.xpath("//input[@id='username']"));
        email_Field.sendKeys("augtest_040823@idrive.com");

        //Step 2: Verify the password field
        // <input _ngcontent-xwa-c4=""
        // class="id-form-ctrl ng-untouched ng-pristine ng-valid"
        // id="password"
        // maxlength="20"
        // name="password"
        // tabindex="0"
        // type="password">
        Thread.sleep(30000);
        WebElement password_field = driver.findElement(By.xpath("//input[@id='password']"));
        password_field.sendKeys("123456");

        // Step 3: Verify the Sign in button
        // <button _ngcontent-hif-c4=""
        // class="id-btn id-info-btn-frm"
        // id="frm-btn"
        // type="submit">
        // Sign in
        // </button>
        Thread.sleep(30000);
        WebElement sign_In_Button = driver.findElement(By.id("frm-btn"));
        sign_In_Button.click();

        // In top the below message displayed
        // <span _ngcontent-sdg-c4="">
        // Your free trial has expired
        // </span>


        // In middle of the scree the below message displayed
        // <h5 _ngcontent-sdg-c10=""
        // class="id-card-title">
        // Your free trial has expired
        // </h5>
        Thread.sleep(30000);
        WebElement errorMessage = driver.findElement(By.xpath("//h5[@class='id-card-title']"));


        Assert.assertEquals(errorMessage.getText(), "Your free trial has expired");
        System.out.println("Message verification:"+errorMessage.getText());

        driver.quit();

    }
}

