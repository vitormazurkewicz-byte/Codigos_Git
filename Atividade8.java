algoritmo "Exercicio8"

var
   celsius, fahrenheit, kelvin: real

inicio

   escreva("Digite a temperatura em Celsius: ")
   leia(celsius)

   fahrenheit <- (celsius * 9 / 5) + 32

   kelvin <- celsius + 273.15

   escreval("Temperatura em Fahrenheit: ", fahrenheit)
   escreval("Temperatura em Kelvin: ", kelvin)

fimalgoritmo
