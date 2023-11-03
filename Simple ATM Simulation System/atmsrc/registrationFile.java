import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class registrationFile {
    Scanner scan = new Scanner(System.in);
    String lastName, firstName, u_age, u_gender, u_address, u_country, cardtype,bankname;
    Random rnd = new Random();
    int PIN = rnd.nextInt(999999), cardBalance = 0;

    LocalDate now = LocalDate.now();
    LocalDate expDate = now.plusYears(6);
   
      public void createFile() {

        try {
            FileWriter myFileWriter = new FileWriter("registered_users", true);

            System.out.println("---Register New Account---\n");

            // account (card) PIN
            myFileWriter.write(String.format("%06d", PIN)+"\n");

            System.out.print("Enter Last Name: ");
            lastName = scan.nextLine();
            myFileWriter.write(lastName+"\n");

            System.out.print("Enter First Name: ");
            firstName = scan.nextLine();
            myFileWriter.write(firstName+"\n");

            System.out.print("Enter Address: ");
            u_address = scan.nextLine();
            myFileWriter.write(u_address+"\n");

            System.out.print("Enter Country: ");
            u_country = scan.nextLine();
            myFileWriter.write(u_country+"\n");

            System.out.print("Enter Age: ");
            u_age = scan.nextLine();
            myFileWriter.write(u_age+"\n");

            System.out.print("Enter Gender: ");
            u_gender = scan.nextLine();
            myFileWriter.write(u_gender+"\n");

            System.out.println("\nData has been successfully added.\n");

            System.out.println("---Card Details---\n");

             //account name
            myFileWriter.write(lastName+"\n");

            System.out.print("Enter card type: ");
            cardtype = scan.nextLine();
            myFileWriter.write(cardtype+"\n");

            System.out.print("Enter Bank Name: ");
            bankname = scan.nextLine();
            myFileWriter.write(bankname+"\n");
            
            //card expiration date
            myFileWriter.write(expDate+"\n");

             //card balance
            myFileWriter.write(cardBalance+"\n");
            
            //new line at the end to add spacing 
            myFileWriter.write("\n");

            //show before exit
            userDetails();
            cardDetails();

            myFileWriter.close();

        } catch (IOException e) {
            System.out.println("An error occured while saving.");
        }
    }

    public void dataBaseFile() {
        System.out.print("Open File: ");
        String FileName = scan.nextLine();

        try {
             File myFile = new File(FileName);
             BufferedReader readFile = new BufferedReader(new FileReader(myFile));
             String data;

             System.out.println("\n---File Content---");

             while ((data = readFile.readLine()) != null) {
                System.out.println(data);
             }

             readFile.close();

        } catch (Exception e) {
            System.out.println("An error occured while reading the file.");
        }
        

    }


    public void userDetails(){
        System.out.println("\n---User Details---");
        System.out.println("Name: "+lastName+", "+firstName);
        System.out.println("Address: "+u_address);
        System.out.println("Country: "+u_country);
        System.out.println("Age: "+u_age);
        System.out.println("Gender: "+u_gender);

    }

    private void cardDetails(){
        System.out.println("\n---Card Details---");
        System.out.println("Applied Card Type: "+cardtype);
        System.out.println("Bank Name: "+bankname);
        System.out.println("Account Name: "+lastName);
        System.out.println("Account PIN: "+ PIN);
        System.out.println("Card Exp. Date: "+expDate);
        System.out.println();
    }

}
