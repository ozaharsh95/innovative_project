
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

import org.junit.Test;  

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
    }

    @Test
    public void testLoginModule(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aditi\\Documents\\Nirma_University_SEM_7\\Department\\STQA\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        
        WebElement username = driver.findElement(By.id("user-name"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement login = driver.findElement(By.id("login-button"));
        username.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        login.click();
        String actualUrl = "https://www.saucedemo.com/inventory.html";
        String expectedUrl = driver.getCurrentUrl();
        assertEquals(actualUrl,expectedUrl);  

        driver.quit();  
    }
}
