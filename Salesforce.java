package seleniumstrt;

import org.openqa.selenium.By;

public class Salesforce {

	public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.get(" https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("ajay");
			driver.findElement(By.name("UserLastName")).sendKeys("dev");
			driver.findElement(By.name("UserEmail")).sendKeys("ajay@gmail.com");
			
			WebElement title = driver.findElement(By.name("UserTitle"));
			Select element=new Select(title);
			element.selectByIndex(3);
			
			driver.findElement(By.name("CompanyName")).sendKeys("Ash pvt ltd");
			WebElement employees = driver.findElement(By.name("CompanyEmployees"));
			Select employee=new Select(employees);
			employee.selectByValue("9");
			
			driver.findElement(By.name("UserPhone")).sendKeys("1234567890");
			driver.close();
			
			
			
		}
			

	}

}
