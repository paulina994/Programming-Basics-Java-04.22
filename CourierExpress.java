package FirstStepInCoding.Lab;

import java.util.Scanner;

public class CourierExpress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight = Double.parseDouble(scanner.nextLine());
        String type = scanner.nextLine();
        int distance = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;
        double markup = 0;
        double markupPerKm = 0;
        switch (type) {
            case "standard":
                //•	За пратки по - леки от 1 кг – 3 стотинки на километър.
                //•	От 1 кг до 10 кг – 5 стотинки на километър.
                //•	От 10 кг вкл. до 40 кг – 10 стотинки на километър.
                //•	От 40 кг вкл. до 90  кг – 15 стотинки на километър.
                //•	От 90 кг вкл. до 150 кг – 20 стотинки на километър.
                if (weight < 1) {
                    totalPrice = 0.03 * distance;

                    break;
                }else if (weight < 10) {
                    totalPrice = 0.05 * distance;

                    break;
                }else if (weight <= 40) {
                    totalPrice = 0.10 * distance;

                    break;
                }else if (weight <= 90) {
                    totalPrice = 0.15 * distance;

                    break;
                }else if (weight <= 150) {
                totalPrice = 0.20 * distance;
            }
            break;
            case "express":
                //•	За пратки по - леки от 1 кг – на килограм по 80 % от съответната цена на километър
                //•	От 1 кг до 10  кг – на килограм по 40 % от съответната цена на километър
                //•	От 10 кг вкл. до 40 кг – на килограм по 5 % от съответната цена на километър
                //•	От 40 кг вкл. до 90  кг – на килограм по 2 % от съответната цена на километър
                //•	От 90 кг вкл. до 150 кг – на килограм по 1 % от съответната цена на километър

                if (weight < 1) {
                    markup = 0.02*0.03;
                    markupPerKm= markup * weight * distance;
                    totalPrice = distance*0.03 + markupPerKm;

                    break;
                }else if (weight < 10) {
                    markup = 0.40* 0.05;
                    markupPerKm= markup * weight * distance;
                    totalPrice = distance * 0.05 + markupPerKm;

                    break;
                }else if (weight <= 40) {
                    markup = 0.05*0.10;
                    markupPerKm= markup * weight * distance;
                    totalPrice = distance *0.10 +markupPerKm;

                    break;
                }else if (weight <= 90) {
                    markup = 0.02*0.15;
                    markupPerKm= markup * weight * distance;
                    totalPrice = distance * 0.15 + markupPerKm;


                    break;
                }else if (weight <= 150) {
                    markup = 0.01*0.20;
                    markupPerKm= markup * weight * distance;
                    totalPrice = distance * 0.20 + markupPerKm;
                }
            break;
        }

        System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv." , weight , totalPrice);
    }
}
