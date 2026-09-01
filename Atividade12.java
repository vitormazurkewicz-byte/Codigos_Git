algoritmo "Exercicio12"

var
   consumo: real
   valorConta: real

inicio

   escreva("Digite o consumo mensal em kWh: ")
   leia(consumo)

   se consumo <= 100 entao

      valorConta <- consumo * 0.50

   senao

      se consumo <= 300 entao

         valorConta <- consumo * 0.75

      senao

         valorConta <- consumo * 1.10

      fimse

   fimse

   escreval("Consumo: ", consumo, " kWh")
   escreval("Valor da conta: R$ ", valorConta)

fimalgoritmo
