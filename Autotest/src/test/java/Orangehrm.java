import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrm {
    @Test
    public void test() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebElement inputusername = driver.findElement(By.id("username"));
        WebElement inputpassword = driver.findElement(By.id("password"));
        inputusername.sendKeys("Admin");
        inputpassword.sendKeys("admin123");
    }
}
