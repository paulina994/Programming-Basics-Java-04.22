package FirstStepInCoding.Exercises;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int f = Integer.parseInt(scanner.nextLine());
        int s = Integer.parseInt(scanner.nextLine());
        int t = Integer.parseInt(scanner.nextLine());

        int sumSec = f + s + t;
        int min = sumSec / 60;
        int sec = sumSec % 60;

        if(sec <=9) {
        System.out.printf("%d:0%d%n" , min, sec);


        }else {
            System.out.printf("%d:%d" , min , sec);
        }
    }
}
