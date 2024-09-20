package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class C02_IlkTestOtomasyonu {

    public static void main(String[] args) throws InterruptedException {

        /*
            Selenium 4.12 surumu ile birlikte kendi WebDriver class'ini olusturdu
            Disardan baska bir driver kurulum dosyasi tanimlamasaniz da
            SeleniumWebDriver sayesinde driver objesi olusturulur
            ve istenen testler yapilabilir
         */

        // bu alttaki iki satir chrome yeni pencere acilmadigi icin hoca kendi bilgisyari icin yapti
       // ChromeOptions options = new ChromeOptions();
      //  options.addArguments("user-data-dir=C:/path/to/your/custom/profile");

        //System.setProperty("Webdriver.chrome.driver","kurulumDosyalari/chromedriver");

        // bu alttaki satir chrome yeni pencere acilmadigi icin hoca kendi bilgisyari icin yapti
        //C02_IlkTestOtomasyonu_Cem de mesela kullanmadik
        //WebDriver driver = new ChromeDriver(options);
        WebDriver driver = new ChromeDriver();

        //1. testotomasyonu sayfasina gidelim. https://www.testotomasyonu.com/
        driver.get("https://www.testotomasyonu.com");

        //2. Sayfa basligini(title) yazdirin
        System.out.println("Sayfa basligi : " + driver.getTitle());


        //3. Sayfa basliginin “Test Otomasyonu” icerdigini test edin

        String actualSayfaBasligi = driver.getTitle();
        String expectedTitleIcerik = "Test Otomasyonu";

        if (  actualSayfaBasligi.contains(expectedTitleIcerik) ){
            System.out.println("Title testi PASSED");
        }else System.out.println("Title testi FAILED");

        //4. Sayfa adresini(url) yazdirin
        System.out.println(  "Sayfa url : " + driver.getCurrentUrl());

        //5. Sayfa url’inin https://testotomasyonu.com/ oldugunu test edin.

        String expectedUrl = "https://testotomasyonu.com/";
        String actualUrl = driver.getCurrentUrl();

        if (expectedUrl.equalsIgnoreCase(actualUrl)){
            System.out.println("Url testi PASSED");
        }else System.out.println("Url testi FAILED");

        //6. Sayfa handle degerini yazdirin
        System.out.println("Acilan window'un window handle degeri : " + driver.getWindowHandle());

        //7. Sayfa HTML kodlarinda “otomasyon” kelimesi gectigini test edin

        String expectedSayfaKaynagiIcerik = "otomasyon";
        String actualSayfaKaynagi = driver.getPageSource();

        if ( actualSayfaKaynagi.contains(expectedSayfaKaynagiIcerik)){
            System.out.println("Sayfa kaynagi testi PASSED");
        } else System.out.println("Sayfa kaynagi testi FAILED");



        //8. Sayfayi kapatin.
        Thread.sleep(3000);
        driver.quit();

    }
}