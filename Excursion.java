package FirstStepInCoding.Lab;

import java.util.Scanner;

public class Excursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int people=Integer.parseInt(scanner.nextLine());
        int nights=Integer.parseInt(scanner.nextLine());
        int cards=Integer.parseInt(scanner.nextLine());
        int tickets=Integer.parseInt(scanner.nextLine());

int nightsPerPerson = 20* nights;
double cardsPerPerson = 1.60 * cards;
int ticketsPerPerson = 6*tickets;

double totalPricePerPerson = nightsPerPerson + cardsPerPerson + ticketsPerPerson;
double totalPrice = totalPricePerPerson * people;
 double total = totalPrice + totalPrice*0.25;

 System.out.printf("%.2f" , total);

    }
}
