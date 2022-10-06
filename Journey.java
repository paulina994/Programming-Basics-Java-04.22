package FirstStepInCoding.Exercises;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double amount = 0.0;
        String type = "";
        String destination = "";
        if (budget <= 100.00) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                amount = budget * 0.30;
                type = "Camp";

            } else {
                amount = budget * 0.70;
                type = "Hotel";
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                type = "Camp";
                amount = budget * 0.40;
            } else {
                type = "Hotel";
                amount = budget * 0.80;
            }


        }
        if (budget > 1000) {
            destination = "Europe";
            amount = budget * 0.90;
            type = "Hotel";

        }System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.02f", type, amount);
    }
}
