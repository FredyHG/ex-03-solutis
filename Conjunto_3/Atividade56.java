package Conjunto_3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Enter the name of the first candidate: ");
        String candidate1 = sc.nextLine();

        System.out.print("Enter the name of the second candidate: ");
        String candidate2 = sc.nextLine();

        System.out.print("Enter the name of the third candidate: ");
        String candidate3 = sc.nextLine();

        int votesCandidate1 = 0;
        int votesCandidate2 = 0;
        int votesCandidate3 = 0;
        int votesBlank = 0;
        int totalVotes = 0;

        while (true) {
            System.out.print("Vote for (1 = " + candidate1 + ", 2 = " + candidate2 + ", 3 = " + candidate3 + ", 0 = Blank, -1 = End Voting): ");
            int vote = sc.nextInt();

            if (vote == -1) {
                break;
            }

            switch (vote) {
                case 1:
                    votesCandidate1++;
                    totalVotes++;
                    break;
                case 2:
                    votesCandidate2++;
                    totalVotes++;
                    break;
                case 3:
                    votesCandidate3++;
                    totalVotes++;
                    break;
                case 0:
                    votesBlank++;
                    totalVotes++;
                    break;
                default:
                    System.out.println("Invalid vote. Please enter 1, 2, 3, 0, or -1.");
            }
        }

        double percentCandidate1 = (totalVotes == 0) ? 0 : (votesCandidate1 * 100.0 / totalVotes);
        double percentCandidate2 = (totalVotes == 0) ? 0 : (votesCandidate2 * 100.0 / totalVotes);
        double percentCandidate3 = (totalVotes == 0) ? 0 : (votesCandidate3 * 100.0 / totalVotes);
        double percentBlank = (totalVotes == 0) ? 0 : (votesBlank * 100.0 / totalVotes);

        String winner = "";
        int maxVotes = Math.max(Math.max(votesCandidate1, votesCandidate2), votesCandidate3);

        if (votesCandidate1 == maxVotes) {
            winner = candidate1;
        } else if (votesCandidate2 == maxVotes) {
            winner = candidate2;
        } else if (votesCandidate3 == maxVotes) {
            winner = candidate3;
        }

        System.out.println("\nVoting Results:");
        System.out.println(candidate1 + ": " + votesCandidate1 + " votes (" + df.format(percentCandidate1) + "%)");
        System.out.println(candidate2 + ": " + votesCandidate2 + " votes (" + df.format(percentCandidate2) + "%)");
        System.out.println(candidate3 + ": " + votesCandidate3 + " votes (" + df.format(percentCandidate3) + "%)");
        System.out.println("Blank votes: " + votesBlank + " votes (" + df.format(percentBlank) + "%)");

        if (!winner.isEmpty()) {
            System.out.println("The winner of the election is: " + winner);
        } else {
            System.out.println("No winner, all candidates have the same number of votes.");
        }

        sc.close();
    }
}
