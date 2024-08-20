package Conjunto_2;

import java.util.Scanner;

public class Atividade26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first time in seconds: ");
        int time1 = sc.nextInt();

        System.out.print("Enter the second time in seconds: ");
        int time2 = sc.nextInt();

        int difference = Math.abs(time1 - time2);

        System.out.println("The difference between the two times is: " + difference + " seconds.");

        sc.close();
    }
}
