#Author: e2etreinamentos@e2etreinamentos.com.br





@positivo


Feature: Realizando login de usuario
    Eu como usuario quero efetuar o login
    
    
    Scenario: Login de usuario com sucesso
    Given que eu esteja no site "https://inm-test-app.herokuapp.com/accounts/login/"   
    When digitar usuario e senha    
    And clicar em entre
    Then login efetuado com sucesso