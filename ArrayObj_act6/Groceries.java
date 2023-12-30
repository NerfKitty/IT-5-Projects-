public class Groceries {

  private String product_name;
  private int price, quantity;

  Groceries (String product_name, int price, int quantity){
    // this.setProduct_name(product_name);
    this.setProduct_name(product_name);
    this.price = price;
    this.quantity = quantity;
  }


//retrieving product names using getters and setters
public String getProduct_name() {
    return product_name;
}

public void setProduct_name(String product_name) {
    this.product_name = product_name;
}


double transaction (int price, int quantity){
    double subtotal = price * quantity;
    System.out.printf("Subtotal: Php "+" %.2f",subtotal);
    System.out.println();
    return subtotal;
  }

int amount (int price, int quantity){
    int total = price * quantity;
    return total;
  }


  void info(){
    System.out.println("Product Name: "+ getProduct_name());
    System.out.println("Price: "+price);
    System.out.println("Quantity: "+quantity);
  }

}
