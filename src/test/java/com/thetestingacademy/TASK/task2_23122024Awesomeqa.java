package com.thetestingacademy.TASK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class task2_23122024Awesomeqa {
    @Test
    public void test_formMethods() throws InterruptedException {
        ChromeOptions options=new ChromeOptions();

        options.addArguments("--incognito");

        options.addArguments("--start-maximized");

        WebDriver driver=new ChromeDriver(options);
        driver.get("https://awesomeqa.com/practice.html");

        // Web Elements

        WebElement firstname= driver.findElement(By.name("firstname"));
        firstname.sendKeys("Praveen");

        WebElement lastname=driver.findElement(By.name("lastname"));
        lastname.sendKeys("Raipuria");

        WebElement gender=driver.findElement(By.id("sex-1"));
        gender.click();

        WebElement YearsofExperience=driver.findElement(By.id("exp-6"));
        YearsofExperience.click();

        WebElement date=driver.findElement(By.id("datepicker"));
        date.sendKeys("25/12/2025");

        WebElement profession= driver.findElement(By.id("profession-0"));
        profession.click();

        WebElement profession1= driver.findElement(By.id("profession-1"));
        profession1.click();

        WebElement selectdropdown=driver.findElement(By.id("continents"));
        Select select=new Select(selectdropdown);
        select.selectByVisibleText("South America");

        Thread.sleep(3000);

        driver.quit();


    }
}



