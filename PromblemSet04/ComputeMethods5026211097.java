package PromblemSet04;
import java.util.Random;

public class ComputeMethods {
    public double fToC(double degreesF){
        double degreesC = 5.0/9.0 * (degreesF-32.0);
        return degreesC;
    }
    public double hypotenuse(int a, int b) {
        return Math.sqrt( a*a + b*b);
    }
    public int roll(){
        Random num= new Random();
        return num.nextInt(6) +1 + num.nextInt(6);
    }

}
