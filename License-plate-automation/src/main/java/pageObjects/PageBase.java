package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.Driver;

public class PageBase {

	protected WebDriver driver = Driver.getCurrentDriver();

	public PageBase(){
		PageFactory.initElements(driver, this);	
	}

	public WebElement waitForElement(WebElement element){
		new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(element));
		return element;
	}

	public boolean isElementDisplayed(WebElement element){
		boolean flag = false;
		try{
			if(element.isDisplayed())
				flag = true;
		}catch(Exception e){}
		return flag;
	}
}
