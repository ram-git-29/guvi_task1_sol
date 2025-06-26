import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        System.out.print("Enter a number to reverse: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int reverse = 0;
        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }
        System.out.println("Reversed Number: " + reverse);
            }
}
