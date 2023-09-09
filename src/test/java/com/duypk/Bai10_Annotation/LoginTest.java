package com.duypk.Bai10_Annotation;

import com.duypk.common.Basetest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class LoginTest extends Basetest {

    @Test
    public void testLogin(){
        driver.get("https://www.google.com.vn/");
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).clear();
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).click();
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(Keys.ENTER);
    }
}
