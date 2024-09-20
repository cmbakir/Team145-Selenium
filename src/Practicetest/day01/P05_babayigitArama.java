package Practicetest.day01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P05_babayigitArama {
        /*
        1-https://babayigit.net/test/index.html adresine gidin
        2-Arama kutusuna wise quarter yazıp saerch butonuna tıklayın
        3-Arama sonuçlarında sonuç sayısını kaydedip yazdırın
         */

    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver","resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://babayigit.net/test/index.html");

        driver.findElement(By.id("search")).sendKeys("wise quarter"+ Keys.ENTER);
        driver.findElement(By.id("hdtb-tls")).click();
        System.out.println("Arama Sonuç Sayısı: "+driver.findElement(By.id("result-stats")).getText());


        driver.quit();
    }
}