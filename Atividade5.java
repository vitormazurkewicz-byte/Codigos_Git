algoritmo "Exercicio5"

var
   valorHora, horasMes: real
   salarioBruto, inss, salarioLiquido: real

inicio

   escreva("Digite o valor da hora trabalhada: ")
   leia(valorHora)

   escreva("Digite a quantidade de horas trabalhadas: ")
   leia(horasMes)

   salarioBruto <- valorHora * horasMes

   inss <- salarioBruto * 8 / 100

   salarioLiquido <- salarioBruto - inss

   escreval("Salario bruto: R$ ", salarioBruto)
   escreval("Desconto INSS: R$ ", inss)
   escreval("Salario liquido: R$ ", salarioLiquido)

fimalgoritmo
