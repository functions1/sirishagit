package Maven0307testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class mavenpractice1 {
	
	@Test
	public void getdata()
	{
		System.setProperty("webdriver.edge.driver","C:\\Users\\urban\\OneDrive\\Desktop\\Driver\\NewDriver0211\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"result\"]")).getText());
	//click for JS confirm
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"result\"]")).getText());
	//click for JSprompt
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
		driver.switchTo().alert().sendKeys("xxxx");
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"result\"]")).getText());
	}

}
