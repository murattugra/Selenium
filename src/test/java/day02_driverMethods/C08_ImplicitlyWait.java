package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C08_ImplicitlyWait {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");


        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();        // Bunlari en basta her zaman yazmak gerekir
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));  //  bunuda yaz hep
        // implicitly wait testimiz boyunca sayfa acilmasi ve element bulmasi konusunda driver 'in
        //bekleyecegi maximum sureyi belirler.
        //Bu sure icinde gorevi bitirir bitirmez , bir sonraki goreve gecer
        //Bu sure icinde bitiremezse o zaman hata verir

        // Bu sure mutlaka beklemesi gereken sure degildir  Tread.sleep deki gibi

        driver.get("https://techproeducation.com");

      //  Thread.sleep(5000);








    }
}
