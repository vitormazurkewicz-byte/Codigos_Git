import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double celsius;
        double fahrenheit;
        double kelvin;

        System.out.print("Digite a temperatura em Celsius: ");
        celsius = entrada.nextDouble();

        fahrenheit = (celsius * 9 / 5) + 32;

        kelvin = celsius + 273.15;

        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Kelvin: " + kelvin);

    }
}
