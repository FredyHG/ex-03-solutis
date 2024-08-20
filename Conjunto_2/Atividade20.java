package Conjunto_2;
import java.util.Scanner;

public class Atividade20 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome da primeira pessoa: ");
        String nome1 = scanner.nextLine();
        System.out.print("Digite a idade da primeira pessoa: ");
        int idade1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o nome da segunda pessoa: ");
        String nome2 = scanner.nextLine();
        System.out.print("Digite a idade da segunda pessoa: ");
        int idade2 = scanner.nextInt();
        scanner.close();

        if (idade1 > idade2) {
            System.out.println("A pessoa mais velha é: " + nome1);
            System.out.println("A pessoa mais nova é: " + nome2);
        } else if (idade2 > idade1) {
            System.out.println("A pessoa mais velha é: " + nome2);
            System.out.println("A pessoa mais nova é: " + nome1);
        } else {
            System.out.println("Ambas as pessoas têm a mesma idade.");
        }
    }
}
