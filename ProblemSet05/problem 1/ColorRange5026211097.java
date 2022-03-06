package ProblemSet05;

import java.util.Scanner;

public class ColorRange5026211097 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a color code :");
        double wavelength = sc.nextDouble();


        if (380 <= wavelength ) {
            System.out.println("The color is Violet");
         } else if ( 450 <= wavelength ) {
            System.out.println("The color is Blue");
         } else if ( 495 <= wavelength ) {
            System.out.println("The color is Green");
         } else if ( 570<= wavelength ) {
             System.out.println("The color is Yellow");
         } else if ( 590<= wavelength ) {
            System.out.println("The color is Orange");
         } else if ( 620<= wavelength ) {
             System.out.println("The color is Red");
         } else if ( 750<= wavelength ) {
            System.out.println("The Entered wavelength is not part of the visible spectrum");
         } else if (wavelength < 450){
            System.out.println("The Entered wavelength is not part of the visible spectrum");
         }

    }
}
