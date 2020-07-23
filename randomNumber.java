import java.util.Random;

public class randomNumber {

    public static void main(String[] args) {
        // write your code here
        // create instance of Random class
        Random rand = new Random();

        // Generate random integers in range 90 to 110
        int rand_int1 = 90 + rand.nextInt(21);
        System.out.println(rand_int1);

        // Generate Random doubles between 34.7838 (inclusive) and
        //187.056 (exclusive)
        //Can round the double to the nearest integer
        double rand_dub1 = 34.7838 + 152.2722 * rand.nextDouble();
        System.out.println(Math.round(rand_dub1));

    }
}
