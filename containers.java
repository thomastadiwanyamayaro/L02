import java.util.Random;
import java.util.Scanner;

public class containers {

    public static void main(String[] args) {
        Random random = new Random();
        int numofbricks = random.nextInt(51) + 50;

        int Capacity = random.nextInt(6) + 5;

        int fullContainers = numofbricks /Capacity ;


        int notFullContainers = numofbricks % Capacity == 0 ? fullContainers : fullContainers + 1;


        int remainingBlocks = numofbricks % Capacity;


        System.out.println("Num of Lego bricks: " + numofbricks);
        System.out.println("Container capacity: " + Capacity);
        System.out.println("Number of full containers: " + fullContainers);
        System.out.println("Number of not full containers: " + notFullContainers);
        System.out.println("Number of blocks in the container that is not completely full: " + remainingBlocks);


        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        scanner.close();
    }
}
