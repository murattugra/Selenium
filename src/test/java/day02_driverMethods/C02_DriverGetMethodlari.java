package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverGetMethodlari {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.de/");

        System.out.println(driver.getTitle());// sayfanin titlesini getirir

        System.out.println(driver.getCurrentUrl());// sayfanin adresini getirir

        System.out.println(driver.getWindowHandle());//CDwindow-....... o anki kimlik adreis yazar

        System.out.println(driver.getPageSource()); // sayfanin arka plandaki htlm kodlarini getirir





    }





}
