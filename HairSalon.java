package FirstStepInCoding.Lab;

import java.util.Scanner;

public class HairSalon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int target = Integer.parseInt(scanner.nextLine());

        int Money = 0;
        String haircut = "";
        String color = "";
String input = scanner.nextLine();
        while (!input.equals("closed")) {

            switch (haircut) {
                case "mens":
                    Money+=20;
                    break;
                case "ladies":
                    Money+=20;
                    break;

                case "kids":
                    Money+=10;
                    break;
            }
            switch (color) {
                case "touch up" :
                    Money+=20;
                    break;
                case "full color":
                    Money+=30;
                    break;

}
        }input = scanner.nextLine();
        if(target==Money){
            System.out.println("You have reached your target for the day!%n");
            System.out.printf("Earned money: %d lv." , Money);}
        if(target<=Money){
        System.out.println("You have reached your target for the day!%n");
        System.out.printf("Earned money: %d lv." , Money);}

if(target>Money){
    System.out.printf("Target not reached! You need %dlv. more.%n" , target - Money);
    System.out.printf("Earned money:%dlv" , Money);
}
    }


}
