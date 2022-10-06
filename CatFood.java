package FirstStepInCoding.Lab;

import java.util.Scanner;

public class CatFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cats = Integer.parseInt(scanner.nextLine());


        int smallCats = 0;
        int bigCats = 0;
        int hugeCats = 0;
        int counter = 0;

        for (int i = 1; i <=cats ; i++) {
            Double grams = Double.parseDouble(scanner.nextLine());
            if (100 <= grams && grams < 200) {
                smallCats ++;
                counter += grams ;
            } else if (200 <= grams && grams < 300) {
                bigCats ++;
                counter += grams ;
            } else {
                hugeCats ++;
                counter += grams ;
            }

        }double food = counter / 1000.00 *12.45;

        System.out.printf("Group 1: %d cats.%n" , smallCats);
        System.out.printf("Group 2: %d cats.%n" , bigCats);
        System.out.printf("Group 3: %d cats.%n" , hugeCats);
        System.out.printf("Price for food per day: %.2f lv." , food);

    }
}
