import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteAutomatizado {

    public Boolean procuraNoGoogle(String palavraChave) {
//
        //abre o chrome, necessario utilizar o driver compativel com a versao do navegador
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sacarolhas\\Documents\\teste-selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
// acessa o site do google
        driver.get("http://www.google.com.br/");
// digita no campo com nome "q" do google
        WebElement campoDeTexto
                = driver.findElement(By.name("q"));
        campoDeTexto.sendKeys(palavraChave);
// submete o form
        campoDeTexto.submit();

        boolean achouTermo = driver.getPageSource()
                .contains(palavraChave);

        if (achouTermo) {
            return true;
        }
        return false;
    }
}