package Practicetest.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P01_ilkTest {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver","resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.babayigit.net");
        Thread.sleep(3000);
        driver.quit();
    }

}