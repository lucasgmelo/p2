import java.util.Scanner;

public class ContadorPositivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positivos = 0;
        int numero;

        do {
            System.out.println("Insira um número:");
            numero = scanner.nextInt();

            if (numero > 0) {
                positivos++;
            }

        } while (numero != 0);

        System.out.println("Quantidade de positivos: " + positivos);

        scanner.close();
    }
}
