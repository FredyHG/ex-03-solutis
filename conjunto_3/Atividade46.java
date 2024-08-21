package conjunto_3;
import java.util.Scanner;

public class Atividade46 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int TAMANHO_LISTA = 200;

        int homensMaioresIdade = 0;
        int mulheresMaioresIdade = 0;

        for (int i = 0; i < TAMANHO_LISTA; i++) {
            System.out.println("Pessoa " + (i + 1) + ":");

            System.out.print("Digite o gênero (M para masculino, F para feminino): ");
            char genero = scanner.next().toUpperCase().charAt(0);

            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();

            if (idade >= 18) {
                if (genero == 'M') {
                    homensMaioresIdade++;
                } else if (genero == 'F') {
                    mulheresMaioresIdade++;
                } else {
                    System.out.println("Gênero inválido. Use M para masculino ou F para feminino.");
                }
            }
        }
        scanner.close();

        System.out.println("Quantidade de homens maiores de idade: " + homensMaioresIdade);
        System.out.println("Quantidade de mulheres maiores de idade: " + mulheresMaioresIdade);
    }
}
