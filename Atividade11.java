algoritmo "Exercicio11"

var
   num1, num2, num3: inteiro

inicio

   escreva("Digite o primeiro numero: ")
   leia(num1)

   escreva("Digite o segundo numero: ")
   leia(num2)

   escreva("Digite o terceiro numero: ")
   leia(num3)

   se (num1 > num2) e (num1 > num3) entao

      escreval("O maior numero e: ", num1)

   senao

      se (num2 > num1) e (num2 > num3) entao

         escreval("O maior numero e: ", num2)

      senao

         escreval("O maior numero e: ", num3)

      fimse

   fimse

fimalgoritmo
