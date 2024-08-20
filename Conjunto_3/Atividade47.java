package Conjunto_3;
import java.util.Scanner;

public class Atividade47 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int quantidadePacientes = 0;
        int totalIdadeHomens = 0;
        int quantidadeHomens = 0;
        int quantidadeMulheresAlturaPeso = 0;
        int quantidadePessoas18a25 = 0;
        int idadeMaxima = Integer.MIN_VALUE;
        String nomePacienteMaisVelho = "";
        double alturaMinimaMulher = Double.MAX_VALUE;
        String nomeMulherMaisBaixa = "";


        while (true) {
            System.out.print("Digite o nome do paciente (ou 'fim' para encerrar): ");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.print("Digite o sexo do paciente (M para masculino, F para feminino): ");
            char sexo = scanner.next().toUpperCase().charAt(0);

            System.out.print("Digite o peso do paciente (em kg): ");
            double peso = scanner.nextDouble();

            System.out.print("Digite a idade do paciente: ");
            int idade = scanner.nextInt();

            System.out.print("Digite a altura do paciente (em metros): ");
            double altura = scanner.nextDouble();
            scanner.nextLine();

            quantidadePacientes++;

            if (sexo == 'M') {
                totalIdadeHomens += idade;
                quantidadeHomens++;
            }

            if (sexo == 'F' && altura >= 1.60 && altura <= 1.70 && peso > 70) {
                quantidadeMulheresAlturaPeso++;
            }

            if (idade >= 18 && idade <= 25) {
                quantidadePessoas18a25++;
            }

            if (idade > idadeMaxima) {
                idadeMaxima = idade;
                nomePacienteMaisVelho = nome;
            }

            if (sexo == 'F' && altura < alturaMinimaMulher) {
                alturaMinimaMulher = altura;
                nomeMulherMaisBaixa = nome;
            }
        }
        scanner.close();

        System.out.println("***********************************************************");
        System.out.println("Relatório:");
        System.out.println("Quantidade de pacientes: " + quantidadePacientes);
        if (quantidadeHomens > 0) {
            double mediaIdadeHomens = (double) totalIdadeHomens / quantidadeHomens;
            System.out.println("Média de idade dos homens: " + mediaIdadeHomens);
        } else {
            System.out.println("Nenhum homem foi cadastrado.");
        }
        System.out.println("Quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg: " + quantidadeMulheresAlturaPeso);
        System.out.println("Quantidade de pessoas com idade entre 18 e 25: " + quantidadePessoas18a25);
        System.out.println("Nome do paciente mais velho: " + nomePacienteMaisVelho);
        System.out.println("Nome da mulher mais baixa: " + nomeMulherMaisBaixa);
    }
}
