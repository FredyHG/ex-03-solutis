package conjunto_2;

import java.util.Scanner;
public class Atividade14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o nome de um mês: ");
        String mes = sc.nextLine().toLowerCase();
// Solução com Switch
        switch (mes) {
            case "janeiro": System.out.println("1"); break;
            case "fevereiro": System.out.println("2"); break;
            case "março": System.out.println("3"); break;
            case "abril": System.out.println("4"); break;
            case "maio": System.out.println("5"); break;
            case "junho": System.out.println("6"); break;
            case "julho": System.out.println("7"); break;
            case "agosto": System.out.println("8"); break;
            case "setembro": System.out.println("9"); break;
            case "outubro": System.out.println("10"); break;
            case "novembro": System.out.println("11"); break;
            case "dezembro": System.out.println("12"); break;
            default: System.out.println("Mês inválido.");
        }
// Solução com If
        if (mes.equalsIgnoreCase("janeiro")) {
            System.out.println("1");
        } else if (mes.equalsIgnoreCase("fevereiro")) {
            System.out.println("2");
        } else if (mes.equalsIgnoreCase("março")) {
            System.out.println("3");
        } else if (mes.equalsIgnoreCase("abril")) {
            System.out.println("4");
        } else if (mes.equalsIgnoreCase("maio")) {
            System.out.println("5");
        } else if (mes.equalsIgnoreCase("junho")) {
            System.out.println("6");
        } else if (mes.equalsIgnoreCase("julho")) {
            System.out.println("7");
        } else if (mes.equalsIgnoreCase("agosto")) {
            System.out.println("8");
        } else if (mes.equalsIgnoreCase("setembro")) {
            System.out.println("9");
        } else if (mes.equalsIgnoreCase("outubro")) {
            System.out.println("10");
        } else if (mes.equalsIgnoreCase("novembro")) {
            System.out.println("11");
        } else if (mes.equalsIgnoreCase("dezembro")) {
            System.out.println("12");
        } else {
            System.out.println("Mês inválido.");
        }

        sc.close();
    }
}
