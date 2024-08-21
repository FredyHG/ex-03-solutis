package conjunto_2;

import java.util.Scanner;

    public class Atividade09 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o seu ano de nascimento: ");
            int anoNascimento = scanner.nextInt();

            int anoAtual = 2023; // ano atual (você pode mudar isso para obter o ano atual dinamicamente)

            int idade = anoAtual - anoNascimento;

            if (idade >= 18) {
                System.out.println("Você é maior de idade.");
            } else {
                System.out.println("Você é menor de idade.");
            }
        }
    }

