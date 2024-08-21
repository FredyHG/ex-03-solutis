package conjunto_2;

import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do salário bruto: ");
        double salarioBruto = scanner.nextDouble();

        System.out.print("Digite o valor dos descontos: ");
        double descontos = scanner.nextDouble();

        System.out.print("Digite o valor do empréstimo desejado: ");
        double emprestimo = scanner.nextDouble();

        double salarioLiquido = salarioBruto - descontos;
        double limiteEmprestimo = salarioLiquido * 0.3;

        if (emprestimo <= limiteEmprestimo) {
            System.out.println("Você pode fazer o empréstimo.");
        } else {
            System.out.println("Você não pode fazer o empréstimo. O valor máximo permitido é de R$" + limiteEmprestimo);
        }
    }
}