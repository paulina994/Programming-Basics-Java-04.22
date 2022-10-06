package FirstStepInCoding.Exercises;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int high = Integer.parseInt(scanner.nextLine());

        double percent = Double.parseDouble(scanner.nextLine());

        int volumeSm = length * width * high;
        double volumeDs = volumeSm / 1000.00;
        double needWater = volumeDs * (1 - percent / 100);
        System.out.println(needWater);


    }
}
