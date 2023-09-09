package com.duypk.Bai11_Assertsions;

import com.duypk.common.Basetest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoHardAssert extends Basetest {

    @Test
    public void TestloginCRM(){
        driver.get("https://crm.anhtester.com/admin/authentication");

        String loginHeader = driver.findElement(By.xpath(com.duy_pk.Locator.LoginPageHeader)).getText();
        Assert.assertEquals(loginHeader,"Login","Giá trị Header KHÔNG đúng");

        boolean checkLoginbutton = driver.findElement(By.xpath(com.duy_pk.Locator.LoginButton)).isEnabled();
        Assert.assertTrue(checkLoginbutton,"Nút Login KHÔNG được hiển thị");

        driver.findElement(By.xpath(com.duy_pk.Locator.InputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(com.duy_pk.Locator.InputPassword)).sendKeys("123456");
        driver.findElement(By.xpath(com.duy_pk.Locator.InputPassword)).submit();
        sleep(2);

        String menuCusname = driver.findElement(By.xpath(com.duy_pk.Locator.menuCustomers)).getText();
        Assert.assertTrue(menuCusname.contains("Customer"),"Tên menu KHÔNG chứa ký " +
                "tự mong muốn: " + "giá trị thực tế: " + menuCusname);
    }

}
