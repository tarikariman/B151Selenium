package techproed.day01_IlkTestDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkTest {
    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");

        System.out.println(System.getProperty("chromeDriver"));


        WebDriver driver = new ChromeDriver();
        //ChromeDriver turunde yeni bir obje olusturduk

        driver.get("https;//techproeducation.com");//get() methodu ile String olarak girilen url'e gideriz

    }
}
