import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number");
        int first = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number");
        int second = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the third number");
        int third = Integer.parseInt(scanner.nextLine());

        System.out.println("The sum is " + (first + second + third));
        System.out.println("The product is " + (first * second * third));
        // We use 3.0 because it gives us a decimal result.
        System.out.println("The average is " + ((first + second + third) / 3.0));    }

}
