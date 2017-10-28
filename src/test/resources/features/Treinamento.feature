#language: pt
#encoding: iso-8859-1
Funcionalidade: Compra

	@treinamento
  Cenario: Adicionar produto ao carrinho
    Dado que estou na homepage do site "http://automationpractice.com"
    E pesquiso pelo produto "Dress"
    Quando clico no botao "Add to cart"
    Entao deve apresentar a mensagem "Product successfully added to your shopping cart"

  @treinamento
  Cenario: Enviar mensagem através do menu "Contact us"
    Dado que estou na homepage do site "http://automationpractice.com"
    E acesso a pagina "Contact us"
    Quando preencho o formulario da tela "Contact us"
    E clico no botao "Send"
    Entao deve apresentar a mensagem "Your message has been successfully sent to our team."

  @treinamento
  Cenario: Efetuar cadastro
    Dado que estou na homepage do site "http://automationpractice.com"
    E acesso a pagina "Sign in"
    Quando preencho um e-mail para cadastro
    E clico no botao "Create an account"
    E preencho o formulario da tela "CREATE AN ACCOUNT"
    E clico no botao "Register"
    Entao sou redirecionado para a pagina "MY ACCOUNT"