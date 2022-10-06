package FirstStepInCoding.Lab;

import java.util.Scanner;

public class PuppyCare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int boughtFood = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int counter = 0;
        while (!input.equals("Adopted")) {
            int OneNutrition = Integer.parseInt(input);

            counter += OneNutrition;


            input = scanner.nextLine();


        }
        int allFood = boughtFood * 1000;
        if (counter<=allFood) {
            System.out.printf("Food is enough! Leftovers: %d grams.", allFood - counter);
        } else if (counter > allFood) {
            System.out.printf("Food is not enough. You need %d grams more.", counter - allFood);

        }
    }


}