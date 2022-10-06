package FirstStepInCoding.Exercises;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int games = Integer.parseInt(scanner.nextLine());
        int startPoints = Integer.parseInt(scanner.nextLine());

        int win = 0;
        int points = 0;

        for (int i = 0; i < games ; i++) {
            String types = scanner.nextLine();
            if(types.equals("W")){
                points +=2000;
                win++;
            }else if(types.equals("F")) {
                points += 1200;
            }else {
                points +=720;
            }
        }
        double percentWin = (win * 1.00 / games)*100;
        double  totalPoints = startPoints + points;
        System.out.printf("Final points: %.0f%n" , totalPoints);
        System.out.printf("Average points: %d%n" , points /games );
        System.out.printf("%.2f%%" , percentWin);
    }
}
