package PromblemSet04;

import java.util.Scanner;

public class ProcessName {
    public static void main(String[] args){
        Scanner yourName = new Scanner(System.in);
        System.out.println("Type Your Name: ");
        String name = yourName.nextLine();
        int index = name.indexOf("");
        String secondWord = name.substring(index +6);
        String firstLetter = name.substring(0);
        String jumlahKata = name.substring(0,5);

        System.out.println(jumlahKata.length());
        System.out.println("Your Name is: " +secondWord   +", " +firstLetter.charAt(0) +".");

    }
}
