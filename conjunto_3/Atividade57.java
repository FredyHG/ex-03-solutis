package conjunto_3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Atividade57 {
    private static LocalDate readDate(Scanner scanner, String prompt) {
        System.out.print(prompt);
        String dateString = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(dateString, formatter);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate startDate = readDate(scanner, "Enter the start date (dd/MM/yyyy): ");
        LocalDate endDate = readDate(scanner, "Enter the end date (dd/MM/yyyy): ");

        if (startDate.isAfter(endDate)) {
            System.out.println("The start date must be before or equal to the end date.");
            return;
        }

        System.out.println("Dates from " + startDate.format(formatter) + " to " + endDate.format(formatter) + ":");
        LocalDate currentDate = startDate;

        while (!currentDate.isAfter(endDate)) {
            System.out.println(currentDate.format(formatter));
            currentDate = currentDate.plusDays(1);
        }

        scanner.close();
    }
}