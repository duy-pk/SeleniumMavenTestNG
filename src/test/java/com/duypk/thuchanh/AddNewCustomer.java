package com.duypk.thuchanh;

import com.duy_pk.Locator;
import com.duypk.common.Basetest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AddNewCustomer extends Basetest {

    @Test
    public void testAddCustumor(){
//        String CompanyName = "Nissan";
        driver.get("https://crm.anhtester.com/admin/authentication");

        Assert.assertTrue(driver.findElement(By.xpath(com.duy_pk.Locator.LoginPageHeader)).isDisplayed()
                ,"KHONG phai trang Login");

        driver.findElement(By.xpath(com.duy_pk.Locator.InputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(com.duy_pk.Locator.InputPassword)).sendKeys("123456");
        driver.findElement(By.xpath(com.duy_pk.Locator.LoginButton)).click();

        Assert.assertTrue(driver.findElement(By.xpath(com.duy_pk.Locator.menuDashboard)).isDisplayed()
                ,"KHONG phai trang Dashboard");

        driver.findElement(By.xpath(com.duy_pk.Locator.menuCustomers)).click();

        Assert.assertTrue(driver.findElement(By.xpath(com.duy_pk.Locator.CustomersPageHeader)).isDisplayed()
                ,"KHONG phai trang Dashboard");
        Assert.assertEquals(driver.findElement(By.xpath(com.duy_pk.Locator.CustomersPageHeader)).getText()
                ,"Customers Summary","Noi dung CustomersHeader KHONG dung");

        driver.findElement(By.xpath(com.duy_pk.Locator.AddNewCustomerButton)).click();

        driver.findElement(By.xpath(com.duy_pk.Locator.InputCompanyName)).sendKeys(CompanyName);
        driver.findElement(By.xpath(com.duy_pk.Locator.InputVATnumber)).sendKeys("3");
        driver.findElement(By.xpath(com.duy_pk.Locator.InputPhone)).sendKeys("0976367965");
        driver.findElement(By.xpath(com.duy_pk.Locator.InputWebsite)).sendKeys("khuongduy.com");
        driver.findElement(By.xpath(com.duy_pk.Locator.DropdownGroups)).click();
        driver.findElement(By.xpath(com.duy_pk.Locator.InputSearchGroups)).sendKeys("VIP");
        driver.findElement(By.xpath(com.duy_pk.Locator.InputSearchGroups)).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath(com.duy_pk.Locator.DropdownGroups)).click();

        driver.findElement(By.xpath(com.duy_pk.Locator.InputAddress)).sendKeys("Gia Lam");
        driver.findElement(By.xpath(com.duy_pk.Locator.InputCity)).sendKeys("HA NOI");
        driver.findElement(By.xpath(com.duy_pk.Locator.InputState)).sendKeys("VietNam");
        driver.findElement(By.xpath(com.duy_pk.Locator.InputZipCode)).sendKeys("123");
        driver.findElement(By.xpath(com.duy_pk.Locator.DropdownCountry)).click();
        driver.findElement(By.xpath(com.duy_pk.Locator.InputSearchCountry)).sendKeys("Vietnam");
        driver.findElement(By.xpath(com.duy_pk.Locator.InputSearchCountry)).sendKeys(Keys.ENTER);
        sleep(2);
        driver.findElement(By.xpath(com.duy_pk.Locator.SaveCustomerButton)).click();
        sleep(2);

        driver.findElement(By.xpath(com.duy_pk.Locator.menuCustomers)).click();
        driver.findElement(By.xpath(com.duy_pk.Locator.InputCustomersSearch)).sendKeys(CompanyName);
        sleep(2);
        Assert.assertEquals(driver.findElement(By.xpath(Locator.firstSearhCustomers)).getText(),CompanyName,
                "Ten Customer KHONG ton tai");
        driver.findElement(By.xpath(Locator.firstSearhCustomers)).click();
        sleep(2);
        Assert.assertEquals(driver.findElement(By.xpath(Locator.InputCompanyName)).getAttribute("value"),CompanyName,
                "Ten Company trong profile KHONG dung");
        Assert.assertEquals(driver.findElement(By.xpath(Locator.InputPhone)).getAttribute("value"),"0976367965",
                "So dien thoai trong profile KHONG dung");
        captureScreenImage("AddCustomer_complete");
    }

    @Test
    public void testAddNewContact(){
        driver.get("https://crm.anhtester.com/admin/authentication");

        Assert.assertTrue(driver.findElement(By.xpath(com.duy_pk.Locator.LoginPageHeader)).isDisplayed()
                ,"KHONG phai trang Login");

        driver.findElement(By.xpath(com.duy_pk.Locator.InputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(com.duy_pk.Locator.InputPassword)).sendKeys("123456");
        driver.findElement(By.xpath(com.duy_pk.Locator.LoginButton)).click();

        Assert.assertTrue(driver.findElement(By.xpath(com.duy_pk.Locator.menuDashboard)).isDisplayed()
                ,"KHONG phai trang Dashboard");

        driver.findElement(By.xpath(com.duy_pk.Locator.menuCustomers)).click();
        sleep(1);
        Assert.assertTrue(driver.findElement(By.xpath(com.duy_pk.Locator.CustomersPageHeader)).isDisplayed()
                ,"KHONG phai trang Dashboard");
        Assert.assertEquals(driver.findElement(By.xpath(com.duy_pk.Locator.CustomersPageHeader)).getText()
                ,"Customers Summary","Noi dung CustomersHeader KHONG dung");

        driver.findElement(By.xpath(com.duy_pk.Locator.InputCustomersSearch)).sendKeys(CompanyName);
        sleep(1);
        Assert.assertEquals(driver.findElement(By.xpath(Locator.firstSearhCustomers)).getText(),CompanyName,
                "Ten Customer KHONG ton tai");
        driver.findElement(By.xpath(Locator.firstSearhCustomers)).click();

        driver.findElement(By.xpath(Locator.menuContact)).click();
        sleep(1);
        Assert.assertEquals(driver.findElement(By.xpath(Locator.contactHeader)).getText()
                ,"Contacts","Noi dung contactHeader KHONG dung");

        driver.findElement(By.xpath(Locator.addNewContactButton)).click();
        sleep(1);
        Assert.assertEquals(driver.findElement(By.xpath(Locator.contactDialogHeader)).getText()
                ,"Add new contact","Noi dung contactDialogHeader KHONG dung");

        driver.findElement(By.xpath(Locator.profileImage)).sendKeys(System.getProperty("user.dir")
                +"\\picture\\kop.png");
        sleep(1);

        driver.findElement(By.xpath(Locator.contactFirstNameInput)).sendKeys(ContactFirstName);
        driver.findElement(By.xpath(Locator.contactLastNameInput)).sendKeys(ContactLastName);
        driver.findElement(By.xpath(Locator.contactPosition)).sendKeys(ContactPosition);
        driver.findElement(By.xpath(Locator.contactEmailInput)).sendKeys(ContactEmail);
        driver.findElement(By.xpath(Locator.contactGeneratePass)).click();
        driver.findElement(By.xpath(Locator.contactPassShow)).click();
        driver.findElement(By.xpath(Locator.contactSave)).click();
        sleep(1);

        driver.findElement(By.xpath(Locator.contactSearch)).sendKeys(ContactFirstName+" "+ContactLastName);
        driver.findElement(By.xpath(Locator.contactSearch)).sendKeys(Keys.ENTER);
        sleep(1);
        driver.findElement(By.xpath(Locator.contactedName)).click();
        sleep(2);

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(driver.findElement(By.xpath(Locator.contactFirstNameInput)).getAttribute("value"),
                ContactFirstName,"Gia tri FirstName KHONG dung");
        softAssert.assertEquals(driver.findElement(By.xpath(Locator.contactEmailInput)).getAttribute("value"),
                ContactEmail,"Gia tri Email KHONG dung");

        softAssert.assertAll();
        sleep(1);
        captureScreenImage("AddCustomerContact_complete");
    }
}
