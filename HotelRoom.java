package FirstStepInCoding.Exercises;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());


        double studioPrice = 0;
        double apartementPrice = 0;

        if (month.equals("mai and october")) {
            studioPrice = 50.00;
            apartementPrice = 65.00;
            if (count > 7) {
                studioPrice = studioPrice - (studioPrice * 0.05);
            }
            if (count > 14) {
                studioPrice = studioPrice - (studioPrice * 0.30);
            }
        }
        if (month.equals("june and september")) {
            studioPrice = 75.20;
            apartementPrice = 68.70;
            if (count > 14) {
                studioPrice = studioPrice - (studioPrice * 0.30);
            }
        }
        if (month.equals("july and august")) {
            studioPrice = 76.00;
            apartementPrice = 77.00;
        }
        if (count > 14) {
            apartementPrice = apartementPrice - (apartementPrice * 0.30);
        }
        System.out.printf("Apartment: %.2f%n lv.", apartementPrice);
        System.out.printf("Studio: %.2f lv.", studioPrice);
    }
}
