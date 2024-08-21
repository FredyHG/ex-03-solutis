package conjunto_1;

    import java.util.Scanner;

    public class Atividade01 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o seu ano de nascimento: ");
            int anoNascimento = scanner.nextInt();

            System.out.print("Digite o ano atual: ");
            int anoAtual = scanner.nextInt();

            int idade = anoAtual - anoNascimento;

            System.out.println("Você tem " + idade + " anos.");
        }
    }
