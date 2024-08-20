package Conjunto_4;

import java.util.Scanner;
public class Atividade60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor inicial da dívida: ");
        double divida = scanner.nextDouble();

        System.out.print("Digite a taxa de correção mensal (%): ");
        double taxaCorrecao = scanner.nextDouble() / 100;

        System.out.print("Digite a quantidade de anos: ");
        int anos = scanner.nextInt();

        System.out.println("Ano\tJan\tFev\tMar\tAbr\tMai\tJun\tJul\tAgo\tSet\tOut\tNov\tDez");
        
        for (int ano = 2007; ano < 2007 + anos; ano++) {
            System.out.print(ano + "\t");
            for (int mes = 1; mes <= 12; mes++) {
                divida += divida * taxaCorrecao;
                System.out.printf("%.2f\t", divida);
            }
            System.out.println();
        }
        scanner.close();
    }
}
