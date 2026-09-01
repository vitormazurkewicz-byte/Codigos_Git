import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double reais;
        double dolar;

        System.out.print("Digite o valor em reais: ");
        reais = entrada.nextDouble();

        System.out.print("Digite a cotacao do dolar: ");
        dolar = entrada.nextDouble();

        System.out.println("Valor em dolar: " + (reais / dolar));

    }
}
