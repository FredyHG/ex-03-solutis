package Conjunto_1;

public class Atividade04 {
            public static void main(String[] args) {
            double nota1 = 5;
            double nota2 = 7;
            double nota3 = 7;
            double nota4 = 6;


            double media = calculaMedia(nota1, nota2, nota3, nota4);
            System.out.println("A média é: " + media);
        }


        public static double calculaMedia(double nota1, double nota2, double nota3, double nota4) {
            double media = (nota1 + nota2 + nota3 + nota4) / 4;
            return media;
        }
    }