// q2 cond
import java.util.Scanner;

public class VerificaCondicao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro número:");
        int numero1 = scanner.nextInt();

        System.out.println("Insira o segundo número:");
        int numero2 = scanner.nextInt();

        System.out.println("Insira o terceiro número:");
        int numero3 = scanner.nextInt();

        scanner.close();

        if (numero1 > numero2 && numero1 > numero3 && numero2 != numero3) {
            System.out.println("Condição satisfeita");
        } else {
            System.out.println("Erro");
        }
    }
}
