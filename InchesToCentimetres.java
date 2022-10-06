package FirstStepInCoding.Lab;

import java.util.Scanner;

public class InchesToCentimetres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Прочитане на вход
        double inches = Double.parseDouble(scanner.nextLine());
        //Пресмятания
        double centimeters = inches * 2.54;
        //Пресмятане на резултат
System.out.println(centimeters);
    }
}
