package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_GetMethods {
//1. Yeni bir package olusturalim : day01
//2. Yeni bir class olusturalim : C01_GetMethods



    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        //3. Amazon sayfasina gidelim. https://www.amazon.com/

        driver.get("https://www.amazon.com/");

        //4. Sayfa basligini(title) yazdirin
        System.out.println(driver.getTitle());

        //5. Sayfa basliginin “Amazon” icerdigini test edin
        String actualTitel= driver.getTitle();
        String arananKelime="Amazon";

        if (actualTitel.contains(arananKelime)){
            System.out.println("Titel testi PASS");
        }else {
            System.out.println("Titel testi FAIL");
            System.out.println("Saysanin title si : "+actualTitel);
        }

        //6. Sayfa adresini(url) yazdirin

        System.out.println(driver.getCurrentUrl());
        //7. Sayfa url’inin “amazon” icerdigini test edin.
        String url= driver.getCurrentUrl();
        String urlArananKelime="amazon";


        if (url.contains(urlArananKelime)){
                System.out.println("Url testi PASS");
            }else {
                System.out.println("Url test FAIl");
                System.out.println("Url :"+url);
            }

        //8. Sayfa handle degerini yazdirin
        System.out.println(driver.getWindowHandle());
        String Handle=driver.getWindowHandle();
        //9. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin
        String actualPageSource=driver.getPageSource();
        String pageArananKelime="alisveris";
        if (actualPageSource.contains(pageArananKelime)){

            System.out.println("PageSource testi PASS");
        }else {
            System.out.println("PageSource testi PASS");
        }

        //10. Sayfayi kapatin.

            driver.close();




    }


}
