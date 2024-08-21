package conjunto_2;

import java.util.Scanner;

    public class Atividade08 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o numerador: ");
            int numerador = scanner.nextInt();

            System.out.print("Digite o denominador: ");
            int denominador = scanner.nextInt();

            if (denominador == 0) {
                System.out.println("Erro: o denominador não pode ser zero!");
            } else {
                double resultado = (double) numerador / denominador;
                System.out.println("O resultado é: " + resultado);
            }
        }
    }