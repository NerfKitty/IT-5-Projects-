import java.util.Scanner;

enum tempLevel {
    LOW,
    NORMAL,
    HIGH;
}

public class mainfile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter temperature in °C: ");
        int temp = scan.nextInt();

        if (temp <= 0 || temp <= 15) {
            tempLevel low = tempLevel.LOW;
            System.out.println(low + " TEMPERATURE");
        }

        if (temp >= 20 && temp <= 45) {
            tempLevel normal = tempLevel.NORMAL;
            System.out.println(normal + " TEMPERATURE");
        }

        if (temp > 45 || temp >= 100) {
        tempLevel high = tempLevel.HIGH;
        System.out.println(high+" TEMPERATURE");
        }

        scan.close();

    }
}