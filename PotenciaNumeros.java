// q5 seq

import java.util.Scanner;
import java.lang.Math;

public class PotenciaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro número:");

        double numero1 = scanner.nextDouble();

        System.out.println("Insira o segundo número:");

        double numero2 = scanner.nextDouble();

        double resultado = Math.pow(numero1, numero2);

        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}
