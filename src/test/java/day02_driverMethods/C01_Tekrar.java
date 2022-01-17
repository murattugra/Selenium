package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Tekrar {
    // Selenium un da kendi IDE sie vardir ama biz Intellij i daha kullanisli olduguicin kullaniyoruz
    // intellij de yeni bir proje actigimizda oncelikle selenium kutuphanelerini projeye eklememiz gerekir
    // biz en ilkel haliyle projelerimize kutuphaneleri jar dosyasi olarak indirdik
    // bu ekledigimiz dosyalarla artik driver in ayarlarini yapabiliriz


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        // setProperty method u iki parametre ister
        // ilki kullanacagimiz browser e ait driver
        // ikinci parametre ise ise selenium sitesinden indirip projemize ekledigimiz chromedriver in path i dir
        // windows kullanicilari sona .exe eklerken , apple kullananlar .exe eklememeli


        WebDriver driver = new ChromeDriver();

        driver.get("https://amazon.com");

        Thread.sleep(5000);

        driver.close();
        // driveri kapatinca objede kapanir oyuzden clas in sonunda kapatiriz
        // ama istersek asagidaki gibi tekrar obje olusturabiliriz

        driver=new ChromeDriver();







    }






}
