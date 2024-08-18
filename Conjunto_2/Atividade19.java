package Conjunto_2;
import java.util.Scanner;

public class Atividade19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro número : ");
        int num1 = scanner.nextInt();

        System.out.println("Informe o segundo número : ");
        int num2 = scanner.nextInt();


        if (num1 < num2) {
            System.out.println("Os números em ordem crescente são: " + num1 + " e " + num2);
        } else {
            System.out.println("Os números em ordem crescente são: " + num2 + " e " + num1);
        }
    }
}