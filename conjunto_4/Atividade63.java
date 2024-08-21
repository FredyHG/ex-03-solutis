package conjunto_4;

import java.util.Scanner;

public class Atividade63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de linhas: ");
        int linhas = sc.nextInt();

        for (int i =0; i<=linhas; i++){
            for (int k =1; k<=i; k++){
                System.out.printf("%02d ", k);
            }
            System.out.println();
        }
    }
}
