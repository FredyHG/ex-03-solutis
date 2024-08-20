package Conjunto_3;

import java.util.Random;
import java.util.Scanner;

public class Atividade35 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            System.out.print("Digite a quantidade de números a serem sorteados: ");
            int quantidade = scanner.nextInt();

            System.out.print("Digite o início da faixa de sorteio: ");
            int inicioFaixa = scanner.nextInt();

            System.out.print("Digite o fim da faixa de sorteio: ");
            int fimFaixa = scanner.nextInt();

            for (int i = 0; i < quantidade; i++) {
                int numeroSorteado = random.nextInt(fimFaixa - inicioFaixa + 1) + inicioFaixa;
                System.out.print(numeroSorteado + " ");
            }
        }
    }
