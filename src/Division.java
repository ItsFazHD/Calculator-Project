import java.util.Scanner;

public class Division {
    public static void division() {
        Scanner input = new Scanner(System.in);

        System.out.println("Division: \nPlease enter a number: ");
        double first = input.nextDouble();

        System.out.println("Please enter another number: ");
        double second = input.nextDouble();

        double sum = first / second;
        System.out.println("The total is: " + sum);

        System.out.println("Continue? \n1 Return to menu \n2 Continue division \n0 Exit");

        switch (input.nextInt()) {
            case 1:
                Main.main(null);
                break;
            case 2:
                Division.division();
                break;
            case 0:
                input.close();
                break;
        }
    }
}
