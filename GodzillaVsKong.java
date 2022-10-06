package FirstStepInCoding.Exercises;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double clothesPrice = Double.parseDouble(scanner.nextLine());

        double decorPrice = budget * 0.10;
        double statistClothesPrice = statists * clothesPrice;
        if (statists > 150) {
            statistClothesPrice = statistClothesPrice - (statistClothesPrice * 0.10);

        }
        double totalPrice = decorPrice + statistClothesPrice;
        if (budget >= totalPrice){
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left." , budget - totalPrice);

        }else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more." , Math.abs(budget-totalPrice));
        }

    }
}
