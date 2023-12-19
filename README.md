# README - Projeto SpaPetTest

## Introdução
Este projeto consiste em testes end-to-end que são realizados diretamente no projeto disponível em https://github.com/lucianasfoliveira/SpaPetTest. O objetivo é garantir a integridade e funcionalidade da aplicação por meio de cenários de teste automatizados.

## Requisitos
O projeto requer a implementação de pelo menos 2 cenários de teste end-to-end. Esses cenários devem abranger a aplicação em todas as suas camadas, incluindo a conexão com o banco de dados. Utiliza-se Cucumber para a escrita dos cenários e Rest Assured para as requisições HTTP.

## Configuração do Ambiente
Certifique-se de ter o Java 11 ou 17 instalado em seu sistema.

## Funcionalidades
### Feature: Customer Login
#### Scenario: Customer tries to login with invalid email and password
Given an existing customer with invalid email and password

When the customer attempts to log in

Then the system returns a 403 Unauthorized status

#### Scenario: Validation of error message for invalid login
Given an existing customer with invalid email and password

When the customer attempts to log in

Then the system returns a 403 Unauthorized status

And the error message is displayed to the customer

## Executando o Projeto

Siga os passos abaixo para executar o projeto em sua máquina:

1. **Clone os repositórios:**
    ```bash
    git clone https://github.com/lucianasfoliveira/SpaPetTest.git
    git clone https://github.com/Jeeh2/SpaPet-test.git
    ```

2. **Abra os projetos em sua IDE:**
   - Importe ambos os projetos em sua IDE, usando janelas diferentes.

3. **Execute a aplicação Spring Boot:**
   - Execute a aplicação Spring Boot do projeto SpaPetTest.

4. **Execute a classe do CucumberRunner:**
   - Execute a classe do CucumberRunner do projeto spaPet-tests.

## Participantes
Jessica de Oliveira Alves | Jessica Pereira Lima | Luciana Souza Ferreira de Oliveira
