import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class MainClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\IdeaProjects\\testselenium\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://www.onliner.by/");

        WebElement link = driver.findElement(By.xpath("//div[@class='b-top-menu']//ul[@class='b-main-navigation']//a[@class='b-main-navigation__link']"));
        System.out.println(link.getText());
        link.click();

        WebElement linkEl = driver.findElement(By.xpath("//span[text()='Электроника']"));
        System.out.println(linkEl.getText());
        linkEl.click();

        WebElement linkTech = driver.findElement(By.xpath("//span[text()='Бытовая техника']"));
        System.out.println(linkTech.getText());
        linkTech.click();


       // driver.get("http://en.wikipedia.org");
      //  driver.findElement(By.xpath("//input[@id='searchButton']")).click();

      //driver.navigate().back();
     // driver.navigate().forward();в
     //   WebElement signIn = driver.findElement(By.xpath("//a[text() = 'Создать новый аккаунт']"));
      //  driver.findElement(By.xpath("//a[text() = 'Создать новый аккаунт']")).click();
      //  driver.navigate().refresh();

        //System.out.println(driver.getTitle());
        //System.out.println(driver.getCurrentUrl());

      //  driver.get("https://github.com/");
     //   WebElement button = driver.findElement(By.xpath("//form[@class='mx-auto mx-md-0 col-5-max js-signup-form position-relative z-2']//button"));
      //  if (button.getText().equals("Sign up for GitHub")) {
      //      System.out.println("Success!");
      //  }
       // else
       // System.out.println("Fail!");
        //System.out.println("Button text is: " + button.getText());
       // button.submit();

       // WebElement email = driver.findElement(By.xpath("//input[@name='user_email']"));

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        //driver.quit();
    }
}
