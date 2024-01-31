<h1 align="center"> Java Custom Exceptions </h1>

<p align="center">
Programa que implementa regras de saque em uma conta utilizando tratamento de exceções customizadas.
</p>
<br>

![preview](./.github/java.jpg)
<br>

## 📄 Task

Fazer um programa para ler os dados de uma conta bancária, realizar um saque nesta conta e mostrar o novo saldo.

- Case1: O saque não pode ocorrer se não houver saldo sufuciente na conta.
- Case2: O saque não pode ocorrer se o valor for superior ao limite de saque.

## ☕️Classe: Account
|Account         |         |
| ---------------| ------- |
| -number:       | Integer |
| -holder:       | String  |
| -balance:      | Double  |
| -withdrawLimit:| Double  |
| +deposit(amount: double): | void |
| +whitdraw(amount: double):| void |


## 💡 Testes

### Case 01: 
Para efetuar o saque corretamente o valor não pode ser maior que o saldo da conta ou limite de saque. 
<div style="border: 1px solid 	#FF6347; padding: 10px;">
  <strong>Dados da conta</strong><br>
  Número: <strong style="color: #FF6347">8021</strong><br>
  Titular: <strong style="color: #FF6347">Diogo Barros</strong><br>
  Saldo inicial: <strong style="color: #FF6347">500.00</strong><br>
  Limite de saque: <strong style="color: #FF6347">300.00</strong><br><br>
  Informe o valor do saque: <strong style="color: #FF6347">100.00</strong><br>
  <strong style="color: green">Saque realizado com sucesso! Saldo atual: 400</strong> 
</div>
<br>

### Case 02: 
Se o valor do saque for maior que o limite de saque o programa deve retornar erro informando "A quantia excede o limite de saque".
<div style="border: 1px solid 	#FF6347; padding: 10px;">
  <strong>Dados da conta</strong><br>
  Número: <strong style="color: #FF6347">8021</strong><br>
  Titular: <strong style="color: #FF6347">Diogo Barros</strong><br>
  Saldo inicial: <strong style="color: #FF6347">500.00</strong><br>
  Limite de saque: <strong style="color: #FF6347">300.00</strong><br><br>
  Informe o valor do saque: <strong style="color: #FF6347">400.00</strong><br>
  <strong style="color: red">Erro: A quantia excede o limite de saque.</strong> 
</div>
<br>
  
### Case 03: 
Se o valor do saque for maior que o saldo da conta e maior que o limite de saque o programa deve retornar erro informando: "A quantia excede o limite de saque".
<div style="border: 1px solid 	#FF6347; padding: 10px;">
  <strong>Dados da conta</strong><br>
  Número: <strong style="color: #FF6347">8021</strong><br>
  Titular: <strong style="color: #FF6347">Diogo Barros</strong><br>
  Saldo inicial: <strong style="color: #FF6347">500.00</strong><br>
  Limite de saque: <strong style="color: #FF6347">300.00</strong><br><br>
  Informe o valor do saque: <strong style="color: #FF6347">800.00</strong><br>
  <strong style="color: red">Erro: A quantia excede o limite de saque.</strong> 
</div>
<br>

### Case 04:
Se o valor do saque for maior que o saldo da conta o programa deve retornar erro informando: "Saldo insuficiente".
<div style="border: 1px solid 	#FF6347; padding: 10px;">
  <strong>Dados da conta</strong><br>
  Número: <strong style="color: #FF6347">8021</strong><br>
  Titular: <strong style="color: #FF6347">Diogo Barros</strong><br>
  Saldo inicial: <strong style="color: #FF6347">200.00</strong><br>
  Limite de saque: <strong style="color: #FF6347">300.00</strong><br><br>
  Informe o valor do saque: <strong style="color: #FF6347">250.00</strong><br>
  <strong style="color: red">Erro: Saldo insuficiente.</strong> 
</div>