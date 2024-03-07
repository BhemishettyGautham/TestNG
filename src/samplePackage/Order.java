package samplePackage;

import org.openqa.selenium.By;

public class Order {
	
	private By order = By.xpath("order");
	private By price = By.xpath("price");
	
	public void getPrice() {
		System.out.println("price is: ");
	}
	

}
