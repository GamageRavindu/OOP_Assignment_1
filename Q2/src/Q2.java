import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter your first name, middle name and the last name: ");
        String fullName = input.nextLine();

        String[] nameParts = fullName.trim().split("\\s+");

        if ( nameParts.length  < 2 ){
            System.out.println("Please enter at least first name and the last name!");
        } else {
            String firstName = nameParts[0].substring(0,1).toUpperCase() + nameParts[0].substring(1).toLowerCase();
            String middleName = "";
            String lastName = nameParts[nameParts.length -1];
            lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

            if (nameParts.length > 2){
                middleName = nameParts[1].substring(0,1).toUpperCase();
            }

            System.out.println("Your Name: " + lastName + ", " + firstName + " " +  middleName + ". " );
        }
        }
}