import java.util.Scanner;
class Factorial {
    public static void main(String[] args) {
        int input = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a positive number");

        input = scan.nextInt();

        int result = 1;
        for (int i = input; i > 0; i--) {
            result = i * result;

        }
        System.out.println("The factorial of " + input + " is: " + result);


    }
}