# aula-08032018-joginho
Desafio do Joguinho
## Instruções
Faça um aplicativo que gere um número aleatório inicialmente e armazene. é necessário fazer um controle de tentativas do usuário, para isso uma variável inteira que seja incrementada a cada tentativa é o suficiente.
O aplicativo deve fazer um loop até que o usuário acerte o número oculto gerado, ou até que vença o número de tentativas.
caso alguma das alternativas seja atingida, imprima você ganhou ou você perdeu.
O aplicativo deve conter um recurso de encerrar a aplicação, caso o usuário envie a letra q, o aplicativo deve ser terminado.
## Dicas
```
//para gerar números aleatorios utilize o Random do java.util
//Importação
java.util.Random
//instanciação
Random ran = new Random();
//utilização
int aleatorio = ran.nextInt();//retorna um inteiro aleatório
```
