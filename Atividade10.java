import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double media;

        System.out.print("Digite a media: ");
        media = entrada.nextDouble();

        if (media >= 7) {

            System.out.println("Aprovado");

        } else if (media >= 5) {

            System.out.println("Recuperacao");

        } else {

            System.out.println("Reprovado");

        }

    }
}
