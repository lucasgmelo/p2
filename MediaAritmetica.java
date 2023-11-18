// q2 seq
import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe três notas, em sequência:");

        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Média aritmética: " + Math.round(media));

        scanner.close();
    }
}
