package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c01_ilkClass {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");


        WebDriver driver = new ChromeDriver();
        // biz driver objesi olusturdugumuz da bos bir chrome browser acilir

        driver.get("https://www.ebay.com");
        // driver.get metodu drivere gidecegi web adresini girmememizi saglar



        Thread.sleep(3000);


        driver.close();
        // driveri kapatir









    }



}
