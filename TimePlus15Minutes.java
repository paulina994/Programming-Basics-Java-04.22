package FirstStepInCoding.Exercises;

import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Пъзел - 2.60 лв.
        //· Говореща кукла - 3 лв.
        //· Плюшено мече - 4.10 лв.
        //Миньон - 8.20 лв.
        //Камионче - 2 лв.

        int tourPrice = Integer.parseInt(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double totalPrice = dolls * 3 + bears * 4.10 + minions * 8.20 + trucks * 2 ;
        int toys = puzzles + dolls + bears + minions + trucks;
        if (toys >= 50){totalPrice = totalPrice - (totalPrice*25);}
    }


}
