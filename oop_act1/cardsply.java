package oop_act1;

import java.util.Scanner;

public class cardsply {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        carspec cs = new carspec();

        System.out.print("Enter User Input (1-5): ");
        int input = scan.nextInt();


            while (true) {
                  if (input < 1 || input > 5) {
                      System.out.println("Input out of range. Please try again...");
                        System.out.print("Enter User Input (1-5): ");
                        input = scan.nextInt();
                    } else {
                        cs.cars(input);
                        break;
                    }

            }


        scan.close();

    }
}
