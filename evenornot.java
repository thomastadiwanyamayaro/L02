import java.util.Random;
import java.util.Scanner;

public class evenornot {


        public static void main(String[] args) {
            Random random = new Random();
            int randomNumber = random.nextInt(100) + 1;

            boolean isEven = randomNumber % 2 == 0;
            System.out.println("Generated number: " + randomNumber);
            System.out.println(randomNumber + " is " + (isEven ? "even" : "odd") + ".");
        }
}
