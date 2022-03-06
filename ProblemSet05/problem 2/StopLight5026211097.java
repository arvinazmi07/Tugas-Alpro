package ProblemSet05;

import java.util.Scanner;

public class StopLight5026211097 {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a color code :");
        int currentColor = sc.nextInt();

        if (currentColor == 1){
            System.out.println("Next Traffic light is green");
        } else if (currentColor == 3){
            System.out.println("Next  Traffic light is red");
        } else if (currentColor == 0){
            System.out.println("Invalid Color");
        }else if (currentColor == 4){
            System.out.println("Invalid Color");
        }

    }
}
