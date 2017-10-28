package br.com.cwi.automation_training.pages.treinamento;

import org.apache.commons.text.RandomStringGenerator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import br.com.cwi.automation_training.util.TestRule;

public class TreinamentoPage extends TreinamentoElementMap {

	public TreinamentoPage() {
		PageFactory.initElements(TestRule.getDriver(), this);
	}	

	public void buscarProduto(String produto) {	
		search_query_top.sendKeys(produto);
		botaoPesquisar.click();
		logPrint("Buscou pelo produto " + produto);
	}

	public void acessarContactUs() {
		linkContactUs.click();
	}

	public void preencherFormularioContactUs() {
		new Select(id_contact).selectByIndex(1);
		email.sendKeys("hsuash@shaush.com");
		id_order.sendKeys("12133");
		fileUpload.sendKeys("C:\\Users\\jose.rocha\\Downloads\\Treinamento Automação CWI - Aula 2.pdf");
		message.sendKeys("teste");
	}

	public void clicarNoBotaoSend() {
		submitMessage.click();
	}

	public String getMensagemEnvioContactUs() {
		return alertMensagem.getText();
	}

	public void adicionarAoCarrinho() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)", "");
		moveToElement(products.get(0));
		botaoAddToCard.click();
	}

	public String getMensagemAdicionadoAoCarrinho() {
		waitElement(alertAddCart, 10);
		return alertAddCart.getText();
	}

	public void acessarSignIn() {
		linkSignIn.click();
	}

	public void preencherEmailCadastro() {
		StringBuilder builder = new StringBuilder();
		RandomStringGenerator stringGenerator = new RandomStringGenerator.Builder()
			     .withinRange('a', 'z').build();
		builder.append(stringGenerator.generate(6));
		builder.append("@");
		builder.append(stringGenerator.generate(6));
		builder.append(".com");
		email_create.sendKeys(builder.toString());
	}

	public void createAccount() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)", "");
		SubmitCreate.click();
	}

	public void preencherFormularioCreateAccount() {
		waitElement(id_gender1, 10);
		id_gender1.click();
		customer_firstname.sendKeys("asass");
		customer_lastname.sendKeys("asasas");
		passwd.sendKeys("12345");
		new Select(days).selectByIndex(2);
		new Select(months).selectByIndex(1);
		new Select(years).selectByIndex(1);
		address1.sendKeys("assasasa");
		city.sendKeys("assasassasada");
		new Select(id_state).selectByIndex(2);
		postcode.sendKeys("11111");
		phone_mobile.sendKeys("123213213");
	}

	public void register() {
		submitAccount.click();
	}

	public String souRedirecionadoPara() {
		return pageHeader.getText();
	}
}