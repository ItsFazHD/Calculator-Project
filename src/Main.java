import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to FazHD's Calculator");
        System.out.println("Select 1 - 4: \n1: Addition \n2: Subtraction \n3: Division \n4: Multiplication");
        Scanner input = new Scanner(System.in);

        if (input.nextInt() == 1) {
            Addition.addition();
        }
    }
}
