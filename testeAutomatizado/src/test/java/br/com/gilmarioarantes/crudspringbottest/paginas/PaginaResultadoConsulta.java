package br.com.gilmarioarantes.crudspringbottest.paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class PaginaResultadoConsulta {
<<<<<<< HEAD
	
	@FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div/div/div[2]/div[2]/div[2]/table/tbody/tr[2]/td[1]")
	private WebElement gridResultadoConsulta;
	
	private WebDriver driver;
	
	public PaginaResultadoConsulta(WebDriver driver) {
		
		this.driver = driver;
		
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);
		PageFactory.initElements(factory, this);
	}

	public WebElement getGridResultadoConsulta() {
		return gridResultadoConsulta;
	}

	public void setGridResultadoConsulta(WebElement gridResultadoConsulta) {
		this.gridResultadoConsulta = gridResultadoConsulta;
	}
	
=======

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div/div/div[2]/div[2]/div[2]/table/tbody/tr[2]/td[1]")
    private WebElement gridResultadoConsulta;

    private WebDriver driver;

    public PaginaResultadoConsulta(WebDriver driver){
        this.driver = driver;
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);
        PageFactory.initElements(factory,this);
    }

    public WebElement getGridResultadoConsulta(){
        return this.gridResultadoConsulta;
    }
>>>>>>> e8dc13738aa14d1f800952a6f886d27e004214d6
}
