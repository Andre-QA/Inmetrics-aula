#Author: e2etreinamentos@e2etreinamentos.com.br

@positivo 
Feature: Cadastrar usuario
  Eu como usuario quero acessar o site da inmetrics 

 

   
    
     
    Scenario: Cadastrar novo usuario   
    Given que eu esteja no site "https://inm-test-app.herokuapp.com/accounts/login/"  
    When clicar em cadaste-se
    And inserir os dados    
    And clicar em cadastrar
    Then cadastro efetuado com sucesso
    
    
    
    
  

 
 
