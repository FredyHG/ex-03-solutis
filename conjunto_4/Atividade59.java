package conjunto_4;

public class Atividade59 {
        public static void main(String[] args) {
            System.out.println("Tabuadas de Adição:");
            for (int i = 1; i <= 10; i++) {
                System.out.println("Tabuada do " + i);
                for (int j = 1; j <= 10; j++) {
                    System.out.println(i + " + " + j + " = " + (i + j));
                }
                System.out.println();
            }

            System.out.println("Tabuadas de Subtração:");
            for (int i = 1; i <= 10; i++) {
                System.out.println("Tabuada do " + i);
                for (int j = 1; j <= 10; j++) {
                    System.out.println(i + " - " + j + " = " + (i - j));
                }
                System.out.println();
            }

            System.out.println("Tabuadas de Multiplicação:");
            for (int i = 1; i <= 10; i++) {
                System.out.println("Tabuada do " + i);
                for (int j = 1; j <= 10; j++) {
                    System.out.println(i + " x " + j + " = " + (i * j));
                }
                System.out.println();
            }

            System.out.println("Tabuadas de Divisão:");
            for (int i = 1; i <= 10; i++) {
                System.out.println("Tabuada do " + i);
                for (int j = 1; j <= 10; j++) {
                    if (j != 0) {
                        System.out.printf(i + " / " + j + " = %.2f%n", (double) i / j); // cast para correção do dado exibido.
                    } else {
                        System.out.println(i + " / " + j + " = Indefinido");
                    }
                }
                System.out.println();
            }
        }
    }