algoritmo "Exercicio10"

var
   media: real

inicio

   escreva("Digite a media final: ")
   leia(media)

   se media >= 7 entao

      escreval("Aluno APROVADO.")

   senao

      se media >= 5 entao
         escreval("Aluno em RECUPERACAO.")
      senao
         escreval("Aluno REPROVADO.")
      fimse

   fimse

fimalgoritmo
