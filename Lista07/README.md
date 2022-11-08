<h1 align="center">Polimorfismo</h1>

Questão 01: Crie uma superclasse Pessoa. Faça uma subclasse Funcionário que herde de
Pessoa e outra subclasse Gerente que herde de Funcionário. A classe Pessoa possui:
nome, cpf e data de nascimento. A classe Funcionário possui salário, e classe Gerente
possui departamento. Sobrescreva o método salário em gerente para adicionar o valor
da Gratificação (R$ 1.500,00) de gerente ao salário. Crie uma classe teste que forneça as
seguintes opções:
>1- Adicionar Funcionário </br>
>2- Adicionar Gerente </br>
>3- Obter salário de Funcionário </br>
>4- Obter salário Gerente </br>
>0- Sair

Questão 02: Crie a superclasse Conta. Faça duas subclasses, Conta corrente e Poupança,
que herdem de Conta. Conta possui número da conta, CPF do cliente, taxa, saldo e banco
e um método atualizar. Além disso, a classe Conta deve possuir os métodos saque e
depósito. Na classe conta corrente, o método atualizar subtrai a taxa definida do saldo e
o método saque deve cobrar uma taxa de R$ 0,30 para todos os saques realizados. Na
classe poupança, o método atualizar adiciona a taxa definida ao saldo. Ou seja, você deve
sobrescrever os métodos atualizar e saque em Conta corrente e o método atualizar em
Poupança. Crie uma classe Teste que forneça as seguintes opções:
>1- Cadastrar Conta corrente </br>
>2- Cadastrar Poupança </br>
>3- Atualizar conta corrente </br>
>4- Atualizar poupança </br>
>5- Saque conta corrente </br>
>6- Saque poupança </br>
>7- Verificar saldo de conta corrente </br>
>8- Verificar saldo de poupança </br>
>0- Sair

Questão 03: Crie uma classe Trabalhador que possua: nome, cadastro, salário, idade e
endereço. Crie duas subclasses que herdem de Trabalhador, Trabalhador Integral e
Trabalhador Horista. Trabalhador Horista possui os atributos: total de horas a trabalhar
e salário-hora. Sobrescreva o método getSalario() em Trabalhador Horista, para que o
salário do Trabalhador Horista seja calculado da seguinte forma: número de horas
trabalhadas * salário-hora. Sobrescreva também o método getSalario() em Trabalhador
Integral, para que o salário desse tipo de trabalhador tenha um acréscimo de 16% se o
trabalhador possuir até 30 anos e 25% se possuir mais de 30 anos. Crie uma classe teste,
fornecendo as seguintes opções:
>1– Cadastrar trabalhador Integral </br>
>2– Cadastrar trabalhador Horista </br>
>3– Obter salário trabalhador integral (pelo numero de cadastro) </br>
>4– Obter salário trabalhador horista </br>
>5– Obter ficha do trabalhador integral </br>
>6– Obter ficha do trabalhador horista </br>
>7– Obter maior salário entre os trabalhadores integrais </br>
>8– Obter maior idade entre os trabalhadores horistas </br>
>0– Sair
