package FirstStepInCoding.Lab;

import java.util.Scanner;

public class HighJump {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int target = Integer.parseInt(scanner.nextLine());
        int startingHeigh = target - 30;
        boolean isFall=false;
        int jumps = 0;
        while(startingHeigh<=target){
            for (int i = 1; i <=3 ; i++) {
                int currentHeigh = Integer.parseInt(scanner.nextLine());
                jumps++;
               if (currentHeigh>startingHeigh){
                    startingHeigh+=5;
                    break;

                }if(i==3){isFall = true;
                    break;
                }
            }
            if(isFall){
                break;
            }
        }if(isFall){System.out.printf("Tihomir failed at %dcm after %d jumps." , startingHeigh , jumps);
    }else {System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps." , target , jumps);}
}}
