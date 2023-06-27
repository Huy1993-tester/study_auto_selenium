package O2O.DSS;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreatedDADEV {
	 void Dev() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\chrome 83\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://devo2o.datxanhres.com.vn/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("chuotkt@dxs.com");
		driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("12345678");
		driver.findElement(By.xpath(
				"/html/body/app-root/div/app-login/div/div/div[2]/div[1]/form/mat-card/mat-card-content/div[2]/button"))
				.click(); // Login
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"menu-item-100\"]/span/span")).click(); // DUAN
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"menu-item-101\"]")).click(); // DSDA
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"main-content\"]/app-project-list/div/div[1]/div[1]/div/button")).click(); // Create
		Thread.sleep(1000);

		driver.findElement(By.xpath(
				"//*[@id=\"main-content\"]/app-project-edit/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/app-select/ng-select/div/span"))
				.click(); // LOAIDA
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//*[@id=\"main-content\"]/app-project-edit/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/app-select/ng-select/div/div/div[2]/input"))
				.sendKeys("Căn");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@class='ng-star-inserted'][text()='Căn hộ']")).click(); // CANHO
		Thread.sleep(1000);

		/////
		driver.findElement(By.xpath(
				"//*[@id=\"main-content\"]/app-project-edit/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/app-select/ng-select/div"))
				.click();// TRANGTHAI
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//*[@id=\"main-content\"]/app-project-edit/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/app-select/ng-select/div/div/div[2]/input"))
				.sendKeys("Sắp");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@class='ng-star-inserted'][text()='Sắp mở bán']")).click(); // SAPMOBAN
		Thread.sleep(1000);

		//////
		driver.findElement(By.xpath(
				"//*[@id=\"main-content\"]/app-project-edit/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[1]/div[3]/div[2]/app-select/ng-select/div/span"))
				.click();// HIENTRANG
		driver.findElement(By.xpath(
				"//*[@id=\"main-content\"]/app-project-edit/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[1]/div[3]/div[2]/app-select/ng-select/div/div/div[2]/input"))
				.sendKeys("Chuẩn"); // CHUANBI
		driver.findElement(By.xpath("//*[@class='ng-star-inserted'][text()='Chuẩn bị']")).click();

		/////
		driver.findElement(By.xpath(
				"//*[@id=\"main-content\"]/app-project-edit/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/input"))
				.sendKeys("Gem Sky 101");// TENDA
		driver.findElement(By.xpath(
				"//*[@id=\"main-content\"]/app-project-edit/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/input"))
				.sendKeys("THD"); // MADA

		/////
		driver.findElement(By.xpath(
				"//*[@id=\"main-content\"]/app-project-edit/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[3]/div/div[2]/input"))
				.sendKeys("Đất xanh");// CHUDAUTU
		driver.findElement(By.xpath("//*[@class='mat-option-text'][text()=' Tập đoàn Đất Xanh ']")).click(); // TAPDOANDATXANH

		/////

		driver.findElement(By.xpath(
				"//*[@id=\"main-content\"]/app-project-edit/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[6]/div[1]/div[2]/app-select/ng-select/div/div/div[2]/input"))
				.sendKeys("ACB");// TKGD
		driver.findElement(By.xpath("//*[@class='ng-star-inserted'][text()='Ngân hàng ACB']")).click(); // ACB

		/////

		driver.findElement(By.xpath(
				"//*[@id=\"main-content\"]/app-project-edit/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[6]/div[2]/div/input"))
				.sendKeys("93275745"); // STK
		driver.findElement(By.xpath(
				"//*[@id=\"main-content\"]/app-project-edit/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[6]/div[3]"))
				.click(); // ADDNGANHANG

		/////
		driver.findElement(By.xpath(
				"//*[@id=\"main-content\"]/app-project-edit/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[8]/div[1]/div[2]/input"))
				.sendKeys("Giám Đốc Sàn 1"); // TruongDA
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@fxlayoutalign='center start'][text()='Giám Đốc Sàn 1']")).click();

		/////
		driver.findElement(By.xpath(
				"//*[@id=\"main-content\"]/app-project-edit/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[11]/div[2]/div[1]/div[2]/app-select/ng-select/div/div/div[2]/input"))
				.sendKeys("Hồ Chí Minh");// TP
		driver.findElement(By.xpath("//*[@class='ng-star-inserted'][text()='Tp. Hồ Chí Minh']")).click();// HCM

		/////
		driver.findElement(By.xpath(
				"//*[@id=\"main-content\"]/app-project-edit/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[11]/div[2]/div[2]/div[1]/app-select/ng-select/div/div/div[2]/input"))
				.sendKeys("Bình Chánh"); // QUAN
		driver.findElement(By.xpath("//*[@class='ng-star-inserted'][text()='H. Bình Chánh']")).click();// BINHCHANH

		/////
		driver.findElement(By.xpath(
				"//*[@id=\"main-content\"]/app-project-edit/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[11]/div[2]/div[2]/div[2]/app-select/ng-select/div/div/div[2]/input"))
				.sendKeys("Bình Lợi"); // HUYEN
		driver.findElement(By.xpath("//*[@class='ng-star-inserted'][text()='X. Bình Lợi']")).click();
		driver.findElement(By.xpath(
				"//*[@id=\"main-content\"]/app-project-edit/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[11]/div[2]/div[3]/input"))
				.sendKeys("100");
		Thread.sleep(1000);

		driver.findElement(By.xpath(
				"//*[@id=\"main-content\"]/app-project-edit/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div[2]/div[2]/div/div/ngx-material-timepicker-toggle/button/img"))
				.click();// time
		driver.findElement(By.xpath("//*[@class='active'][text()='12']")).click();// 12h
		driver.findElement(By.xpath("//*[text()='Ok']")).click();
		driver.findElement(By.xpath(
				"//*[@id=\"main-content\"]/app-project-edit/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div[2]/div[2]/app-date-picker/div/img"))
				.click();
		driver.findElement(By.xpath(
				"//*[@id=\"main-content\"]/app-project-edit/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div[2]/div[2]/app-date-picker/div/ngb-datepicker/div[2]/div/ngb-datepicker-month-view/div[4]/div[5]/div"))
				.click();
		driver.findElement(By.xpath(
				"//*[@id=\"main-content\"]/app-project-edit/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div[3]/div[2]/div/div/ngx-material-timepicker-toggle/button/img"))
				.click();// time
		driver.findElement(By.xpath("//*[@class='active'][text()='12']")).click();// 12h
		driver.findElement(By.xpath("//*[text()='Ok']")).click();
		driver.findElement(By.xpath(
				"//*[@id=\"main-content\"]/app-project-edit/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div[3]/div[2]/app-date-picker/div/img"))
				.click();
		driver.findElement(By.xpath(
				"//*[@id=\"main-content\"]/app-project-edit/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div[3]/div[2]/app-date-picker/div/ngb-datepicker/div[2]/div/ngb-datepicker-month-view/div[5]/div[3]/div"))
				.click();
		driver.findElement(By.xpath(
				"//*[@id=\"main-content\"]/app-project-edit/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div[5]/div[2]/div/input"))
				.sendKeys("50000000");
		Thread.sleep(1000);

		WebElement elemen = driver.findElement(By.xpath(
				"//*[@id=\"main-content\"]/app-project-edit/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div[8]/div[1]/span"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", elemen); // Scroll
		Thread.sleep(2000);

		driver.findElement(By.xpath(
				"//*[@id=\"main-content\"]/app-project-edit/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div[11]/div[2]/ng-select/div/span"))
				.click();
		driver.findElement(By.xpath("//*[@class='ng-option-label ng-star-inserted'][text()='Thanh toán qua tín dụng']"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//*[@id=\"main-content\"]/app-project-edit/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div[11]/div[2]/ng-select/div/div/div[3]/input"))
				.sendKeys("Nội địa");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("//*[@class='ng-option-label ng-star-inserted'][text()='Thanh toán qua ATM nội địa']"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//*[@id=\"main-content\"]/app-project-edit/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div[11]/div[2]/ng-select/div/div/div[4]/input"))
				.sendKeys("Ngân hàng");
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//*[@class='ng-option-label ng-star-inserted'][text()='Thanh toán qua chuyển khoản ngân hàng']"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//*[@id=\"main-content\"]/app-project-edit/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div[11]/div[2]/ng-select/div/div/div[5]/input"))
				.sendKeys("Tiền mặt");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("//*[@class='ng-option-label ng-star-inserted'][text()='Thanh toán bằng tiền mặt']")).click();

		driver.findElement(By.xpath(
				"//*[@id=\"main-content\"]/app-project-edit/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div[12]/div[2]/div[2]/input"))
				.sendKeys("KTS");
		Thread.sleep(1000);

////////////////////////////////////		Up ảnh

		driver.findElement(By.xpath(
				"//*[@id=\"main-content\"]/app-project-edit/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div[12]/div[4]/div[1]/div/app-image-uploader/div/label"))
				.click();
		Thread.sleep(1000);
		Runtime.getRuntime().exec("C:\\Program Files (x86)\\AutoIt3\\file1\\anh1.exe");
		Thread.sleep(4000);
		Thread.sleep(1000);

		driver.findElement(By.xpath(
				"//*[@id=\"main-content\"]/app-project-edit/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div[12]/div[4]/div[2]/div/app-image-uploader/div/label"))
				.click();
		Thread.sleep(1000);
		Runtime.getRuntime().exec("C:\\Program Files (x86)\\AutoIt3\\file2\\anh2.exe");
		Thread.sleep(4000);
		Thread.sleep(1000);

		driver.findElement(By.xpath(
				"//*[@id=\"main-content\"]/app-project-edit/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div[12]/div[4]/div[3]/div/app-image-uploader/div/label"))
				.click();
		Thread.sleep(1000);
		Runtime.getRuntime().exec("C:\\Program Files (x86)\\AutoIt3\\file3\\anh3.exe");
		Thread.sleep(4000);
		Thread.sleep(1000);

//////////////////////////////////	Up ảnh

		driver.findElement(By.xpath(
				"//*[@id=\"main-content\"]/app-project-edit/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div[12]/div[5]/div[2]/div/div/ngx-material-timepicker-toggle/button/img"))
				.click();
		driver.findElement(By.xpath("//*[@class='active'][text()='12']")).click();
		driver.findElement(By.xpath("//*[text()='Ok']")).click();

		driver.findElement(By.xpath(
				"//*[@id=\"main-content\"]/app-project-edit/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div[12]/div[5]/div[2]/app-date-picker/div/img"))
				.click();
		driver.findElement(By.xpath(
				"//*[@id=\"main-content\"]/app-project-edit/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div[12]/div[5]/div[2]/app-date-picker/div/ngb-datepicker/div[2]/div/ngb-datepicker-month-view/div[4]/div[5]/div"))
				.click();

//		((JavascriptExecutor) driver).executeScript("document.body.style.zoom='0.9'");//Zoom out	

		driver.findElement(By.xpath(
				"//*[@id=\"main-content\"]/app-project-edit/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div[12]/div[6]/div[2]/div/div/ngx-material-timepicker-toggle/button/img"))
				.click();
		driver.findElement(By.xpath(
				"//*[@id=\"main-content\"]/app-project-edit/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div[12]/div[6]/div[2]/div/div/ngx-material-timepicker/div[2]/div/div/div[1]/div/ngx-material-timepicker-24-hours-face/ngx-material-timepicker-face/div/div/div[11]/span"))
				.click();
		driver.findElement(By.xpath("//*[text()='Ok']")).click();
		driver.findElement(By.xpath(
				"//*[@id=\"main-content\"]/app-project-edit/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div[12]/div[6]/div[2]/app-date-picker/div/img"))
				.click();
		driver.findElement(By.xpath(
				"//*[@id=\"main-content\"]/app-project-edit/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div[12]/div[6]/div[2]/app-date-picker/div/ngb-datepicker/div[2]/div/ngb-datepicker-month-view/div[5]/div[3]/div"))
				.click();
///////////////////////////////////////// up file
		WebElement element = driver.findElement(By.xpath(
				"//*[@id=\"main-content\"]/app-project-edit/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div[13]/div[2]/div[2]/div/input"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element); // Scroll
		Thread.sleep(2000);

		driver.findElement(By.xpath(
				"//*[@id=\"main-content\"]/app-project-edit/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div[13]/app-file-uploader[1]/div/div/label"))
				.click();
		Thread.sleep(1000);
		Runtime.getRuntime().exec("C:\\Program Files (x86)\\AutoIt3\\file1\\Fileupload1.exe");
		Thread.sleep(4000);

		driver.findElement(By.xpath(
				"//*[@id=\"main-content\"]/app-project-edit/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div[13]/app-file-uploader[2]/div/div/label"))
				.click();
		Thread.sleep(1000);
		Runtime.getRuntime().exec("C:\\Program Files (x86)\\AutoIt3\\file2\\Fileupload2.exe");
		Thread.sleep(4000);

		WebElement eleme = driver.findElement(By.xpath(
				"//*[@id=\"main-content\"]/app-project-edit/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div[13]/div[5]/div/span"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", eleme); // Scroll
		Thread.sleep(4000);

		driver.findElement(By.xpath(
				"//*[@id=\"main-content\"]/app-project-edit/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div[13]/app-file-uploader[3]/div/div/label"))
				.click();
		Thread.sleep(1000);
		Runtime.getRuntime().exec("C:\\Program Files (x86)\\AutoIt3\\file3\\Fileupload3.exe");
		Thread.sleep(4000);

		driver.findElement(By.xpath(
				"//*[@id=\"main-content\"]/app-project-edit/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div[13]/app-file-uploader[4]/div/div/label"))
				.click();
		Thread.sleep(1000);
		Runtime.getRuntime().exec("C:\\Program Files (x86)\\AutoIt3\\file4\\Fileupload4.exe");
		Thread.sleep(5000);

///////////////////////////////////////////// up file
		((JavascriptExecutor) driver).executeScript("document.getElementById('mat-input-5').scrollIntoView(true);");
		Thread.sleep(1000); // scroll

		driver.findElement(By.xpath("//*[@id=\"mat-input-5\"]")).sendKeys("Phòng Khai Thác");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@class='mat-option-text'][text()=' Phòng Khai Thác ']")).click();

		driver.findElement(By.xpath("//*[@id=\"mat-input-6\"]")).sendKeys("Sàn 1");
		driver.findElement(By.xpath("//*[@class='mat-option-text'][text()=' Sàn 1 ']")).click();

		driver.findElement(By.xpath(
				"//*[@id=\"main-content\"]/app-project-edit/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div[15]/div[2]/div[2]/input"))
				.sendKeys("440000000148");
		driver.findElement(By.xpath(
				"//*[@id=\"main-content\"]/app-project-edit/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div[15]/div[2]/div[3]/button"))
				.click();

		driver.findElement(By.xpath("//*[@id=\"mat-input-6\"]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"mat-input-6\"]")).sendKeys("Sàn 2");
		driver.findElement(By.xpath("//*[@class='mat-option-text'][text()=' Sàn 2 ']")).click();
		driver.findElement(By.xpath(
				"//*[@id=\"main-content\"]/app-project-edit/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div[15]/div[2]/div[2]/input"))
				.clear();
		Thread.sleep(1000);

		driver.findElement(By.xpath(
				"//*[@id=\"main-content\"]/app-project-edit/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div[15]/div[2]/div[3]/button"))
				.click();
		Thread.sleep(2000);

		WebElement elem = driver.findElement(By.xpath(
				"//*[@id=\"main-content\"]/app-project-edit/div[2]/div[2]/div/div[1]/div[3]/div[2]/div[4]/div[2]/div[2]/input"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", elem); // Scroll
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"main-content\"]/app-project-edit/div[2]/div[3]/div[1]")).click();

	}
}
