package Conjunto_4;
import java.util.Scanner;

public class Atividade62 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas para a pirâmide: ");
        int linhas = scanner.nextInt();

        for (int i = 1; i <= linhas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i < 10 ? "0" + i + " " : i + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}