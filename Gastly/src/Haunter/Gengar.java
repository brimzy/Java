package Haunter;
import java.util.Scanner;

public class Gengar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int numbah;

        try {
            System.out.print("Enter a positive integer: ");
            numbah = scanner.nextInt();

            if (numbah <= 0) {
                throw new Exception("Input must be a positive integer!");
            }

            boolean isPrime = true;
            for (int i = 2; i <= numbah / 2; i++) {
                if (numbah % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(numbah + " is a prime number.");
            } else {
                System.out.println(numbah + " is not a prime number.");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}