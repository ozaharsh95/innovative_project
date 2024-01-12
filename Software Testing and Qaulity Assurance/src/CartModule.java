import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertEquals;
import org.junit.Test;  

public class CartModule {
    public static void main(String[] args) {
        System.out.println("Testing cart functionality module ....");
    }   
    
    @Test
    public void test1(){
        System.out.println("checking whether the add-to-cart button is clickable or not");
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
            System.out.println("Hello");
            WebElement btn1 = driver.findElement((By.id("add-to-cart-sauce-labs-backpack")));
            boolean expectedbool;
            try {
                WebDriverWait wait = new WebDriverWait(driver, 5);
                wait.until(ExpectedConditions.elementToBeClickable(btn1));
                expectedbool = true;
            } catch (Exception e) {
                expectedbool = false;
            }
            assertEquals(true,expectedbool);
        }
        driver.quit();
    }

    @Test
    public void test2(){
        System.out.println(" Checking whether the user can add products to the cart or not.");
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
            WebElement btn1 = driver.findElement((By.id("add-to-cart-sauce-labs-backpack")));
            WebElement btn2 = driver.findElement((By.id("add-to-cart-sauce-labs-bike-light")));
            btn1.click();
            btn2.click();
            WebElement span = driver.findElement((By.className("shopping_cart_badge")));
            System.out.println(span.getClass().getSimpleName());
            assertEquals("2",span.getText());

        }

    }
    @Test
    public void test3(){
        System.out.println(" Check on adding the new products to the cart and whether the count is increasing.");
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
            WebElement btn1 = driver.findElement((By.id("add-to-cart-sauce-labs-backpack")));
            WebElement btn2 = driver.findElement((By.id("add-to-cart-sauce-labs-bike-light")));
            btn1.click();
            btn2.click();
            WebElement span = driver.findElement((By.className("shopping_cart_badge")));
            System.out.println(span.getClass().getSimpleName());
            assertEquals("2",span.getText());

        }
    }

    @Test
    public void test4(){
        System.out.println(" Check whether item is remove or not. ");
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
            WebElement btn1 = driver.findElement((By.id("add-to-cart-sauce-labs-backpack")));
            WebElement btn2 = driver.findElement((By.id("add-to-cart-sauce-labs-bike-light")));
            btn1.click();
            btn2.click();
            WebElement cart = driver.findElement(By.className("shopping_cart_link"));
            cart.click();
            WebElement b1 = driver.findElement(By.id("remove-sauce-labs-backpack"));
            //WebElement b2 = driver.findElement(By.id("remove-sauce-labs-bike-light"));
            b1.click();
            //b2.click();
            WebElement span1 = driver.findElement((By.className("shopping_cart_badge")));
            assertEquals("1", span1.getText());


        }
    }
}
