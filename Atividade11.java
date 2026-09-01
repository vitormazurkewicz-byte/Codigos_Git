import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero1;
        int numero2;
        int numero3;

        System.out.print("Digite o primeiro numero: ");
        numero1 = entrada.nextInt();

        System.out.print("Digite o segundo numero: ");
        numero2 = entrada.nextInt();

        System.out.print("Digite o terceiro numero: ");
        numero3 = entrada.nextInt();

        if (numero1 > numero2 && numero1 > numero3) {

            System.out.println("Maior: " + numero1);

        } else if (numero2 > numero3) {

            System.out.println("Maior: " + numero2);

        } else {

            System.out.println("Maior: " + numero3);

        }

    }
}
