package Conjunto_1;

import java.util.Scanner;
public class Atividade02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor do seu salário: ");
        double salario = sc.nextDouble();

        System.out.print("Informe o valor do salário mínimo: ");
        double salarioMinimo = sc.nextDouble();

        double quantidadeSalarios = salario / salarioMinimo;

        System.out.println("Você ganha " + quantidadeSalarios + " salários mínimos.");

        sc.close();
    }
}
