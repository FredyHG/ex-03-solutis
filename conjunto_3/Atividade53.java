package conjunto_3;

import java.util.Scanner;

public class Atividade53 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        for (int i = 1; i<=10; i++){
            int produto = i * num;
            System.out.println(num + " * " + i + " = " + produto);
        }
    }
}
