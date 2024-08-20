package Conjunto_2;

import java.util.Scanner;

public class Atividade25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] horario = new int[3];
        System.out.print("Digite uma hora: ");
        horario[0] = sc.nextInt();
        System.out.print("Digite um minuto: ");
        horario[1] = sc.nextInt();
        System.out.print("Digite um segundo: ");
        horario[2] = sc.nextInt();

        if (ehHorarioValido(horario)) {
            System.out.println("O horário é válido.");
        } else {
            System.out.println("O horário é inválido.");
        }
    }

    private static boolean ehHorarioValido(int[] horario) {
        return ehHoraValida(horario[0]) && ehMinutoSegundoValido(horario[1]) && ehMinutoSegundoValido(horario[2]);
    }

    private static boolean ehHoraValida(int hora) {
        return hora >= 1 && hora < 24;
    }

    private static boolean ehMinutoSegundoValido(int minutoSegundo) {
        return minutoSegundo >= 1 && minutoSegundo < 60;
    }
}
