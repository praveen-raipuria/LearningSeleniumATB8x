package com.thetestingacademy.TASK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class task3_30122024_ebay_search {
    @Test
    public void test_Method() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        // Verify the Search field with any keyword
        WebElement search_item = driver.findElement(By.xpath("//input[@id='gh-ac']"));
        search_item.sendKeys("macmini");

        // Verify the Search button
        WebElement search_btn = driver.findElement(By.xpath("//input[@id='gh-btn']"));
        search_btn.click();

        // Verify the items list and price list
        //Will give list of elements
        List<WebElement> searchTitles = driver.findElements(By.xpath("//div[@class='s-item__title']"));
        List<WebElement> searchPricesTitles = driver.findElements(By.xpath("//span[@class='s-item__price']"));

        int size = Math.min(searchTitles.size(), searchPricesTitles.size());

        for(int i=0; i<size; i++)
        {
            System.out.println("Title : "+searchTitles.get(i).getText() + " || " + "Price : " +searchPricesTitles.get(i).getText());
        }
        Thread.sleep(3000);
        driver.quit();
    }
}

