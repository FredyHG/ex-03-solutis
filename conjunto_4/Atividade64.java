package conjunto_4;

import java.util.Scanner;

public class Atividade64 {
    private static void drawTriangle(int numLines) {
        for (int i = 1; i <= numLines; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of triangles: ");
        int numTriangles = scanner.nextInt();

        for (int i = 1; i <= numTriangles; i++) {
            drawTriangle(i);

            System.out.println();
        }

        scanner.close();
    }
}
