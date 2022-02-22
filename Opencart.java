package seleniumstrt;

import org.openqa.selenium.By;

public class Opencart {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//*[@class='form-group']//child::input")).sendKeys("Ajay");
		driver.findElement(By.xpath("//*[@class=\"form-group required\"]//child::input")).sendKeys("ajay");
		driver.findElement(By.xpath("//*[@class=\"control-label\"]//following::input[2]")).sendKeys("dev");
		driver.findElement(By.xpath("//*[@class=\"control-label\"]//following::input[3]")).sendKeys("ajay@gmail.com");
		WebElement country = driver.findElement(By.xpath("//*[@class=\"form-group required\"]//child::select"));
		Select countr=new Select(country);
		countr.selectByVisibleText("India");
		driver.findElement(By.xpath("//*[@class=\"form-group\"][3]//child::input")).sendKeys("asdfghjkl");
		driver.close();
		
		
		
	}
         
	}
