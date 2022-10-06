package FirstStepInCoding.Lab;

import java.util.Scanner;

public class ComputerRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       String month = scanner.nextLine();
       int hours = Integer.parseInt(scanner.nextLine());
       int people = Integer.parseInt(scanner.nextLine());
       String dayOrNight = scanner.nextLine();
       double price = 0.0;

       if(month.equals("march") || month.equals("april") ||  month.equals("may")){
           if(dayOrNight.equals("day")){
               price = 10.50;
           }else {price =8.40;}

        }if(month.equals("june") || month.equals("july") || month.equals("august")){
            if(dayOrNight.equals("day")){
                price = 12.60;
            }else {price =10.20;}

    }if(people>=4){
           price = price -price*0.10;
        }if(hours>=5){
           price = price - price *0.50;
        }

       double totalSum = price*people*hours;
System.out.printf("Price per person for one hour: %.2f%n" , price);
System.out.printf("Total cost of the visit: %.2f", totalSum);
}
}
