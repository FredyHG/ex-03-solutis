package Conjunto_3;

import java.util.Scanner;
public class Atividade36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        System.out.println("Números ímpares entre " + num1 + " e " + num2 + ":");
        for (int i = Math.min(num1, num2); i <= Math.max(num1, num2); i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
