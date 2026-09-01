import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.print("Digite um numero: ");
        numero = entrada.nextInt();

        if (numero % 2 == 0) {

            System.out.println("Par");

        } else {

            System.out.println("Impar");

        }

    }
}
