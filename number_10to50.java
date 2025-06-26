import java.util.Scanner;
// Q1: Print numbers from 10 to 50
public class number_10to50 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Numbers from 10 to 50:");
        for (int i =number; i <= 50; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
