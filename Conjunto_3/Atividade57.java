package Conjunto_3;

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

        LocalDate startDate = readDate(scanner, "Enter the start date (dd/MM/yyyy): ");
        LocalDate endDate = readDate(scanner, "Enter the end date (dd/MM/yyyy): ");

        if (startDate.isAfter(endDate)) {
            System.out.println("Start date must be before or equal to end date.");
            return;
        }

        System.out.println("Dates between " + startDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " and " + endDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ":");
        LocalDate currentDate = startDate;

        while (!currentDate.isAfter(endDate)) {
            System.out.println(currentDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            currentDate = currentDate.plusDays(1);
        }

        scanner.close();
    }
}
