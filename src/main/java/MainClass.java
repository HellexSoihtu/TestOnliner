import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MainClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\IdeaProjects\\testselenium\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://www.onliner.by/");

        //Каталог//
        WebElement link = driver.findElement(By.xpath("//div[@class='b-top-menu']//ul[@class='b-main-navigation']//a[@class='b-main-navigation__link']"));
        System.out.println(link.getText());
        link.click();

        //Электроника//
        WebElement linkEl = driver.findElement(By.xpath("//span[text()='Электроника']"));
        System.out.println(linkEl.getText());
        linkEl.click();

        List<WebElement> widgetsEl = driver.findElements(By.cssSelector("div.catalog-navigation-list__category[style='display: block;'] .tiles-widget"));
        System.out.println(widgetsEl.size());
        if (widgetsEl.size()==6)
        {
            System.out.println("Success!");
        }
        else
            System.out.println("Fail!");

        //Бытовая техника//
        WebElement linkTech = driver.findElement(By.xpath("//span[text()='Бытовая техника']"));
        System.out.println(linkTech.getText());
        linkTech.click();

        List<WebElement> widgetsTech = driver.findElements(By.cssSelector("div.catalog-navigation-list__category[style='display: block;'] .tiles-widget"));
        System.out.println(widgetsTech.size());
        if (widgetsTech.size()==6)
        {
            System.out.println("Success!");
        }
        else
            System.out.println("Fail!");

        //Еда//
        WebElement linkFd = driver.findElement(By.xpath("//span[text()='Еда']"));
        System.out.println(linkFd.getText());
        linkFd.click();

        List<WebElement> widgetsFd = driver.findElements(By.cssSelector("div.catalog-navigation-list__category[style='display: block;'] .tiles-widget"));
        System.out.println(widgetsFd.size());
        if (widgetsFd.size()==8)
        {
            System.out.println("Success!");
        }
        else
            System.out.println("Fail!");

        driver.quit();
    }
}
