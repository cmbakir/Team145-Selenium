package Practicetest.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P04_Testing {
    public static void main(String[] args) {
        /*
          1-Driver oluşturalim
          2-Java class'imiza chromedriver.exe i tanitalim
          3-Driver'in tum ekranı kaplamasini saglayalim
          4-Driverla sayfanın yuklenmesini 10.000 milisaniye boyunca beklemesini
            söyleyelim. Eger oncesinde sayfa Yüklenirse, beklemeyi bıraksın.
          5-"https://www.testotomasyonu.com” adresine gidelim
          6-Bu web adresinin sayfa basligini (title) ve adres (url)ini alalim
          7-Title'ın Test ve url inin testotomasyonu kelimesini içerip icermedigini kontrol edelim
          8-Ardindan "https://wisequarter.com/” adresine gidip
          9-Bu adresin basligini alalim ve "Quarter” kelimesini icenip icermedigini kontrol edelim
          10-Bir onceki web sayfamiza geri donelim
          11-Sayfayı yenileyelim
          12-Daha sonra web sayfamiza tekrar donelim ve oldugumuuz sayfayi kapatalim
          13- En son adim olarak butun sayfalarimizi kapatmis olalim
         */

        System.setProperty("Webdriver.chrome.driver","resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
        driver.get("https://www.testotomasyonu.com");

        String titleTestOtomasyonu=driver.getTitle();
        String urlTestOtomasyonu= driver.getCurrentUrl();

        if (titleTestOtomasyonu.contains("Test")){
            System.out.println("Test otomasyonu Title PASSED");
        }else{
            System.out.println("Test otomasyonu Title FAILED");
        }

        if (urlTestOtomasyonu.contains("testotomasyonu")){
            System.out.println("Test otomasyonu url PASSED");
        }else{
            System.out.println("Test otomasyonu url FAILED");
        }

        driver.navigate().to("https://wisequarter.com/");

        String wiseTitle= driver.getTitle();
        if (wiseTitle.contains("Quarter")){
            System.out.println("Wise Quarter Title PASSED");
        }else{
            System.out.println("Wise Quarter Title FAILED");
        }




        driver.quit();

    }
}