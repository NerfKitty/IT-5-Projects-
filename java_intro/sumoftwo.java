import java.util.Scanner;

/**
 * sumoftwo
 * 1. Write a java program that will compute for the sum of two integers and
 * returns a value of true if the sum is even number.
 */
public class sumoftwo {

    public static void main(String[] args) {
        int a, b;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input 1: ");
        a = scan.nextInt();
        System.out.print("Input 2: ");
        b = scan.nextInt();
        System.out.print("Sum: ");
        System.out.println(totalsum(a, b));
        System.out.println(istrue(totalsum(a, b)));
       
        scan.close();

    }

    static int totalsum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    static boolean istrue(int sum) {
        if (sum % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}