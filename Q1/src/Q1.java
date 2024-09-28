import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text;
        do {
            System.out.println("Enter an odd length word: ");
            text = input.next();
            if (text.length() % 2 == 0) {
                System.out.println("Please enter an odd length word!");
            }
        }while (text.length() % 2 == 0);
        System.out.println("The middle character of the given word is: " + text.charAt(text.length() / 2));
    }
}

  