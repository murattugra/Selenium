package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q5 {


// ...Exercise4...
// Navigate to website  https://testpages.herokuapp.com/styled/index.html
// Under the  ORIGINAL CONTENTS
// click on Alerts
// print the URL
// navigate back
// print the URL
// Click on Basic Ajax
// print the URL
// enter value-> 20 and Enter
// and then verify Submitted Values is displayed open page
// close driver


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get(" https://testpages.herokuapp.com/styled/index.html");
        driver.findElement(By.xpath("//a[@id='alerts']")).click();
        System.out.println(driver.getCurrentUrl());
        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.linkText("Basic Ajax")).click();
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.id("lteq30")).sendKeys("20"+ Keys.ENTER);
        boolean subText=driver.findElement(By.xpath("//p[text()='Submitted Values']")).isDisplayed();
        if (subText){
            System.out.println("Text gorunuyor");
        }else {
            System.out.println("Text gorunmuyor");
        }
        driver.close();




    }





}
