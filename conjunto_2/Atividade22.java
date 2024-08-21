package conjunto_2;
import java.util.Scanner;

public class Atividade22 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dia do primeiro aniversário: ");
        int dia1 = scanner.nextInt();
        System.out.print("Digite o mês do primeiro aniversário: ");
        int mes1 = scanner.nextInt();

        System.out.print("Digite o dia do segundo aniversário: ");
        int dia2 = scanner.nextInt();
        System.out.print("Digite o mês do segundo aniversário: ");
        int mes2 = scanner.nextInt();
        scanner.close();

        if (dia1 == dia2 && mes1 == mes2) {
            System.out.println("As datas de aniversário são iguais.");
        } else {
            System.out.println("As datas de aniversário são diferentes.");
        }
    }
}
