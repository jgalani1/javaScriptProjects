import java.util.Random;

public class roundingNumbers {
    public static void main(String[] args) {
        // write your code here
        // create instance of Random class
        Random rand = new Random();
        double randInt = rand.nextDouble() * 8; //Limit of 8

        //Round number to 2 decimals
        //The 100.0 is important...dont forget the .0
        System.out.println(Math.round(randInt * 100.0)/100.0);

        //Round number to 1 decimal
        double randInt2 = rand.nextDouble();  //Limit of 0.99
        System.out.println(Math.round(randInt2 * 10.0)/10.0);

    }
}
