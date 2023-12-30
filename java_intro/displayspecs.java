
// Write a java program that will accept user input frm 1 to 5 and display specifications of equivalent  
// vehicle (Color, Weight, and Transmission)

import java.util.Scanner;

public class displayspecs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input;

        System.out.print("User input: ");
        input = scan.nextInt();

        while (true) {
            if (input < 1 || input > 5) {
                System.out.println("Invalid input. Try again.");
                 System.out.print("User input: ");
                 input = scan.nextInt();
            } else {
               cars(input);
               break;
            }
        }

       

        scan.close();

    }

    static int cars(int input) {

        String[][] carSpecs = { { "Mazda CX-5", "Red", "1,712kg", "Manual" },
                { "BMW iX", "Blue", "1,802kg", "Manual" },
                { "Toyota Fortuner", "Ash Gray", "1,752kg", "Automatic" },
                { "Nissan X-Trail", "Black", "1,752kg", "Manual" },
                { "Ford Mustang", "Red", "1,752kg", "CVT" }
        };

        System.out.println("Car Model: " + carSpecs[input - 1][0]);
        System.out.println("Color: " + carSpecs[input - 1][1]);
        System.out.println("Weight: " + carSpecs[input - 1][2]);
        System.out.println("Transmission: " + carSpecs[input - 1][3]);

        return input;

    }
}
