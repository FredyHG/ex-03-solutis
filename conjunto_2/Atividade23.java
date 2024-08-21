package conjunto_2;

import java.util.Date;
import java.util.Scanner;

public class Atividade23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nome = new String[2];
        int[] diaNascimento = new int[2];
        int[] mesNascimento = new int[2];

        System.out.println("Digite o nome da primeira pessoa: ");
        nome[0] = sc.nextLine();
        System.out.println("Digite o dia de nascimento da primeira pessoa: ");
        diaNascimento[0] = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o mês de nascimento da primeira pessoa: ");
        mesNascimento[0] = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o nome da segunda pessoa: ");
        nome[1] = sc.nextLine();
        System.out.println("Digite o dia de segunda da primeira pessoa: ");
        diaNascimento[1] = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o mês de segunda da primeira pessoa: ");
        mesNascimento[1] = sc.nextInt();
        sc.nextLine();

        Date dataAniversario1 = new Date(2000, mesNascimento[0], diaNascimento[0]);
        Date dataAniversario2 = new Date(2000, mesNascimento[1], diaNascimento[1]);

        System.out.println("Primeiro: " + (dataAniversario1.compareTo(dataAniversario2) < 0 ? nome[0] : nome[1]));
    }
}
