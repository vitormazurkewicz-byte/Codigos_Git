import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome;
        int idade;
        double altura;

        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        idade = scanner.nextInt();

        System.out.print("Digite sua altura: ");
        altura = scanner.nextDouble();

        System.out.println("Nome: " + nome +
                ", idade: " + idade +
                " anos e altura: " + altura + " metros.");

        
    }
}
