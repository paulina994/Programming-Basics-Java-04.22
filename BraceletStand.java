package FirstStepInCoding.Lab;

import java.util.Scanner;

public class BraceletStand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double poketMoney = Double.parseDouble(scanner.nextLine());
        double moneyPerDay = Double.parseDouble(scanner.nextLine());
        double costs = Double.parseDouble(scanner.nextLine());
        double presentPrice = Double.parseDouble(scanner.nextLine());

    double totalPoketMoney = 5* poketMoney;
    double totalMoneyPerDay = 5*moneyPerDay;
    double savedMoney = totalPoketMoney + totalMoneyPerDay;
    double savedMoneyWithoutCosts = savedMoney - costs;

    if(presentPrice <= savedMoneyWithoutCosts) {
        System.out.printf("Profit: %.2f BGN, the gift has been purchased.", savedMoneyWithoutCosts);
    }else{
        System.out.printf("Insufficient money: %.2f BGN." , presentPrice - savedMoneyWithoutCosts);
    }
    }
}
