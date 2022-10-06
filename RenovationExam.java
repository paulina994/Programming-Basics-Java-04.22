package FirstStepInCoding.Lab;

import java.util.Scanner;

public class RenovationExam {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int height = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());

        int area = height * width * 4;
        area = area - area * percent / 100;

        String input = scanner.nextLine();
        while (!input.equals("Tired!")) {
            double paint = Double.parseDouble(input);
            area -= paint;
            if (area <= 0) {
                break;
            }
            input = scanner.nextLine();

        }
        if (area == 0) {
            System.out.println("All walls are painted! Great job, Pesho!");

        }else if(area<0) {
            System.out.printf("All walls are painted and you have %d l paint left!" , Math.abs(area));
        }else{System.out.printf("%d quadratic m left." , area);}
    }
}
