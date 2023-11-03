
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class userMode {
    Scanner scan = new Scanner(System.in);
    String pin = "";
    int attempt = 3, input;
    boolean wrongPIN;

    ///object
    transactionUser tu = new transactionUser();

    public void bankTransaction() {

        System.out.println("---Banking System---\n");
        System.out.println("Options: \n");
        System.out.println("[1] Make Transaction");
        System.out.println("[2] Back");
        System.out.println();
        System.out.print("Input: ");
        input = scan.nextInt();

        do {
            if (input == 1) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                transactionMenu();
                break;

            }  else if (input == 2) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                mainClass.main(null);
                break;
            } else {
                System.out.println("\nInvalid Input. Please try again.");
                System.out.print("Input: ");
                input = scan.nextInt();
            }

        } while (true);
        scan.close();

    }

    public void transactionMenu() {

        System.out.println("---Make Transaction---");
        System.out.print("Enter PIN: ");
        pin = scan.next();

        String str = "";

        try {

            FileInputStream fin = new FileInputStream("F:\\VS CODE\\Simple ATM Simulation System\\registered_users");
            Scanner br = new Scanner(fin);

            while (br.hasNextLine()) {
                str = br.nextLine();

                if (str.startsWith(pin)) {
                    wrongPIN = false;
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    transacDashboard(pin);
                    break;
                } else {
                    wrongPIN = true;
                }
            }

            while (wrongPIN == true) {
                attempt -= 1;
                if (attempt <= 3) {
                    System.out.println("Wrong PIN. You have " + attempt + " attempt(s)");
                    System.out.print("Enter PIN: ");
                    pin = scan.next();

                    if (attempt == 1){
                        System.out.println("Your account is temporarily blocked. Please try again for ** hours.");
                        break;
                    }

                } 
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error...");
            e.printStackTrace();
        }

        scan.close();

    }

    public String transacDashboard(String pin){
        System.out.println("---Welcome Back!---\n");
        System.out.println("Options: \n");
        System.out.println("[1] View Balance");
        System.out.println("[2] Withdraw");
        System.out.println("[3] Deposit");
        System.out.println("[4] View Account Details");
        System.out.println("[5] Back\n");
        System.out.print("Input: ");
        input = scan.nextInt();

          do {
            if (input == 1) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                tu.viewBalance(pin);
                break;

            }  else if (input == 2) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                tu.WithdrawBal(pin);
                break;
            }
            else if (input == 3) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                tu.DepositBal(pin);
                break;
            }
            else if (input == 4) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                tu.viewAccount(pin);
                break;
            }else if (input == 5) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                bankTransaction();
                break;
            } else {
                System.out.println("\nInvalid Input. Please try again.");
                System.out.print("Input: ");
                input = scan.nextInt();
            }

        } while (true);


        return pin;
    }



}
