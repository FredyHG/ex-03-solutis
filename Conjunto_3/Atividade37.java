package Conjunto_3;

import java.util.Scanner;
public class Atividade37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para calcular o fatorial: ");
        int num = sc.nextInt();

        long fatorial = 1;
        for (int i = 2; i <= num; i++) {
            fatorial *= i;
        }
        System.out.println("O fatorial de " + num + " é: " + fatorial);

    }
}
