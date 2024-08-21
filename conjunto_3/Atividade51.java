package conjunto_3;

public class Atividade51 {
    public static void main(String[] args) {
        int n = 10;
        long[] fibonacci = new long[n];
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        fibonacci[2] = 2;

        for (int i = 3; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2] + fibonacci[i - 3];
        }

        System.out.println(n+" primeiros números da seqüência de Tribonacci: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }
}
