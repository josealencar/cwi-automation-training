package br.com.cwi.automation_training.pages.treinamento;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import br.com.cwi.automation_training.pages.BasePage;

public class TreinamentoElementMap extends BasePage {

	protected WebElement search_query_top;
	
	@FindBy(css = ".button-search")
	protected WebElement botaoPesquisar;
	
	@FindBy(xpath = "//*[@id=\"contact-link\"]/a")
	protected WebElement linkContactUs;
	
	protected WebElement id_contact;
	
	protected WebElement email;
	
	protected WebElement id_order;
	
	protected WebElement fileUpload;
	
	protected WebElement message;
	
	protected WebElement submitMessage;
	
	@FindBy(css = ".alert-success")
	protected WebElement alertMensagem;
	
	@FindBy(css = ".available-now")
	protected List<WebElement> products;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]/span")
	protected WebElement botaoAddToCard;
	
	@FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[1]/h2")
	protected WebElement alertAddCart;
	
	@FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
	protected WebElement linkSignIn;
	
	protected WebElement email_create;
	
	protected WebElement SubmitCreate;
	
	protected WebElement id_gender1;
	
	protected WebElement customer_firstname;
	
	protected WebElement customer_lastname;
	
	protected WebElement passwd;
	
	protected WebElement days;
	
	protected WebElement months;
	
	protected WebElement years;
	
	protected WebElement address1;
	
	protected WebElement city;
	
	protected WebElement id_state;
	
	protected WebElement postcode;
	
	protected WebElement phone_mobile;
	
	protected WebElement submitAccount;
	
	@FindBy(css = ".page-heading")
	protected WebElement pageHeader;
}