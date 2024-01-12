import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertEquals;
import org.junit.Test;  

public class SortProduct {
    public static void main(String[] args) {
        System.out.println("Testing sorting functionality");
    }

    @Test
    public void test1(){
        System.out.println("checking whether the A-Z sorting is working or not");
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
        if(driver.getCurrentUrl().equals("https://www.saucedemo.com/inventory.html")){
            WebElement btn1 = driver.findElement(By.className("product_sort_container"));
            Select dropdown = new Select(btn1);
            dropdown.selectByIndex(0);    
        }
        // driver.quit();
    }

     @Test
    public void test2(){
        System.out.println("checking whether the Z-A sorting is working or not");
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
        if(driver.getCurrentUrl().equals("https://www.saucedemo.com/inventory.html")){
            WebElement btn1 = driver.findElement(By.className("product_sort_container"));
            Select dropdown = new Select(btn1);
            dropdown.selectByIndex(1);    
        }
        // driver.quit();
    }

    @Test
    public void test3(){
        System.out.println("checking whether the price (low to high) sorting is working or not");
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
        if(driver.getCurrentUrl().equals("https://www.saucedemo.com/inventory.html")){
            WebElement btn1 = driver.findElement(By.className("product_sort_container"));
            Select dropdown = new Select(btn1);
            dropdown.selectByIndex(2);    
        }
        // driver.quit();
    }

    @Test
    public void test4(){
        System.out.println("checking whether the price (high to low)  sorting is working or not");
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
        if(driver.getCurrentUrl().equals("https://www.saucedemo.com/inventory.html")){
            WebElement btn1 = driver.findElement(By.className("product_sort_container"));
            Select dropdown = new Select(btn1);
            dropdown.selectByIndex(3);    
        }
        // driver.quit();
    }
    
}
