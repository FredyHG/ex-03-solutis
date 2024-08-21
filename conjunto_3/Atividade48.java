package conjunto_3;
import java.util.Scanner;

public class Atividade48 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o total de aulas: ");
        int totalAulas = scanner.nextInt();

        System.out.print("Digite a quantidade de faltas: ");
        int faltas = scanner.nextInt();

        double porcentagemPresenca = ((double) (totalAulas - faltas) / totalAulas) * 100;

        if (porcentagemPresenca < 75) {
            System.out.println("Aluno reprovado por falta de frequência.");
            scanner.close();
            return;
        }

        System.out.print("Digite a quantidade de notas semestrais: ");
        int quantidadeNotas = scanner.nextInt();

        double somaNotas = 0;
        for (int i = 0; i < quantidadeNotas; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            double nota = scanner.nextDouble();
            somaNotas += nota;
        }

        double mediaSemestral = somaNotas / quantidadeNotas;

        if (mediaSemestral >= 7) {
            System.out.println("Aluno aprovado com média semestral.");
            scanner.close();
            return;
        }

        System.out.print("Digite a nota da prova final: ");
        double notaProvaFinal = scanner.nextDouble();

        double mediaFinal = (mediaSemestral * 0.6) + (notaProvaFinal * 0.4);

        if (mediaFinal >= 5) {
            System.out.println("Aluno aprovado com média final.");
        } else {
            System.out.println("Aluno reprovado por nota final.");
        }
        scanner.close();
    }
}
