package org.newtours.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args){
        WebDriver driver;
        String baseURL = "http://live.demoguru99.com/index.php/tv.html";
        String actualResult = "";
        String expectedResult = "$615.00";
        String chromePath = System.getProperty("user.dir") + "\\drivers\\chromedriver.exe";

        System.setProperty("webdriver.chrome.driver", chromePath);
        driver = new ChromeDriver();
        driver.get(baseURL);
        driver.manage().window().maximize();

        //Click en link TV
        driver.findElement(By.linkText("TV")).click();

        //Click en boton ADD TO CARD
        driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[2]/ul/li[1]/div/div[3]/button/span/span")).click();

        // Crear xpath = //tagname[@Atributo='valor'] o //*[@Atributo='valor'] //input[@name='firstname]

        //Obtener el precio
        actualResult = driver.findElement(By.cssSelector("#shopping-cart-table>tbody>tr>td.product-cart-total>span>span")).getText();

        if (actualResult.contentEquals(expectedResult)){
            System.out.println("Test Passed! The actual result is: " + actualResult + " is equal to " + expectedResult);
        } else {
            System.out.println("Test Failed! The actual result is: " + actualResult + " is not equal to " + expectedResult);
        }

        driver.close();
    }
}
