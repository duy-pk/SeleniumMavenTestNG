package com.duypk.Bai11_Assertsions;

import com.duypk.common.Basetest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoSoftAssert extends Basetest {

    @Test
    public void TestloginCRM(){
        driver.get("https://crm.anhtester.com/admin/authentication");

        SoftAssert softAssert = new SoftAssert();

        String loginHeader = driver.findElement(By.xpath(com.duy_pk.Locator.LoginPageHeader)).getText();
        softAssert.assertEquals(loginHeader,"Login1","Giá trị Header KHÔNG đúng.");

        boolean checkLoginbutton = driver.findElement(By.xpath(com.duy_pk.Locator.LoginButton)).isEnabled();
        softAssert.assertTrue(checkLoginbutton,"Nút Login KHÔNG được hiển thị.");

        driver.findElement(By.xpath(com.duy_pk.Locator.InputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(com.duy_pk.Locator.InputPassword)).sendKeys("123456");
        driver.findElement(By.xpath(com.duy_pk.Locator.InputPassword)).submit();
        sleep(2);

        String menuCusname = driver.findElement(By.xpath(com.duy_pk.Locator.menuCustomers)).getText();
        softAssert.assertTrue(menuCusname.contains("Customer1"),"Tên menu KHÔNG chứa ký " +
                "tự mong muốn: " + "giá trị thực tế: " + menuCusname);

        softAssert.assertAll();
    }

@Test
    public void TestloginCRM2(){
        driver.get("https://crm.anhtester.com/admin/authentication");

        SoftAssert softAssert = new SoftAssert();

        String loginHeader = driver.findElement(By.xpath(com.duy_pk.Locator.LoginPageHeader)).getText();
        softAssert.assertEquals(loginHeader,"Login1","Giá trị Header KHÔNG đúng.");

        boolean checkLoginbutton = driver.findElement(By.xpath(com.duy_pk.Locator.LoginButton)).isEnabled();
        softAssert.assertTrue(checkLoginbutton,"Nút Login KHÔNG được hiển thị.");

        driver.findElement(By.xpath(com.duy_pk.Locator.InputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(com.duy_pk.Locator.InputPassword)).sendKeys("123456");
        driver.findElement(By.xpath(com.duy_pk.Locator.InputPassword)).submit();
        sleep(2);

        String menuCusname = driver.findElement(By.xpath(com.duy_pk.Locator.menuCustomers)).getText();
        softAssert.assertTrue(menuCusname.contains("Customer"),"Tên menu KHÔNG chứa ký " +
                "tự mong muốn: " + "giá trị thực tế: " + menuCusname);

        softAssert.assertAll();
    }
}
