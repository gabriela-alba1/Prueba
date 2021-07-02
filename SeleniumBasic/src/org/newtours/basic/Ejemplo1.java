package org.newtours.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ejemplo1 {
    public static void main(String[] args){
        //Instanciar objeto de tipo webDriver
        WebDriver driver;

        //Declarar variables
        String baseURL = "http://demo.guru99.com/test/newtours/";
        String actualResult = "";
        String expectedResult = "Welcome: Mercury Tours";

        //Indicar donde se localiza chromeDriver
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");

        //Abrir el navegador
        driver = new ChromeDriver();

        //Navegar a la pagina
        driver.get(baseURL);

        //Extraer el titulo de la pagina web
        actualResult = driver.getTitle();

        //Imprimir el resultado usando el operador ternario
        System.out.println(actualResult.contentEquals(expectedResult) ? "Test Passed " + actualResult : " Test Failed");

        driver.close();
    }
}
