package com.duypk.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Basetest {

    public WebDriver driver;
    public static String CompanyName = "Nissan";
    public static String ContactFirstName = "Pham";
    public static String ContactLastName = "Khuong Duy";
    public static String ContactPosition = "VIP";
    public static String ContactEmail = "khuongduypham0175@gmail.com";

//    @BeforeMethod
    public void createBrowser(){
        System.setProperty("webdriver.http.factory", "jdk-http-client");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
    }

    @BeforeMethod
    @Parameters({"browserName"})
    public void createBrowser(@Optional("Chrome") String browser){
        System.setProperty("webdriver.http.factory", "jdk-http-client");

        if(browser.equals("Chrome")){
            driver = new ChromeDriver();
        }
        if (browser.equals("Edge")){
            driver = new EdgeDriver();
        }
        if (browser.equals("Firefox")){
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void closeBrowser(){
        sleep(2);
        driver.quit();
    }

    public void sleep(double second){
        try {
            Thread.sleep((long) second*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void clickElement(String locator){
        driver.findElement(By.xpath(locator)).click();
    }

    public void setText(String locator, String text){
        driver.findElement(By.xpath(locator)).sendKeys(text);
    }

    public void captureScreenImage(String imageName) {
        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }

        //Get size screen browser
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println(screenSize);
        //Khởi tạo kích thước khung hình với kích cỡ trên
        Rectangle screenRectangle = new Rectangle(screenSize);
        //Tạo hình chụp với độ lớn khung đã tạo trên
        BufferedImage image = robot.createScreenCapture(screenRectangle);
        //Lưu hình vào dạng file với dạng png
        File file = new File(imageName + ".png");
        try {
            ImageIO.write(image, "png", file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
