import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteAutomatizado {

    public static void main(String[] args) {
// abre firefox
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sacarolhas\\Documents\\teste-selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
// acessa o site do google
        driver.get("http://www.google.com.br/");
// digita no campo com nome "q" do google
        WebElement campoDeTexto
                = driver.findElement(By.name("q"));
        campoDeTexto.sendKeys("UTFPR");
// submete o form
        campoDeTexto.submit();
    }
}