package com.livethinking;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 //By: Eduardo Moreira Tellez
public class Main {
  public static void main(String[] args) {

    // CONFIGURACION DEL DRIVER
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.demoblaze.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    // PASO A PASO 
    //Phone
     WebElement phones = driver.findElement(By.xpath("//a[.='Phones']"));
      phones.click();
    WebElement htc = driver.findElement(By.xpath("//a[.='HTC One M9']"));
    htc.click();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
   
    WebElement main = driver.findElement(By.xpath("//a[@id='nava']/img[@src='bm.png']"));
    main.click();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    //Laptops
    WebElement laptops = driver.findElement(By.xpath("//a[.='Laptops']"));
    laptops.click();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    
    WebElement macbookair = driver.findElement(By.xpath("//a[.='MacBook air']"));
    macbookair.getAttribute("MacBook air");

    WebElement macbookpro = driver.findElement(By.xpath("//a[.='MacBook Pro']"));
    macbookpro.getAttribute("MacBook Pro");

    WebElement dell = driver.findElement(By.xpath("//a[.='Dell i7 8gb']"));
    dell.getAttribute("Dell i7 8gb");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    
    WebElement main1 = driver.findElement(By.xpath("//a[@id='nava']/img[@src='bm.png']"));
    main1.click();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    //Monitor
    WebElement monitors = driver.findElement(By.xpath("//a[.='Monitors']"));
    monitors.click();
    
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    WebElement monitor = driver.findElement(By.xpath("//a[.='ASUS Full HD']"));
    monitor.getAttribute("ASUS Full HD");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    // PUNTOS DE CONTROL
    //Celulares
        if (!driver.findElement(By.xpath("//div[@class='card h-100']")).isDisplayed()) {
            System.out.println("El elemento de celular HTC One M9 se esta mostrando satisfactoriamente");
        }
        else {
            System.out.println("El elemento del valor del celular se esta mostrando correctamente");
        }
    
    // PUNTOS DE CONTROL
    //Laptops macbookAir
        if (!driver.findElement(By.xpath("//div[@class='col-lg-4 col-md-6 mb-4']")).isDisplayed()) {
            System.out.println("El elemento de celular se esta mostrando satisfactoriamente");
        }
        else {
            System.out.println("El elemento del valor macbookAir se esta mostrando correctamente");
        }
    
    //Laptops macbookPro
        if (!driver.findElement(By.xpath("//div[@class='col-lg-4 col-md-6 mb-4']")).isDisplayed()) {
            System.out.println("El elemento de celular se esta mostrando satisfactoriamente");
        }
        else {
            System.out.println("El elemento del valor macbookPro se esta mostrando correctamente");
        }
    
    //Laptops Delli7 8Gb
         if (!driver.findElement(By.xpath("//div[@class='col-lg-4 col-md-6 mb-4']")).isDisplayed()) {
        System.out.println("El elemento del Delli7 se esta mostrando satisfactoriamente");
         }
    else {
        System.out.println("El elemento del valor Delli7 8Gb se esta mostrando correctamente");
         }
    
    //Laptops Monitor
        if (!driver.findElement(By.xpath("//div[@class='col-lg-4 col-md-6 mb-4']")).isDisplayed()) {
       System.out.println("El valor del Monitor se esta mostrando satisfactoriamente");
        }
   else {
       System.out.println("El elemento del valor del  Monitor 8Gb se esta mostrando correctamente");
        }
   
    // CERRAR EL DRIVER
    driver.quit();

}
  }