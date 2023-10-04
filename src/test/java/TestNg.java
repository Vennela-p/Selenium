import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class TestNg {
	FirefoxDriver dr;

    @BeforeMethod
    public void setUp() {
        dr = new FirefoxDriver();
        dr.manage().window().maximize();
    }

    @Test
    public void performAmazonShopping() {
        dr.get("http://www.google.com");
        dr.manage().window().maximize();
		dr.findElement(By.id("APjFqb")).sendKeys("amazon");
		dr.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
        dr.findElement(By.cssSelector(".eKjLze > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > span:nth-child(1) > a:nth-child(1) > h3:nth-child(2)")).click();
	    dr.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iphone 15");
	    dr.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
        dr.navigate().to("https://www.amazon.in/Apple-iPhone-15-Plus-128/dp/B0CHWZCY43?ref_=ast_sto_dp&th=1&psc=1");
	    //dr.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
	   // dr.findElement(By.xpath("/html/body/div[8]/div[3]/div[3]/div/div[1]/div[3]/div[1]/div[2]/div[3]/span/span/input")).click();
  
    }

    @AfterMethod 
    public void tearDown() {
        dr.quit();
    }

}
