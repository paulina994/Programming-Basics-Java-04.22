package FirstStepInCoding.Lab;

import java.util.Scanner;

public class ProgrammingBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pagePrice = Double.parseDouble(scanner.nextLine());
        double coverPrice = Double.parseDouble(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());
        double designerPrice = Double.parseDouble(scanner.nextLine());
        int percentPayFromТеam=Integer.parseInt(scanner.nextLine());

        double sum = pagePrice * 899 + coverPrice * 2;
        double sumWithoutDiscount = sum - sum*discount/100;
        double sumWithDesignerPrice = sumWithoutDiscount + designerPrice;
        double totalSum = sumWithDesignerPrice - sumWithDesignerPrice*percentPayFromТеam/100;

System.out.printf("Avtonom should pay %.2f BGN.", totalSum);
        }

    }




