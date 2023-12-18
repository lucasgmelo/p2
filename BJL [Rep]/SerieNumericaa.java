import java.util.Scanner;

public class SerieNumericaa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor de A:");
        int a = scanner.nextInt();

        System.out.println("Insira o valor de B:");
        int b = scanner.nextInt();

        System.out.print("Série numérica: ");
        for (int i = a + 1; i < b; i++) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}
