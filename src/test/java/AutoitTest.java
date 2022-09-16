import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class AutoitTest {

    @Test
    public static void AddFile() throws IOException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.filemail.com/share/upload-file");
        driver.findElement(By.xpath("//span[normalize-space()='Add Files']")).click();

        Runtime.getRuntime().exec("C:\\Users\\darsh\\Desktop\\AutoitTest\\autoit.exe");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
}
