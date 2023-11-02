import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to FazHD's Calculator");
        System.out.println("Select 0 - 4: \n1: Addition \n2: Subtraction \n3: Division \n4: Multiplication \n0: Exit");
        Scanner input = new Scanner(System.in);

        switch (input.nextInt()) {
            case 1:
                Addition.addition();
                break;
            case 2:
                Subtraction.subtraction();
                break;
            case 3:
                Division.division();
                break;
            case 4:
                Multiplication.multiplication();
                break;
            case 0:
                input.close();
                break;
        }

    }
}
