import java.util.Scanner;

public class adminMode {
    Scanner scan = new Scanner(System.in);
    int input;
    
    registrationFile rf = new registrationFile();
    

    public void adminMenu() {
        System.out.println("----Admin Menu Dashboard----\n");
        System.out.println("Options:");
        System.out.println();
        System.out.println("[1] Register New Account ");
        System.out.println("[2] View Database ");
        System.out.println("[3] Back");
        System.out.println();
        System.out.print("Input: ");
        input = scan.nextInt();
        scan.nextLine();

        do {
            if (input == 1) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                rf.createFile();
                break;

            } else if (input == 2) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                rf.dataBaseFile();
                break;
            } else if (input == 3) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                mainClass.main(null);
                break;
            }

            else {
                System.out.println("\nInvalid Input. Please try again.");
                System.out.print("Input: ");
                input = scan.nextInt();
            }

        } while (true);
    }

  
 

}
