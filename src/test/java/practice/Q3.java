package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q3 {
    // ...Exercise3...
// go to url : https://www.techlistic.com/p/selenium-practice-form.html
//fill the firstname
//fill the firstname
//check the gender
//check the experience
//fill the date
//choose your profession -> Automation Tester
//choose your tool -> Selenium Webdriver
//choose your continent -> Antartica
//choose your command  -> Browser Commands
//click submit button

    // ...Alıştırma3...
// url'ye gidin: https://www.techlistic.com/p/selenium-practice-form.html
//adını doldur
//adını doldur
//cinsiyeti kontrol et
//deneyimi kontrol et
//tarihi doldurun
// mesleğinizi seçin -> Otomasyon Test Cihazı
//aracınızı seçin -> Selenium Webdriver
//kıtanızı seçin -> Antartica
// komutunuzu seçin -> Tarayıcı Komutları
//gönder düğmesine tıklayın


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

            driver.manage().deleteAllCookies();// cookiesleri kapatir

        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Murat");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("ali");
        driver.findElement(By.xpath("//input[@id='sex-0']")).click();
        driver.findElement(By.id("exp-0")).click();
        driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("24.01.2022");
        WebElement prf=driver.findElement(By.xpath("//input[@id='profession-1']"));
        prf.click();
        prf.sendKeys(Keys.PAGE_DOWN);
        WebElement continentBox=driver.findElement(By.xpath("(//select[@class='input-xlarge'])[1]"));
        continentBox.click();
        driver.findElement(By.xpath("//option[text()='Europe']")).click();
        driver.findElement(By.xpath("//option[text()='Browser Commands']")).click();
        driver.findElement(By.xpath("//button[text()='Button']")).click();







    }



}


