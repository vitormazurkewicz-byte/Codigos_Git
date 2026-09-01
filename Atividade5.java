import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double valorHora;
        double horas;
        double salario;
        double inss;
        double liquido;

        System.out.print("Valor da hora: ");
        valorHora = entrada.nextDouble();

        System.out.print("Horas trabalhadas: ");
        horas = entrada.nextDouble();

        salario = valorHora * horas;

        inss = salario * 0.08;

        liquido = salario - inss;

        System.out.println("Salario bruto: " + salario);
        System.out.println("INSS: " + inss);
        System.out.println("Salario liquido: " + liquido);

    }
}
