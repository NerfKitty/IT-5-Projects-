package oop_act1;

public class carspec {


    public int cars(int input) {


        String[][] carSpecs = { 
                { "Mazda CX-5", "Red", "1,712kg", "Manual" },
                { "BMW iX", "Blue", "1,802kg", "Manual" },
                { "Toyota Fortuner", "Ash Gray", "1,752kg", "Automatic" },
                { "Nissan X-Trail", "Black", "1,752kg", "Manual" },
                { "Ford Mustang", "Red", "1,752kg", "CVT" }
        };
        
        System.out.println();
        System.out.println("-----Car Model Specifications-------");
        System.out.println("Car Model: " + carSpecs[input - 1][0]);
        System.out.println("Color: " + carSpecs[input - 1][1]);
        System.out.println("Weight: " + carSpecs[input - 1][2]);
        System.out.println("Transmission: " + carSpecs[input - 1][3]);

        return input;

    }
}

