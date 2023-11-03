import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class transactionUser {
    String filename = "registered_users";
    static userMode uM = new userMode();
    Scanner scan = new Scanner(System.in);

    // method for viewing account balance of the user
    public String viewAccount(String pin) {

        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;
            boolean found = false;

            while ((line = br.readLine()) != null) {
                if (line.equals(pin)) {
                    found = true;
                    break;
                }
            }

            if (found) {
                printUserInfo(br);
                printCardDetails(br);
                tMenu();
            } else {
                System.out.println("PIN not found in the file.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pin;
    }

    private static void printUserInfo(BufferedReader br) throws IOException {
        System.out.println("---User Information---");
        System.out.println("Last Name: " + br.readLine());
        System.out.println("First Name: " + br.readLine());
        System.out.println("Address: " + br.readLine());
        System.out.println("Country: " + br.readLine());
        System.out.println("Age: " + br.readLine());
        System.out.println("Gender: " + br.readLine());
    }

    private static void printCardDetails(BufferedReader br) throws IOException {
        System.out.println("\n--Card Details--");
        System.out.println("Account Name: " + br.readLine());
        System.out.println("Card Type: " + br.readLine());
        System.out.println("Bank: " + br.readLine());
        System.out.println("Card Exp. Date: " + br.readLine());

    }

    // method to view the account balance
    public String viewBalance(String pin) {

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            boolean found = false;

            while ((line = br.readLine()) != null) {
                if (line.equals(pin)) {
                    found = true;
                    break;
                }
            }

            if (found) {
                br.readLine();
                for (int i = 3; i <= 12; i++) {
                    line = br.readLine();
                    if (i == 12) {
                        printAccountBalance(line);
                    }
                }
            } else {
                System.out.println("PIN not found in the file.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return pin;
    }

    private static void printAccountBalance(String balance) {
        System.out.println("----Account Balance---");
        System.out.println("Balance: " + balance);
        tMenu();

    }

    // method to withdraw money
    public String WithdrawBal(String pin) {
        try {
            List<String> fileContents = new ArrayList<>();
            boolean found = false;

            try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
                String line;
                while ((line = br.readLine()) != null) {
                    fileContents.add(line);
                }
            }

            for (int i = 0; i < fileContents.size(); i++) {
                if (fileContents.get(i).equals(pin)) {
                    System.out.print("Enter Amount to Withdraw: ");
                    int withdrawalAmount = scan.nextInt();

                    int currentBalance = Integer.parseInt(fileContents.get(i + 11));
                    int newBalance = currentBalance - withdrawalAmount;
                    
                    if (currentBalance < withdrawalAmount){
                        found = false;
                        System.out.println("Insufficient Balance.");
                    } else {
                         found = true;
                         fileContents.set(i + 11, Integer.toString(newBalance));
                    }

                    break;
                }
            }

            if (found == true) {

                try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
                    for (String line : fileContents) {
                        bw.write(line);
                        bw.newLine();
                    }
                }
                System.out.println("Balance updated successfully.");

            } else if (found == false){
                 System.out.println("Unable to perform Transaction.");
            } else {
                System.out.println("System Error...");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        tMenu();
        scan.close();
        return pin;
    }

    // method to deposit money
    public String DepositBal(String pin) {
        try {
            List<String> fileContents = new ArrayList<>();
            boolean found = false;

            try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
                String line;
                while ((line = br.readLine()) != null) {
                    fileContents.add(line);
                }
            }

            for (int i = 0; i < fileContents.size(); i++) {
                if (fileContents.get(i).equals(pin)) {
                    found = true;
                    System.out.print("Enter Amount: ");
                    int withdrawalAmount = scan.nextInt();
                    int currentBalance = Integer.parseInt(fileContents.get(i + 11));
                    int newBalance = currentBalance + withdrawalAmount;
                    fileContents.set(i + 11, Integer.toString(newBalance));
                    break;
                }
            }

            if (found) {

                try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
                    for (String line : fileContents) {
                        bw.write(line);
                        bw.newLine();
                    }
                }
                System.out.println("Balance updated successfully.");
            } else {
                System.out.println("PIN not found in the file.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        tMenu();
        scan.close();
        return pin;
    }

    // menu options to navigate

    public static void tMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nOptions: ");
        System.out.println("[1] Back");
        System.out.print("\nInput: ");
        int input = scan.nextInt();

        while (true) {
            if (scan.hasNextLine()) {
                if (input == 1) {
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    uM.bankTransaction();
                    break;
                } else {
                    System.out.println("Invalid Input. Try again");
                    System.out.print("\nInput: ");
                    input = scan.nextInt();
                }
            }
        }

        scan.close();

    }

}
