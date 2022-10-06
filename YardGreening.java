package FirstStepInCoding.Lab;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Прочитане на вход
        double area = Double.parseDouble(scanner.nextLine());
        //Изчисления
        // Цената на кв.м. е 7,61лв.
        double priceWithoutDiscount = area * 7.61;
        double Discount = priceWithoutDiscount * 0.18;
        //Цената с извадена отстъпка
        double priceWithDiscount = priceWithoutDiscount - Discount;
        // Принтиране на резултата
        System.out.printf("The final price is: %f lv.%n" ,  priceWithDiscount);
System.out.printf("The discount is: %f" , Discount);
    }
}
