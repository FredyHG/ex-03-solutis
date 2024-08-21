package conjunto_3;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Atividade54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        System.out.print("Enter the initial value in reais: ");
        double initialValue = sc.nextDouble();

        System.out.print("Enter the final value in reais: ");
        double finalValue = sc.nextDouble();

        System.out.print("Enter the increment value in reais: ");
        double increment = sc.nextDouble();

        System.out.print("Enter the value of 1 dollar in reais: ");
        double dollarValue = sc.nextDouble();

        System.out.println("Conversion Table (Reais to Dollars):");
        System.out.printf("%-20s%-20s%n", "Reais", "Dollars");

        for (double reais = initialValue; reais <= finalValue; reais += increment) {
            double dollars = reais / dollarValue;
            System.out.printf("%-20s%-20s%n", currencyFormat.format(reais), String.format("%.2f", dollars));
        }

        sc.close();

    }
}
