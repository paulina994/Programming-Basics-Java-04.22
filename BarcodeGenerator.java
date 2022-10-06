package FirstStepInCoding.Lab;

import java.util.Scanner;

public class BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        int startUnits = start % 10;
        int startTents = start / 10 % 10;
        int startHundreds = start / 100 % 10;
        int startThousands = start / 1000 % 10;


        int endUnits = start % 10;
        int endTents = start / 10 % 10;
        int endHundreds = start / 100 % 10;
        int endThousands = start / 1000 % 10;

        for (int i = startThousands; i <= endThousands; i++) {
            for (int j = startHundreds; j <= endHundreds; i++) {
                for (int k = startTents; k <= endTents; i++) {
                    for (int l = startUnits; l <= endUnits; i++) {
                        if (i % 2 !=0 && j %2 != 0 && k%2 !=0 && l%2 !=0){
                            System.out.printf("%d%d%d%d" , i ,j ,k ,l );
                        }

                    }
                }
            }
        }
    }
}