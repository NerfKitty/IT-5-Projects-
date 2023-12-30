import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * mainFile
 */
public class mainFile {

    public static void main(String[] args) {

        ArrayList<String> attendees = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);

        System.out.println("---Student Attendance---");
        System.out.print("How many students you want to be listed: ");
        int num = scan.nextInt();
        scan.nextLine();

        // To add the names of the students in the ArrayList

        for (int i = 0; i < num; i++) {
            System.out.print("Enter Name: ");
            String name = scan.nextLine();
            attendees.add(name);
        }

        // sorted in alphabetical manner
        Collections.sort(attendees);

        // To print the list
        System.out.println("\n--List of Students--");
        for (int i = 0; i < attendees.size(); i++) {
            System.out.println((i + 1) + ". " + attendees.get(i));
        }

        scan.close();

    }
}
