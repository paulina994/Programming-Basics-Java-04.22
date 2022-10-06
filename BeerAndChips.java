package FirstStepInCoding.Lab;

import java.util.Scanner;

public class BeerAndChips {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double budget = Double.parseDouble(scanner.nextLine());
        int beerBottles = Integer.parseInt(scanner.nextLine());
        int chips = Integer.parseInt(scanner.nextLine());

double BeerTotalSum = beerBottles * 1.20;
double PriceForChips = BeerTotalSum*0.45;
double ChipsTotalSum = Math.ceil(PriceForChips * chips);
double totalSum = BeerTotalSum + ChipsTotalSum;

if(totalSum<=budget){
    System.out.printf( "%s bought a snack and has %.2f leva left." , name , budget - totalSum);

}else{System.out.printf("%s needs %.2f more leva!", name , totalSum - budget);
}


    }
}
