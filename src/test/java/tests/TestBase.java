package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.PageFactory;
import page.Main;
import page.TaskOne;

import java.util.concurrent.TimeUnit;

public class TestBase {
    String URL_SITE = "https://mvnrepository.com/";
    WebDriver driver;
    Main page;
    TaskOne taskOne;


    @BeforeEach
    public void start() {
        WebDriverManager.operadriver().setup();
        driver = new OperaDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        page = PageFactory.initElements(driver, Main.class);
        taskOne = PageFactory.initElements(driver, TaskOne.class);
    }

    @AfterEach
    public void finish() {
        driver.quit();
    }
}
