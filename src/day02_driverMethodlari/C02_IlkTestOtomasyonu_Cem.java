package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_IlkTestOtomasyonu_Cem {

    public static void main(String[] args) {

      /*
        1. testotomasyonu sayfasina gidelim. https://www.testotomasyonu.com/
        2. Sayfa basligini(title) yazdirin
        3. Sayfa basliginin “Test Otomasyonu” icerdigini test edin
        4. Sayfa adresini(url) yazdirin
        5. Sayfa url’inin https://testotomasyonu.com/ oldugunu test edin.
        6. Sayfa handle degerini yazdirin
        7. Sayfa HTML kodlarinda “otomasyon” kelimesi gectigini test edin
        8. Sayfayi kapatin.

       */

        System.setProperty("Webdriver.chrome.driver","kurulumDosyalari/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://testotomasyonu.com");

        System.out.println(driver.getTitle());

        String sayfabasligi = driver.getTitle();

        if (sayfabasligi.contains("Test Otomasyonu")) {
            System.out.println("Sayfa basligi test otomasyonu iceriyor");
        }
        System.out.println(driver.getCurrentUrl());

        String sayfaUrl = driver.getCurrentUrl();
        if(sayfaUrl=="https://testotomasyonu.com/") {
            System.out.println("Sayfa URL si :" + sayfaUrl);

            driver.getWindowHandle();

            String PageSource =driver.getPageSource();
            if(PageSource.contains("otomasyon")){
                System.out.println("Sayfa HTML kodlari *otomasyon kelimesi* iceriyor");
                driver.quit();
            }

        }



    }



}
