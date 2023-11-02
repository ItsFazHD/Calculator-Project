import java.util.Scanner;

public class Subtraction {
    public static void subtraction() {
        Scanner input = new Scanner(System.in);

        System.out.println("Subtraction: \nPlease enter a number: ");
        double first = input.nextDouble();

        System.out.println("Please enter another number: ");
        double second = input.nextDouble();

        double sum = first - second;
        System.out.println("The total is: " + sum);

        System.out.println("Continue? \n1 to return to menu \n2 to continue subtraction \n0 to exit");

        switch (input.nextInt()) {
            case 1:
                Main.main(null);
                break;
            case 2:
                Subtraction.subtraction();
                break;
            case 0:
                input.close();
                break;
        }
    }
}