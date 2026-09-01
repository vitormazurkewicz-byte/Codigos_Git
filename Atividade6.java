import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double raio;
        double area;
        double perimetro;

        System.out.print("Digite o raio: ");
        raio = entrada.nextDouble();

        area = 3.14 * raio * raio;

        perimetro = 2 * 3.14 * raio;

        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);

    }
}
