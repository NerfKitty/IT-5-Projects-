package oop1;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class cardisplay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        JFrame jf;
        carspecs cs = new carspecs();
        jf = new JFrame();

        int input = Integer.parseInt(JOptionPane.showInputDialog(jf, "Enter User Input  (1 to 5)"));
        
        try {

            while (true) {
                  if (input < 1 || input > 5) {
                        input = Integer.parseInt(
                                JOptionPane.showInputDialog(jf, "Input out of Range...\nEnter User Input  (1 to 5)"));
                    } else {
                        cs.cars(input);
                        break;
                    }
            }
        } catch (NumberFormatException e) {
              
        }

        scan.close();

    }
}
