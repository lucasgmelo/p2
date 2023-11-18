// q4 cond
import java.util.Scanner;

public class OperacoesEntreNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro valor:");
        double valor1 = scanner.nextDouble();

        System.out.println("Insira o segundo valor:");
        double valor2 = scanner.nextDouble();

        scanner.close();

        if (valor1 == valor2) {
            System.out.println("Multiplicação: " + (valor1 * valor2));
        } else if (valor1 > valor2) {
            System.out.println("Subtração: " + (valor1 - valor2));
        } else {
            System.out.println("Soma: " + (valor1 + valor2));
        }
    }
}
