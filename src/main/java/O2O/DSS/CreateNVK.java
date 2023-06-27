package O2O.DSS;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateNVK {
	void Created() throws InterruptedException, IOException {
		System.out.println(System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\main\\resource\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://agentstaging.dxres.vn/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@placeholder='Email']")).sendKeys("it.dxs@datxanh.com.vn");
		driver.findElement(By.xpath("//*[@placeholder='Mật khẩu']")).sendKeys("ahihihoho");
		driver.findElement(By.xpath("//*[text()=\"Đăng nhập\"]")).click();
		Thread.sleep(1000);
		for (int i = 1; i <= 4; i++) {
			driver.findElement(By.xpath("//*[@id=\"menu-item-140\"]/span/mat-icon[2]")).click();
			Thread.sleep(1000);

			driver.findElement(By.xpath("//*[@class='menu-title'][text()='Danh sách TVV']")).click();
			Thread.sleep(1000);

			driver.findElement(By.xpath("//*[@id=\"main-content\"]/app-employee/div[2]/div[1]/div/div/button/span"))
					.click();
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(1000);
			driver.findElement(By.xpath(
					"//*[@id=\"main-content\"]/app-employee-edit/div[2]/div/mat-card[1]/mat-card-content/div[1]/section[1]/div/div/app-radio-group/div/app-radio-button[2]/label/span"))
					.click();
			Thread.sleep(3000);
////////	
			driver.findElement(By.xpath("//*[@id=\"mat-select-2\"]/div/div[2]/div")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@class=\"mat-option-text\"][text()=\" Nhân Viên Kinh Doanh \"]")).click();
			Thread.sleep(1000);
/////////		
			File sc = new File("C:\\Users\\USER\\eclipse-workspace\\Book1.xlsx");
			FileInputStream src = new FileInputStream(sc);
			@SuppressWarnings("resource")
			XSSFWorkbook Wb = new XSSFWorkbook(src);
			XSSFSheet Sheet1 = Wb.getSheetAt(0);
			XSSFRow row = Sheet1.getRow(i);
			XSSFCell cell2 = row.getCell(2);
			XSSFCell cell3 = row.getCell(3);
			XSSFCell cell4 = row.getCell(4);
			XSSFCell cell5 = row.getCell(5);
			driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys(cell2.toString());
			driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys(cell3.toString());
			driver.findElement(By.xpath("//*[@id=\"mat-input-3\"]")).sendKeys(cell4.toString());
			driver.findElement(By.xpath("//*[@id=\"mat-input-5\"]")).sendKeys(cell5.toString());
////////	Thành phố	
			driver.findElement(By.xpath("//*[@id=\"mat-select-0\"]/div/div[1]/span")).click();
			driver.findElement(By.xpath("//*[@class=\"mat-option-text\"][text()=\" Tp. Hồ Chí Minh \"]")).click();
////////	Thành phố	
////////	Huyện		
			driver.findElement(By.xpath("//*[@id=\"mat-select-1\"]/div/div[1]/span")).click();
			driver.findElement(By.xpath("//*[@class=\"mat-option-text\"][text()=\" H. Bình Chánh \"]")).click();
//////		Huyện

			driver.findElement(By.xpath(
					"//*[@id=\"main-content\"]/app-employee-edit/div[2]/div/mat-card[1]/mat-card-content/div[2]/div/section/app-avatar-uploader/div/div/div"))
					.click();
			Thread.sleep(1000);
			Runtime.getRuntime().exec("C:\\Program Files (x86)\\AutoIt3\\file5\\chan dung.exe");
			Thread.sleep(2000);

			driver.findElement(
					By.xpath("//*[@id=\"mat-dialog-0\"]/app-dialog-image-cropper/mat-dialog-actions/button[1]"))
					.click();

			WebElement elemen = driver.findElement(By.xpath(
					"//*[@id=\"main-content\"]/app-employee-edit/div[2]/div/mat-card[2]/mat-card-content/div/button[2]/span"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", elemen); // Scroll
			Thread.sleep(2000);

			driver.findElement(By.xpath(
					"//*[@id=\"main-content\"]/app-employee-edit/div[2]/div/mat-card[2]/mat-card-content/div/button[2]/span"))
					.click();
		}

	}
}
