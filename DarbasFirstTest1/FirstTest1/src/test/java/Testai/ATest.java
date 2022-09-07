package Testai;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;






public class ATest {
	
	@Test
	public void NeunikaliRegistracija() {
		System.setProperty("webdriver.chrome.whitelistedIps", "");
		WebDriver driver = new ChromeDriver();
	    driver.navigate().to("http://localhost:8080/prisijungti");
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.linkText("Sukurti naują paskyrą")).click();
	    
	    driver.findElement(By.id("username")).sendKeys("Alina");
	    driver.findElement(By.id("password")).sendKeys("Labas123");
	    driver.findElement(By.id("passwordConfirm")).sendKeys("Labas123");
	    driver.findElement(By.cssSelector("[type='submit']")).click();
	    
	    String a = driver.findElement(By.id("username.errors")).getText();
		System.out.println(a);
		Assert.assertEquals(a,"Toks vartotojo vardas jau egzistuoja");
		System.out.println("testas pavyko!"); 
		driver.quit();
	    		 
	}
	@Test
	public void TeisingaRegistracija() {
		System.setProperty("webdriver.chrome.whitelistedIps", "");
		WebDriver driver = new ChromeDriver();
	    driver.navigate().to("http://localhost:8080/prisijungti");
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.linkText("Sukurti naują paskyrą")).click();
	    
	    
	}
}
