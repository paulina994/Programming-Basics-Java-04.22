package FirstStepInCoding.Lab;

import java.util.Scanner;

public class ConcatenateData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Прочитане на вход
        // име, фамилия, възраст, град
        String firstname = scanner.nextLine();
        String lastname = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String town = scanner.nextLine();

        System.out.printf("You are %s %s, a %d-years old person from %s.", firstname , lastname , age , town );
;

    }
}
