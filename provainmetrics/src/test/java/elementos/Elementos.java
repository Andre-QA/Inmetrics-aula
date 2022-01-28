package elementos;

import org.openqa.selenium.By;

public class Elementos {

	
	private By cadastre = By.cssSelector("body > div > div.container-login100 > div > form > div.w-full.text-center.p-t-30 > a");
	private By username = By.name("username");
	private By senha = By.name("pass");
	private By confirme = By.name("confirmpass");
	private By cadastrar = By.cssSelector("body > div > div > div > form > div.container-login100-form-btn.m-t-17 > button");
	private By enter = By.cssSelector("body > div > div.container-login100 > div > form > div.container-login100-form-btn.m-t-17.p-t-13 > button");
	private By novofuncionario = By.cssSelector("#navbarSupportedContent > ul > li:nth-child(2) > a");
	private By editar = By.cssSelector("#tabela > tbody > tr:nth-child(1) > td:nth-child(6) > a:nth-child(2) > button");
	private By excluir = By.id("delete-btn");
	private By nome = By.name("nome");
	private By cpf = By.id("cpf");
	private By sexo = By.cssSelector("#slctSexo > option:nth-child(3)");
	private By masc = By.name("Sexo");
	private By admissao = By.id("inputAdmissao");
	private By cargo = By.id("inputCargo");
	private By salario = By.name("salario");
	private By tipocontrato = By.id("clt");
	private By tipocontratacao = By.id("pj");
	private By enviar = By.cssSelector("body > div > div.container-login100 > div > form > div:nth-child(4) > input");
	
			
			
			
			
			
	
	public By getNome() {
		return nome;
	}
	public By getCpf() {
		return cpf;
	}
	
	
	public By getAdmissao() {
		return admissao;
	}
	public By getCargo() {
		return cargo;
	}
	public By getSalario() {
		return salario;
	}
	public By getTipocontrato() {
		return tipocontrato;
	}
	public By getCadastre() {
		return cadastre;
	}
	public By getUsername() {
		return username;
	}
	public By getNovofuncionario() {
		return novofuncionario;
	}
	public By getEditar() {
		return editar;
	}
	public By getExcluir() {
		return excluir;
	}
	public By getSenha() {
		return senha;
	}
	public By getConfirme() {
		return confirme;
	}
	public By getCadastrar() {
		return cadastrar;
	}
	public By getEnter() {
		return enter;
	}
	public By getMasc() {
		return masc;
	}
	public By getTipocontratacao() {
		return tipocontratacao;
	}
	public By getSexo() {
		return sexo;
	}
	public By getEnviar() {
		return enviar;
	}
}
