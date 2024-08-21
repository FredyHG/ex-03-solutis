package conjunto_3;

public class Atividade50 {
    public static void main(String[] args) {
        int n = 50;
        long[] fibonacci = new long[n];
        fibonacci[0] = 1;
        fibonacci[1] = 1;

        for (int i = 2; i < n-1; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        System.out.print("O "+ n +"º número da seqüência de Fibonacci: " + fibonacci[n-2]);
    }
}
