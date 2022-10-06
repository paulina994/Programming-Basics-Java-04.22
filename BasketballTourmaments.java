package FirstStepInCoding.Lab;

import java.util.Scanner;

public class BasketballTourmaments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tournament = scanner.nextLine();

        int allMatches = 0;
        int wins = 0;
        int lost = 0;
        while (!tournament.equals("End of tournaments")) {
            int matches = Integer.parseInt(scanner.nextLine());
            allMatches += matches;
            for (int i = 1; i <= matches; i++) {
                int myPoints = Integer.parseInt(scanner.nextLine());
                int otherPoints = Integer.parseInt(scanner.nextLine());
                if (myPoints > otherPoints) {
                    wins++;
                    System.out.printf("Game %d" + "of tournament %s" + "win with %d points%n",
                            i, tournament, myPoints - otherPoints);
                } else {
                    lost++;
                    System.out.printf("Game %d of tournament %s: lost with %d points.%n", i, tournament, otherPoints - myPoints);
                }
            }


            tournament = scanner.nextLine();
        }
        double winPercent = wins * 1.0 / allMatches/0.01;
        double lostPercent = lost * 1.0 / allMatches/0.01;
        System.out.printf("%.2f%% matches win%n" , winPercent);
        System.out.printf("%.2f%% matches lost" , lostPercent);
    }
}

