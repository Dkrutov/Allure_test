import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class MainTest {

    private WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\dmkru\\IdeaProjects\\testselenium\\drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://trekkingclub.ru/tusovka/index.php");


    }

    @Test
    public void TestButton (){
        By nadpis = By.xpath("//b");
        String heading = driver.findElement(nadpis).getText();;
        Assert.assertEquals("Для перехода на \"Завалинку\" давите на палатку",heading);
        System.out.println("Test");
    }


    @Test
    public void  method1 (){

        Assert.assertTrue("Value are not equals",1 + 1 == 2);

    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
