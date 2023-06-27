package O2O.DSS;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GanNV {
	void run() throws InterruptedException, IOException {
//		System.out.println(System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\main\\resource\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://agentstaging.dxres.vn/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@placeholder='Email']")).sendKeys("it.dxs@datxanh.com.vn");
		driver.findElement(By.xpath("//*[@placeholder='Mật khẩu']")).sendKeys("ahihihoho");
		driver.findElement(By.xpath("//*[text()=\"Đăng nhập\"]")).click();
		Thread.sleep(1000);
		for (int i = 1; i <= 1; i++) {
			driver.findElement(By.xpath("//*[@id=\"menu-item-140\"]/span/mat-icon[2]")).click();
			Thread.sleep(1000);

			driver.findElement(By.xpath("//*[@class=\"menu-title\"][text()=\"Gán nhân viên\"]")).click();
			Thread.sleep(10000);

			driver.findElement(By.xpath("//*[@id=\"mat-select-0\"]/div/div[2]"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@class='mat-option-text'][text()=' Test.Auto ']")).click();
			Thread.sleep(5000);
			System.out.println(driver.findElement(By.id("name-TVV00004")).getText());
			driver.findElement(By.xpath("//*[@id=\"cb-TVV00004\"]/label/div")).click();
			driver.findElement(By.xpath("//*[@id=\"cb-TVV-00025\"]/label/div")).click();
			driver.findElement(By.xpath("//*[@id=\"cb-TVV-00036\"]/label/div")).click();
		}

	}
}
