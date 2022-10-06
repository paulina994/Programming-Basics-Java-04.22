package FirstStepInCoding.Exercises;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner=new Scanner((System.in));

        String ActorName = scanner.nextLine();
        double Points = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());



        for (int i = 1; i <= n; i++) {
            String name = scanner.nextLine();
            double evalutingPoints = Double.parseDouble(scanner.nextLine());

            Points = Points + (name.length() * evalutingPoints) / 2;
            if (Points >= 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", ActorName, Points);
                break;

            }
        }
        if(Points < 1250.50) {System.out.printf("Sorry, %s you need %.1f more!" , ActorName , 1250.5-Points);
            }


        }

    }
