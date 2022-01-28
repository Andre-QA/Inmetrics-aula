#Author: e2etreinamentos@e2etreinamentos.com.br



  
@positivo
Feature: Funcionario
    Eu como usuario quero cadastrar/editar/excluir
    
    Background: Acessar site
    Given que eu esteja no site "https://inm-test-app.herokuapp.com/empregados/" 
    
    Scenario: Cadastrar funcionario    
    When clicar em novo funcionario
    And preencher todos os campos
    And clicar em enviar
    Then usuario cadastrado com sucesso
  
    Scenario: Editar funcionario     
    When clicar em editar
    And alterar os dados
    And clicar em enviar 
    Then usuario editado com sucesso
    
    Scenario: Excluir funcionario      
    When clicar em excluir     
    Then funcionario excluido com sucesso