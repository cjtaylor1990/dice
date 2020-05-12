import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(final String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many sides?");
        final int sides = scanner.nextInt();

        System.out.println("How many dice?");
        final int number = scanner.nextInt();

        Dice dice = new Dice(sides, number);
        System.out.println("Your result is " + dice.roll(new Random()) + ".");
        scanner.close();
    }
}
