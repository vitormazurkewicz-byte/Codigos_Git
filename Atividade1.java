import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nome;
        int idade;
        double altura;

        System.out.print("Digite seu nome: ");
        nome = entrada.nextLine();

        System.out.print("Digite sua idade: ");
        idade = entrada.nextInt();

        System.out.print("Digite sua altura: ");
        altura = entrada.nextDouble();

        System.out.println(nome + " tem " + idade + " anos e " + altura + " metros.");

    }
}
