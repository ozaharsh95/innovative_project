import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertEquals;
import org.junit.Test;  


public class LoginModule {
    public static void main(String[] args) {
        System.out.println("Testing Login Module....");
    }

    @Test
    public void loginTestCase1(){
        System.out.println("login test case 1");
        System.out.println("valid password and valid username");
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

    @Test
    public void loginTestCase2(){
        System.out.println("login test case 2");
        System.out.println("invalid password and valid username");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aditi\\Documents\\Nirma_University_SEM_7\\Department\\STQA\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();  
        WebElement username = driver.findElement(By.id("user-name"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement login = driver.findElement(By.id("login-button"));
        username.sendKeys("standard_user");
        password.sendKeys("secret_sau_erp");
        login.click();
        String actualUrl = "https://www.saucedemo.com/inventory.html";
        String expectedUrl = driver.getCurrentUrl();
        assertEquals(actualUrl,expectedUrl);  
        driver.quit();  
    }

    @Test
    public void loginTestCase3(){
        System.out.println("login test case 3");
        System.out.println("valid password and invalid username");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aditi\\Documents\\Nirma_University_SEM_7\\Department\\STQA\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();  
        WebElement username = driver.findElement(By.id("user-name"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement login = driver.findElement(By.id("login-button"));
        username.sendKeys("standard_user_oza");
        password.sendKeys("secret_sauce");
        login.click();
        String actualUrl = "https://www.saucedemo.com/inventory.html";
        String expectedUrl = driver.getCurrentUrl();
        assertEquals(actualUrl,expectedUrl);  
        driver.quit();  
    }

    @Test
    public void loginTestCase4(){
        System.out.println("login test case 4");
        System.out.println("invalid password and invalid username");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aditi\\Documents\\Nirma_University_SEM_7\\Department\\STQA\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();  
        WebElement username = driver.findElement(By.id("user-name"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement login = driver.findElement(By.id("login-button"));
        username.sendKeys("standard_user_asdf");
        password.sendKeys("admin");
        login.click();
        String actualUrl = "https://www.saucedemo.com/inventory.html";
        String expectedUrl = driver.getCurrentUrl();
        assertEquals(actualUrl,expectedUrl);  
        driver.quit();  
    }

}
