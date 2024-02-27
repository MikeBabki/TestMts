import org.openqa.selenium.By;
import  org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//"D:\\Downloads\\SHADOW STEP\\chromedriver-win64\\chromedriver.exe"
public class MainClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\SHADOW STEP\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("mts.by");

        WebElement blockTitle = driver.findElement(By.xpath("//h2[contains(text(), 'Онлайн пополнение без комиссии')]"));
        System.out.println("Название блока: " + blockTitle.getText());
        
        WebElement logo = driver.findElement(By.xpath("//img[@alt='Visa']"));
        System.out.println("Логотип Visa присутствует");

        WebElement moreInfoLink = driver.findElement(By.linkText("Подробнее о сервисе"));
        moreInfoLink.click();
        System.out.println("Ссылка 'Подробнее о сервисе' работает");

        WebElement serviceField = driver.findElement(By.id("service"));
        serviceField.sendKeys("Услуги связи");

        WebElement numberField = driver.findElement(By.id("number"));
        numberField.sendKeys("297777777");

        WebElement continueButton = driver.findElement(By.xpath("//button[contains(text(), 'Продолжить')]"));
        continueButton.click();

        System.out.println("Поля заполнены, кнопка 'Продолжить' работает");

        driver.quit();
    }
}