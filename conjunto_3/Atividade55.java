package conjunto_3;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Atividade55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        double monthlyFee = 50.00;
        int initialMinutes = 100;
        int bonusMinutes = 50;
        double excessRateOther = 0.65;
        double excessRateVaiVai = 0.20;
        double halfRateFixed = 0.325;

        double remainingMinutes = initialMinutes + bonusMinutes;
        double totalAmount = 0.00;

        System.out.println("Vai-Vai Plan:");
        System.out.println("Monthly fee: " + currencyFormat.format(monthlyFee));
        System.out.println("Includes 100 minutes and 50 additional minutes for calls to Vai-Vai.");
        System.out.println("Fixed phone calls are charged at half the rate of other operators.");

        while (true) {
            System.out.print("Enter the type of call ('o' = other operators, 'v' = Vai-Vai, 'f' = fixed phone) or 's' to stop: ");
            String type = scanner.nextLine().toLowerCase();

            if (type.equals("s")) {
                break;
            }

            System.out.print("Enter the number of minutes: ");
            double minutes = scanner.nextDouble();
            scanner.nextLine();

            double amountToPay = 0.00;

            if (type.equals("o")) {
                if (minutes > remainingMinutes) {
                    amountToPay = (minutes - remainingMinutes) * excessRateOther;
                }
                remainingMinutes = Math.max(0, remainingMinutes - minutes);
            } else if (type.equals("v")) {
                if (minutes > remainingMinutes) {
                    amountToPay = (minutes - remainingMinutes) * excessRateVaiVai;
                }
                remainingMinutes = Math.max(0, remainingMinutes - minutes);
            } else if (type.equals("f")) {
                if (minutes > remainingMinutes) {
                    amountToPay = (minutes - remainingMinutes) * halfRateFixed;
                }
                remainingMinutes = Math.max(0, remainingMinutes - minutes);
            } else {
                System.out.println("Invalid call type. Please try again.");
                continue;
            }

            totalAmount += amountToPay;

            System.out.println("Remaining minutes balance: " + remainingMinutes + " minutes.");
            System.out.println("Amount to pay for this call: " + currencyFormat.format(amountToPay));
            System.out.println("Total amount to pay so far: " + currencyFormat.format(totalAmount));
        }

        System.out.println("Total amount to pay at the end of the month: " + currencyFormat.format(totalAmount + monthlyFee));

        scanner.close();
    }
}
