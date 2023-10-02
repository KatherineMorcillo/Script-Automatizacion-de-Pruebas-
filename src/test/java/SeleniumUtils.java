import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SeleniumUtils {
    public SeleniumUtils(WebDriver driver) {
    }

    // Método para resaltar un elemento en Selenium WebDriver
    public static void highlightElement(WebElement element, WebDriver driver) {
        // Colorear el fondo del elemento seleccionado
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style', 'background: pink; border: 2px solid red;');", element);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        // Quitar el color de fondo después de 500ms
        js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element);
    }
}
