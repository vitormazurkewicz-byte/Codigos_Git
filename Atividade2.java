import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.print("Digite o primeiro numero: ");
        numero1 = entrada.nextInt();

        System.out.print("Digite o segundo numero: ");
        numero2 = entrada.nextInt();

        System.out.println("Soma: " + (numero1 + numero2));
        System.out.println("Subtracao: " + (numero1 - numero2));
        System.out.println("Multiplicacao: " + (numero1 * numero2));
        System.out.println("Divisao: " + (numero1 / numero2));
        System.out.println("Resto: " + (numero1 % numero2));

    }
}
