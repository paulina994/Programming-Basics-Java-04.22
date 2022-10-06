package FirstStepInCoding.Exercises;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int NumberOfChichenMenus = Integer.parseInt(scanner.nextLine());
        int NumberOffishMenus = Integer.parseInt(scanner.nextLine());
        int NumberOfVegеtarianMenus = Integer.parseInt(scanner.nextLine());

        //• Пилешко меню – 10.35 лв
        //• Меню с риба – 12.40 лв.
        //• Вегетарианско меню – 8.15 л

        double sum = NumberOfChichenMenus * 10.35 + NumberOffishMenus * 12.40 + NumberOfVegеtarianMenus * 8.15;
        double dessert = sum * 20/100;
        double totalSum = sum + dessert + 2.50;

        System.out.println(totalSum);


    }
}

