package Conjunto_1;

import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorDivida, jurosMensais;
        int meses;

        System.out.print("Digite o valor total da dívida: ");
        valorDivida = sc.nextDouble();
        System.out.print("Digite a quantidade de meses em que a dívida seve ser paga: ");
        meses = sc.nextInt();
        System.out.print("Digite o percentual de juros mensal: ");
        jurosMensais = sc.nextDouble();

        double valorJuros = valorDivida * jurosMensais * meses;
        double valorFinal = valorJuros + valorDivida;

        System.out.println("O valor final da divida é de R$"+String.format("%.2f", valorFinal));
    }
}
