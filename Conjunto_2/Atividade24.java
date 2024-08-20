package Conjunto_2;

import java.util.Scanner;

public class Atividade24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um dia: ");
        int dia = sc.nextInt();
        System.out.print("Digite um mês: ");
        int mes = sc.nextInt();
        System.out.print("Digite um ano: ");
        int ano = sc.nextInt();

        if (ehDataValida(dia, mes, ano)) {
            System.out.println("A data é válida.");
        } else {
            System.out.println("A data é inválida.");
        }
    }

    private static boolean ehDataValida(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12) {
            return false;
        }

        int diasNoMes;
        switch (mes) {
            case 2:
                if (ehAnoBissexto(ano)) {
                    diasNoMes = 29;
                } else {
                    diasNoMes = 28;
                }
                break;
            case 4, 6, 9, 11:
                diasNoMes = 30;
                break;
            default:
                diasNoMes = 31;
                break;
        }
        return dia >= 1 && dia <= diasNoMes;
    }

    private static boolean ehAnoBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
}
