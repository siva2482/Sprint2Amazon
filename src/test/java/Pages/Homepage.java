package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.Testbase;

public class Homepage extends Testbase {
	
	public Homepage( WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}

	@FindBy(id="twotabsearchtextbox")
	 WebElement searchBox;
	
	@FindBy(xpath="//select[@id='s-result-sort-select']//option[4]")
	 WebElement result_sort;
	
	@FindBy(xpath="//span[@class='a-button a-button-base abb-intl-decline']//input[@type='submit']")
	WebElement check_box;
	@FindBy(xpath="(((//span[contains(text(),'RESULTS')])[1]//following::div//div[@class='a-section a-spacing-none a-spacing-top-micro'])//following::span//child::span)[2]")
	WebElement rev_num;
	
	public  String getURL()
	{
		return driver.getCurrentUrl();
	}
	
	public  String[] addToCart(String s) throws InterruptedException
	{
		String[] tv_list=new String[3];
		
		searchBox.sendKeys(s,Keys.ENTER);
		Thread.sleep(5000);
		//Select s1=new Select(result_sort);
	//	s1.selectByVisibleText("Avg. Customer Review").;
		driver.findElement(By.xpath("//i[@class='a-icon a-icon-star-medium a-star-medium-4']")).click();
		tv_list[0]=driver.findElement(By.xpath("((//span[contains(text(),'RESULTS')])[1]//following::div//div[@class='a-row a-spacing-micro']//following-sibling::h2//a)[1]//span")).getText();
		tv_list[1]=rev_num.getText();
		driver.findElement(By.xpath("((//span[contains(text(),'RESULTS')])[1]//following::div//div[@class='a-row a-spacing-micro']//following-sibling::h2//a)[1]")).click();
	tv_list[2]=driver.findElement(By.xpath("//span[@id='productTitle']")).getText();
		driver.findElement(By.id("add-to-cart-button")).click();
		//check_box.click();
		return tv_list;
	}
	
	
	

}
