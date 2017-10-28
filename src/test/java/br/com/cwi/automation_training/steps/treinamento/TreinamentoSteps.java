package br.com.cwi.automation_training.steps.treinamento;

import org.junit.Assert;

import br.com.cwi.automation_training.pages.treinamento.TreinamentoPage;
import br.com.cwi.automation_training.util.TestRule;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class TreinamentoSteps {	
	
	@Dado("que estou na homepage do site \"(.*)\"")
	public void acessarHomePage(String url) {
		TestRule.openApplicationChrome(url);
	}
	
	@E("pesquiso pelo produto \"(.*)\"")
	public void pesquisarProduto(String nomeProduto) {
		TreinamentoPage treinamentoPage = new TreinamentoPage();
		treinamentoPage.buscarProduto(nomeProduto);
	}
	
	@E("acesso a pagina \"(.*)\"")
	public void acessarAPagina(String pagina) {
		TreinamentoPage treinamentoPage = new TreinamentoPage();
		if ("Contact us".equals(pagina)) {
			treinamentoPage.acessarContactUs();
		}
		if("Sign in".equals(pagina)) {
			treinamentoPage.acessarSignIn();
		}
	}
	
	@Quando("preencho o formulario da tela \"(.*)\"")
	public void preencherFormulario(String formulario) {
		TreinamentoPage treinamentoPage = new TreinamentoPage();
		if ("Contact us".equals(formulario)) {
			treinamentoPage.preencherFormularioContactUs();
		}
		if ("CREATE AN ACCOUNT".equals(formulario)) {
			treinamentoPage.preencherFormularioCreateAccount();
		}
	}
	
	@E("clico no botao \"(.*)\"")
	public void clicoNoBotao(String botao) {
		TreinamentoPage treinamentoPage = new TreinamentoPage();
		if ("Send".equals(botao)) {
			treinamentoPage.clicarNoBotaoSend();
		}
		if ("Add to cart".equals(botao)) {
			treinamentoPage.adicionarAoCarrinho();
		}
		if ("Create an account".equals(botao)) {
			treinamentoPage.createAccount();
		}
		if ("Register".equals(botao)) {
			treinamentoPage.register();
		}
	}
	
	@Entao("deve apresentar a mensagem \"(.*)\"")
	public void deveApresentarMensagem(String mensagem) {
		TreinamentoPage treinamentoPage = new TreinamentoPage();
		if ("Your message has been successfully sent to our team.".equals(mensagem)) {
			Assert.assertEquals("Your message has been successfully sent to our team.", treinamentoPage.getMensagemEnvioContactUs());
		}
		if ("Product successfully added to your shopping cart".equals(mensagem)) {
			Assert.assertEquals("Product successfully added to your shopping cart", treinamentoPage.getMensagemAdicionadoAoCarrinho());
		}
	}
	
	@Quando("preencho um e-mail para cadastro")
	public void preencherEmailCadastro() {
		TreinamentoPage treinamentoPage = new TreinamentoPage();
		treinamentoPage.preencherEmailCadastro();
	}
	
	@Entao("sou redirecionado para a pagina \"MY ACCOUNT\"")
	public void souRedirecionadoPara() {
		TreinamentoPage treinamentoPage = new TreinamentoPage();
		Assert.assertEquals("MY ACCOUNT", treinamentoPage.souRedirecionadoPara());
	}
}
