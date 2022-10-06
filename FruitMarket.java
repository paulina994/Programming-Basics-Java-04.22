package FirstStepInCoding.Lab;

import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        double strawberriesPrice = Double.parseDouble(scanner.nextLine());
        double bananasQuantity = Double.parseDouble(scanner.nextLine());
        double orangesQuantity = Double.parseDouble(scanner.nextLine());
        double raspberriesQuantity = Double.parseDouble(scanner.nextLine());
        double strawberriesQuantity = Double.parseDouble(scanner.nextLine());

        double raspberriesPrice = strawberriesPrice / 2;
        double orangePrice = raspberriesPrice - raspberriesPrice*0.40;
        double bananasPrice = raspberriesPrice - raspberriesPrice*0.80;

        double totalPrice = strawberriesPrice * strawberriesQuantity + raspberriesPrice * raspberriesQuantity + orangePrice * orangesQuantity+ bananasPrice * bananasQuantity;

System.out.printf("%.2f" , totalPrice);

    }
}
