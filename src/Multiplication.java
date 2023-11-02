import java.util.Scanner;

public class Multiplication {
    public static void multiplication() {
        Scanner input = new Scanner(System.in);

        System.out.println("Multiplication: \nPlease enter a number: ");
        double first = input.nextDouble();

        System.out.println("Please enter another number: ");
        double second = input.nextDouble();

        double sum = first * second;
        System.out.println("Total is: " + sum);

        System.out.println("Continue? \n1 Return to menu \n2 Continue multiplication \n0 Exit");

        switch (input.nextInt()) {
            case 1:
                Main.main(null);
                break;
            case 2:
                Multiplication.multiplication();
                break;
            case 0:
                input.close();
                System.out.println("Thank you for using FazHD's calculator");
                break;
        }
    }
}