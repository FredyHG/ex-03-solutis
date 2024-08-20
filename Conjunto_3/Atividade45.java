package Conjunto_3;
import java.util.Scanner;

public class Atividade45 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int TAMANHO_LISTA = 100;

        double[] numeros = new double[TAMANHO_LISTA];

        System.out.println("Digite " + TAMANHO_LISTA + " números:");

        for (int i = 0; i < TAMANHO_LISTA; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }
        scanner.close();

        double maiorNumero = numeros[0];
        for (int i = 1; i < TAMANHO_LISTA; i++) {
            if (numeros[i] > maiorNumero) {
                maiorNumero = numeros[i];
            }
        }

        System.out.println("O maior número na lista é: " + maiorNumero);
    }
}