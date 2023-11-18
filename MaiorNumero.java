// q1 cond
import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro número:");
        double numero1 = scanner.nextDouble();

        System.out.println("Insira o segundo número:");
        double numero2 = scanner.nextDouble();

        scanner.close();

        if (numero1 > numero2) {
            System.out.println("O maior é: " + numero1);
        } else if (numero1 < numero2) {
            System.out.println("O maior é: " + numero2);
        } else {
            System.out.println("Os números são iguais");
        }
    }
}
