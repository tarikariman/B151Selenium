package techproed.day01_IlkTestDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {

    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");

        // getTitle() methodu sayfa basligi verir
        System.out.println("Amazon Actual Title : "+ driver.getTitle());
        System.out.println("Amazon Actual Url : " + driver.getCurrentUrl());
        String amazonWindowHandle = driver.getWindowHandle();
        System.out.println("Amazon Window Handle Degeri : " + amazonWindowHandle);

        String gitWindowHandle = driver.getWindowHandle();

        driver.get("https://techproeducation.com");
        System.out.println("Techproeducation Actual Title : " + driver.getTitle());

        // getCurrentUrl() gidilen sayfanin URl'sini verir
        System.out.println("Techproeducation Actual Url : " + driver.getCurrentUrl());

        // getPageSource() Acilan sayfanin kaynak kodlarini verir
        //System.out.println(driver.getPageSource()); Bilerek yoruma aldik

        // getWindowHandle() gidilen sayfanin handle degerini(hashKod) verir.Bu handle degerini sayfalar arasi gecis icin kullaniriz
        System.out.println("Techproeducation Window Handle Degeri : " + driver.getWindowHandle());


    }
}
