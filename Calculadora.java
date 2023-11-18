// q5 cond
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 1 para somar;");
        System.out.println("Digite 2 para subtrair;");
        System.out.println("Digite 3 para multiplicar;");
        System.out.println("Digite 4 para dividir;");

        int escolha = scanner.nextInt();

        int numero1, numero2;

        System.out.println("Insira o primeiro valor:");
        numero1 = scanner.nextInt();

        System.out.println("Insira o segundo valor:");
        numero2 = scanner.nextInt();

        scanner.close();

        switch (escolha) {
            case 1:
                System.out.println("Soma: " + (numero1 + numero2));
                break;
            case 2:
                System.out.println("Subtração: " + (numero1 - numero2));
                break;
            case 3:
                System.out.println("Multiplicação: " + (numero1 * numero2));
                break;
            case 4:
                if (numero2 != 0) {
                    System.out.println("Divisão: " + (numero1 / (double) numero2));
                } else {
                    System.out.println("Divisão por zero.");
                }
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
}
