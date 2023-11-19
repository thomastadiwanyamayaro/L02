import java.util.Scanner;


public class concatenatingstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string: ");
        String firstString = scanner.nextLine();
        System.out.println("Enter the second string:");
        String secondString = scanner.nextLine();

        String concatenatedstring = firstString + secondString;
        String concatenatedstring2 = secondString + firstString;


        if (concatenatedstring.equals(concatenatedstring2)) {
            System.out.println("The composition of two different strings is alternating.");
        } else {
            System.out.println("The composition of two different strings is not alternating.");
        }

    }


}
