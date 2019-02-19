import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\estok\\Downloads\\SELENIUM\\chrome driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bart.sk/mam-zaujem");
        driver.manage().window().maximize();
        driver.findElement(By.id("name")).sendKeys("Anton");
        String name = driver.findElement(By.id("name")).getAttribute("value");
        driver.close();
        System.out.println(name);
        String control = "Anton";
        if (name.equals(control)){
            System.out.println("Test successfull");
        }else System.out.println("Test failed");
    }
}
