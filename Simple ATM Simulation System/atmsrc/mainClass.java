import java.util.Scanner;

/**
 * mainFunction
 */

public class mainClass {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input;

        adminMode am = new adminMode();
        userMode um = new userMode();

        System.out.println("---Enter the appropriate input---\n");
        System.out.println("Options:");
        System.out.println();
        System.out.println("[1] Admin Mode");
        System.out.println("[2] User Mode");
        System.out.println("[3] Exit");
        System.out.println();
        System.out.print("Input: ");
        input = scan.nextInt();

        do {
            if (input == 1) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                am.adminMenu();
                break;

            } else if (input == 2) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                um.bankTransaction();
                break;
            } else if (input == 3){
                System.exit(0);
            }
            else {
                System.out.println("\nInvalid Input. Please try again.");
                System.out.print("Input: ");
                input = scan.nextInt();
            }

        } while (true);

        scan.close();
    }
}