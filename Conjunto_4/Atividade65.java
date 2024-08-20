package Conjunto_4;

import java.util.Scanner;

public class Atividade65 {
    private static void drawPyramid(int numLines) {
        for (int i = 1; i <= numLines; i++) {
            for (int j = numLines; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of lines for the pyramid: ");
        int numLines = scanner.nextInt();

        drawPyramid(numLines);

        scanner.close();
    }
}
