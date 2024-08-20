package Conjunto_3;

import java.util.Scanner;
public class Atividade40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de pessoas: ");
        int quantidade = sc.nextInt();

        int[] idades = new int[quantidade];
        int somaIdades = 0;
        int maiorIdade = Integer.MIN_VALUE;
        int menorIdade = Integer.MAX_VALUE;
        int maiorDeIdade = 0;

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            idades[i] = sc.nextInt();
            somaIdades += idades[i];
            if (idades[i] > maiorIdade) maiorIdade = idades[i];
            if (idades[i] < menorIdade) menorIdade = idades[i];
            if (idades[i] >= 18) maiorDeIdade++;
        }

        double mediaIdades = (double) somaIdades / quantidade;

        System.out.println("Média das idades: " + mediaIdades);
        System.out.println("Maior idade: " + maiorIdade);
        System.out.println("Menor idade: " + menorIdade);
        System.out.println("Quantidade de pessoas maiores de idade: " + maiorDeIdade);
    }
}
