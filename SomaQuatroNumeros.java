// q1 seq
import java.util.Scanner;

public class SomaQuatroNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe quatro números, em sequência:");

        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        int numero3 = scanner.nextInt();
        int numero4 = scanner.nextInt();

        int soma = numero1 + numero2 + numero3 + numero4;

        System.out.println("Resultado da soma: " + soma);

        scanner.close();
    }
}
