package day02_driverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C07_ManegeWindowSet {

//1. Yeni bir Class olusturalim.C07_ManageWindowSet




    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        //2. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        //3. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());
        //4. Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        driver.manage().window().setPosition(new Point(0,0));
        driver.manage().window().setSize(new Dimension(300,500));


//5. Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        int xKordinati=driver.manage().window().getPosition().getX();
        int yKordinati=driver.manage().window().getPosition().getY();
        int genislik=driver.manage().window().getSize().getWidth();
        int yukseklik=driver.manage().window().getSize().getHeight();

        if (xKordinati==0&&yKordinati==0&&genislik==300&&yukseklik==500){
            System.out.println("Olceklendirme Testi PASS");
        }else {
            System.out.println("Olceklendirme Testi FAIL");
        }

//8. Sayfayi kapatin

        driver.close();












    }






}
