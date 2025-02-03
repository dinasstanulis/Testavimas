import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginTest {

    @Test
    void loginTest() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        WebElement inputusername = driver.findElement(By.id("username"));
        inputusername.sendKeys("student");

        driver.findElement(By.id("password")).sendKeys("Password123");

        driver.findElement(By.id("submit")).click();

        String text = driver.findElement(By.cssSelector(".post-title")).getText();

        String expected = "Logged In Successfully";

        assertEquals(text, expected);

        System.out.println(text.equals(expected) ? "success" : "fail");
        // condition ? value_if_true : value_if_false;

    }

}
