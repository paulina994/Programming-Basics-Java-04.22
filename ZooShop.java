package FirstStepInCoding.Lab;

import java.util.Scanner;

public class ZooShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogsPackages = Integer.parseInt(scanner.nextLine());
        int catsPackages = Integer.parseInt(scanner.nextLine());

        //храна за кучета е на цена 2.50лв
        double dogsTotalPrice = dogsPackages * 2.50;
        //храна за котки струва 4лв
        double catsTotalPrice = catsPackages * 4;
        //всичко разходи
        double TotalExpenses = dogsTotalPrice + catsTotalPrice;

        System.out.printf("%f lv." , TotalExpenses);

    }
}
