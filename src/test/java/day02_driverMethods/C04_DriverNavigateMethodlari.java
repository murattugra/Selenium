package day02_driverMethods;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverNavigateMethodlari {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.navigate().to("https://www.amazon.com");

        driver.navigate().to("https://www.techproeducation.com/");

        driver.navigate().back();// onceki sayfaya gider

        driver.navigate().forward();// ileriki sayfaya gider

        driver.navigate().refresh();// sayfayi yeniler






    }






}
