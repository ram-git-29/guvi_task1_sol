import java.util.Scanner;

public class discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter purchase amount: ");
        double amount = sc.nextDouble();
        double discount = 0;

        if (amount >= 500 && amount <= 1000) {
            discount = 0.10 * amount;
        } else if (amount > 1000) {
            discount = 0.20 * amount;
        }
        double finalAmount = amount - discount;
        System.out.println("Discount applied: " + discount);
        System.out.println("Final payable amount: " + finalAmount);
            }
}
