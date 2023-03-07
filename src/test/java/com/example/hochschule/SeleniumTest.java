package com.example.hochschule;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SeleniumTest {
    public static void wait(int ms)
    {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
    @Test
    public void testSelenium() {
        // WebDriverManager.chromedriver().setup();

        System.setProperty("webdriver.chrome.driver", "C:\\Meine Dateien\\5.Semster FHDW\\Testing\\chromedriver.exe");
        // Starte den Chrome Webdriver
        WebDriver driver = new ChromeDriver();

        // Lade die Webseite
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        // Füge hier deine Test-Assertions hinzu
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        WebElement btnSubmit = driver.findElement(By.xpath("/html/body/main/div/form/div/div[2]/button"));
        btnSubmit.click();
        
        // Schließe den WebDriver nach 5s
        wait(5000);
        driver.quit();
    }
}
