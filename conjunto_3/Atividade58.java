package conjunto_3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Atividade58 {
    private static LocalDate readDate(Scanner scanner, String prompt) {
        System.out.print(prompt);
        String dateString = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(dateString, formatter);
    }

    private static int readNumberOfDays(Scanner scanner) {
        System.out.print("Enter the number of days to add:  ");
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LocalDate startDate = readDate(sc, "Enter the start date (dd/MM/yyyy): ");

        int numberOfDays = readNumberOfDays(sc);

        LocalDate endDate = startDate.plusDays(numberOfDays);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(startDate.format(formatter) + " + " + numberOfDays + " = " + endDate.format(formatter));

        sc.close();
    }
}
