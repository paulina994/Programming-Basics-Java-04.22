package FirstStepInCoding.Exercises;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        int all = rows * cols;
        double income = 0;

        //switch (type){
        //            case "Premiere":
        //            income = all * 12.00;
        //            break;
        //            case "Normal":
        //            income = all * 7.50;
        //            break;
        //            case "Discount":
        //            income = all * 5.00;
        //            break;}

        if (type.equals("Premiere")) {
            income = all * 12.00;
        } else if (type.equals("Normal")) {
            income = all * 7.50;
        } else if (type.equals("Discount")) {
            income = all * 5.00;
        }


        System.out.printf("%.2f leva", income);
    }


        }


