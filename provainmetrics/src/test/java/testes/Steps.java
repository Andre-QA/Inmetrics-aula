package testes;

import java.io.IOException;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;

public class Steps {

	Metodos metodos = new Metodos();
	Elementos elementos = new Elementos();
	
	@Given("que eu esteja no site {string}")
	public void que_eu_esteja_no_site(String string) {
		metodos.abrirNavegador(string);
	  
	}

	@When("clicar em cadaste-se")
	public void clicar_em_cadaste_se() {
		metodos.clicar(elementos.getCadastre());
	  
	}

	@When("inserir os dados")
	public void inserir_os_dados() {
		metodos.escrever("ander.2110@gmail.com", elementos.getUsername());
		metodos.escrever("12345678", elementos.getSenha());
		metodos.escrever("12345678", elementos.getConfirme());
	   
	}

	@When("clicar em cadastrar")
	public void clicar_em_cadastrar() {
		metodos.clicar(elementos.getCadastrar());
	    
	}

	@Then("cadastro efetuado com sucesso")
	public void cadastro_efetuado_com_sucesso() throws IOException {
		metodos.evidencias("Salario");
	    
	}

	@When("digitar usuario e senha")
	public void digitar_usuario_e_senha() throws IOException {
		metodos.escrever("ander.2110@gmail.com", elementos.getUsername());
		metodos.escrever("12345678", elementos.getSenha());
		metodos.evidencias(null);
		
	 
	}

	@When("clicar em entre")
	public void clicar_em_entre() {
		metodos.clicar(elementos.getEnter());
	  
	}

	@Then("login efetuado com sucesso")
	public void login_efetuado_com_sucesso() throws IOException {
		metodos.evidencias("Abdré");
	   
	}
	
	@When("clicar em novo funcionario")
	public void clicar_em_novo_funcionario() {
		metodos.escrever("ander.2110@gmail.com", elementos.getUsername());
		metodos.escrever("12345678", elementos.getSenha());
		metodos.clicar(elementos.getEnter());
		metodos.clicar(elementos.getNovofuncionario());
	    
	}

	@When("preencher todos os campos")
	public void preencher_todos_os_campos() {
		metodos.escrever("André Ribeiro", elementos.getNome());
		metodos.escrever("268.156.980-09", elementos.getCpf());
		metodos.clicar(elementos.getSexo());
		metodos.escrever("10/03/2022", elementos.getAdmissao());
		metodos.escrever("Engineer Software", elementos.getCargo());
		metodos.escrever("75.000,00", elementos.getSalario());
		metodos.clicar(elementos.getTipocontratacao());
	  
	}

	@When("clicar em enviar")
	public void clicar_em_enviar() {
		metodos.clicar(elementos.getEnviar());
	   
	}

	@Then("usuario cadastrado com sucesso")
	public void usuario_cadastrado_com_sucesso() throws IOException {
		metodos.evidencias("Ismael SM");
	    
	}

	@When("clicar em editar")
	public void clicar_em_editar() {
		metodos.escrever("ander.2110@gmail.com", elementos.getUsername());
		metodos.escrever("12345678", elementos.getSenha());
		metodos.clicar(elementos.getEnter());
		metodos.clicar(elementos.getEditar());
		metodos.apagar(elementos.getNome());
		metodos.escrever("Ismael PO da Silva Master", elementos.getNome());
		metodos.clicar(elementos.getTipocontrato());
	  
	}

	@When("alterar os dados")
	public void alterar_os_dados() {
		
	   
	}

	@Then("usuario editado com sucesso")
	public void usuario_editado_com_sucesso() throws IOException {
		metodos.evidencias("Isaque peidim");
	    
	}

	@When("clicar em excluir")
	public void clicar_em_excluir() {
		metodos.escrever("ander.2110@gmail.com", elementos.getUsername());
		metodos.escrever("12345678", elementos.getSenha());
		metodos.clicar(elementos.getEnter());
		metodos.clicar(elementos.getExcluir());
	  
	}

	@Then("funcionario excluido com sucesso")
	public void funcionario_excluido_com_sucesso() throws IOException {
		metodos.evidencias("Cecel");
	    
	}

}
