package Conjunto_3;

public class Atividade49 {
    public static void main(String[] args) {
        long[] fibonacci = new long[50];
        fibonacci[0] = 1;
        fibonacci[1] = 1;

        for (int i = 2; i < 50; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        System.out.println("50 primeiros números da seqüência de Fibonacci: ");
        for (int i = 0; i < 49; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }
}
