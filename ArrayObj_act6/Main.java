import java.util.Scanner;

public class Main {
    static String product_name;
    static  int price, quantity;
    static double total;

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.print("How many products are you going to buy: ");
        int pieces = scan.nextInt();
        scan.nextLine();

        Groceries groceries[] = new Groceries[pieces];

        for (int i = 0; i < groceries.length; i++){
            
            System.out.println("\nPurchase No."+(i+1));

            System.out.print("Enter product name: ");
            product_name = scan.nextLine();
          
            System.out.print("Enter price: ");
            price = scan.nextInt();

            System.out.print("Enter quantity: ");
            quantity = scan.nextInt();
            scan.nextLine();

            groceries[i] = new Groceries(product_name, price, quantity);
            groceries[i].setProduct_name(product_name);
            groceries[i].transaction(price, quantity); //
            total += groceries[i].amount(price, quantity);
          
        }

        System.out.println("\n---Review Product Purchased---");
        
        for (int i = 0; i < groceries.length; i++){
            System.out.println("\nPurchase No."+(i+1));
            groceries[i].info();
        }

        System.out.printf("\nTotal Amount: Php "+" %.2f",total);
        System.out.println();

        //printing the products being purchased using for-each loop
        System.out.println("\n--Products--");
        for (Groceries g : groceries){
              System.out.println(g.getProduct_name());
        }

        //printing the products beign purchased using for-loop
        // for (int i =0; i < groceries.length; i++){
        //      System.out.println(groceries[i].getProduct_name());
        // }

        scan.close();

    }
}