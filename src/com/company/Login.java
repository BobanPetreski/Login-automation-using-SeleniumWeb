package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Login {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Users/Boban/Downloads/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://nop40.different.com.mk/login");

        driver.manage().window().maximize();

        //Login
        driver.findElement(By.id("Email")).sendKeys("bosh.petreski@gmail.com");
        driver.findElement(By.name("Password")).sendKeys("bobo0709");
        driver.findElement(By.id("RememberMe")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/input")).click();

        String url = driver.getCurrentUrl();
        if (url.equals("http://nop40.different.com.mk/"))
            System.out.println("Login successful");
        else
            System.out.println("Login unsuccessful");

        driver.quit();


    }

}
