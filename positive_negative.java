import java.util.Scanner;

public class positive_negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num > 0)
            System.out.println("Output = Positive");
        else if (num < 0)
            System.out.println("Output = Negative");
        else
            System.out.println("Output = Zero");
    }
}
