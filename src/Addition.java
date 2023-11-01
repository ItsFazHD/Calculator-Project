import java.util.Scanner;

public class Addition {
    public static void addition() {
        Scanner input = new Scanner(System.in);

        System.out.println("Addition: \nPlease enter a number: ");
        int first = input.nextInt();

        System.out.println("Please enter another number: ");
        int second = input.nextInt();

        int sum = first + second;
        System.out.println("The total is: " + sum);
    }
}
