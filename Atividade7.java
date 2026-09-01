algoritmo "Exercicio7"

var
   base, altura: real
   area, perimetro, diagonal: real

inicio

   escreva("Digite a base do retangulo: ")
   leia(base)

   escreva("Digite a altura do retangulo: ")
   leia(altura)

   area <- base * altura

   perimetro <- 2 * (base + altura)

   diagonal <- raizq(base ^ 2 + altura ^ 2)

   escreval("Area: ", area)
   escreval("Perimetro: ", perimetro)
   escreval("Diagonal: ", diagonal)

fimalgoritmo
