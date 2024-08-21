package conjunto_2;
import java.util.Scanner;

public class Atividade21 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o cargo do funcionário:");
        System.out.println("1. Diretoria");
        System.out.println("2. Gerência");
        System.out.println("3. Operacional");

        System.out.print("Digite o número correspondente ao cargo: ");
        int escolhaCargo = scanner.nextInt();

        System.out.print("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();
        scanner.close();

        double percentual = 0;
        switch (escolhaCargo) {
            case 1:
                percentual = 0.30;
                break;
            case 2:
                percentual = 0.25;
                break;
            case 3:
                percentual = 0.20;
                break;
            default:
                System.out.println("Escolha de cargo inválida.");
                return;
        }

        double emprestimo = salario * percentual;

        System.out.println("O valor do empréstimo possível para o cargo selecionado é: R$ " + emprestimo);
    }
}
