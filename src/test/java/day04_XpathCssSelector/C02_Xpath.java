package day04_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Xpath {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //2- Add Element butonuna basin

        WebElement addElement=driver.findElement(By.xpath("//button[@onclick='addElement()']"));
     addElement.click();

        //3- Delete butonu’nun gorunur oldugunu test edin

        WebElement deleteElement=driver.findElement(By.xpath("//button[@class='added-manually']"));
        if (deleteElement.isDisplayed()){
            System.out.println("delete gorunuyor test PASS");
        } else {
            System.out.println("delete gorunuyor test FAILED");
        }

        //4- Delete tusuna basin
        deleteElement.click();

        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin

        WebElement addYazisiElementi=driver.findElement(By.xpath("//h3"));
      //  WebElement addYazisiElmenti2=driver.findElement(By.tagName("h3"));

        if (addYazisiElementi.isDisplayed()){
            System.out.println("addElementi gorunuyor test PASS");
        } else {
            System.out.println("addELEMENTI gorunuyor test FAILED");
        }

        driver.close();

    }
}
