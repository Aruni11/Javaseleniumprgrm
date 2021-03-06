package prgrm1;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Draggable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/draggable");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.switchTo().frame(0);
		String text = driver.findElement(By.id("draggable")).getText();
		System.out.println(text);
		WebElement drag1=driver.findElement(By.id("draggable"));
		Actions move1 = new Actions(driver);
		move1.dragAndDropBy(drag1, 125, 245).build().perform();
		driver.switchTo().defaultContent();
		driver.close();
	}

	}
