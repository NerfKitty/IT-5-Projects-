package oop1;

import javax.swing.JOptionPane;

public class carspecs {


    public int cars(int input) {


        String[][] carSpecs = { 
                { "Mazda CX-5", "Red", "1,712kg", "Manual" },
                { "BMW iX", "Blue", "1,802kg", "Manual" },
                { "Toyota Fortuner", "Ash Gray", "1,752kg", "Automatic" },
                { "Nissan X-Trail", "Black", "1,752kg", "Manual" },
                { "Ford Mustang", "Red", "1,752kg", "CVT" }
        };

        int info = JOptionPane.showConfirmDialog(null, 
                "Car Model: " + carSpecs[input - 1][0] +"\n"+
                "Color: " + carSpecs[input - 1][1]+"\n"+
                "Weight: " + carSpecs[input - 1][2] +"\n"+
                "Transmission: " + carSpecs[input - 1][3], "Car Information", JOptionPane.DEFAULT_OPTION);

                if (info == 0){
                    System.exit(info);
                }

        return info;

    }
}

