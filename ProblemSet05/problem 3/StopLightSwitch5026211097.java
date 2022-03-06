package ProblemSet05;

import java.util.Scanner;

public class StopLightSwitch5026211097 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a color code :");
        int currentColor = sc.nextInt();

        switch (currentColor){
            case 1 :
                System.out.println("Next Traffic light is green");
                break;

            case 3 :
                System.out.println("Next  Traffic light is red");
                break;
            case 0 :
                System.out.println("Invalid Color");
                break;
            case 4 :
                System.out.println("Invalid Color");
                break;


        }
    }
}



