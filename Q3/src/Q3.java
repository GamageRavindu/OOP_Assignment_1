import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length in centimeters: ");
        int cm = input.nextInt();

        double inches = cm / 2.54;
        double feet = inches / 12;

        System.out.println("The length in inches: " + inches + " in");
        System.out.println("The length in rounded inches: " + Math.round(inches * 100.0) / 100.0 + " in");
        System.out.println("The length in feet: " + feet + " ft");
        System.out.println("The length in rounded feet: " + Math.round(feet * 100.0) / 100.0 + " ft");
    }
}