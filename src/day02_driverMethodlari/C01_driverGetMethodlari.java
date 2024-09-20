package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C01_driverGetMethodlari {

    public static void main(String[] args) throws InterruptedException {

     //   ChromeOptions options = new ChromeOptions();  bu kisimlar direk google penceresi acilmazsa
        //options.addArguments("--disable-infobars");
        //options.addArguments("--disable-default-apps");
        //options.addArguments("--disable-notifications");
        //options.addArguments("--start-maximized");
     //   options.addArguments("user-data-dir=C:/path/to/your/custom/profile");

        System.setProperty("Webdriver.chrome.driver","kurulumDosyalari/chromedriver");
      //  WebDriver driver = new ChromeDriver(options);
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.testotomasyonu.com");

        System.out.println(driver.getTitle()); // Test Otomasyonu - Test Otomasyonu

        System.out.println(driver.getCurrentUrl()); // https://www.testotomasyonu.com/

        Thread.sleep(1000);

        driver.get("https://www.ramazon.com");

        System.out.println(driver.getCurrentUrl()); // https://www.amazon.com/

        System.out.println(driver.getWindowHandle());  // 9EC53A6D776359A41B54B0268549A353
        // windowHandle degeri WebDriver'in olusturdugu her driver objesine verdigi
        // unique bir degerdir (hash code gibi)
        // Eger test calisirken birden fazla window acilirsa
        // driver'in acilan window'lar arasinda gecis yapabilmesi icin
        // windowHandleDegerini yazmamiz gerekir

        System.out.println(driver.getWindowHandles());
        // test sirasinda acilan tum windowlarin window handle degerlerini
        // bir Set olarak bize getirir
        // [9EC53A6D776359A41B54B0268549A353]

        System.out.println("============================");
        System.out.println(driver.getPageSource());


        Thread.sleep(3000);
        driver.quit();
    }
}