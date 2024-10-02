import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = input.nextInt();

        int count = 0;

        do {
            if(num == 0){
                count = 1;
            } else {
                while(num>0){
                    num = num /10;
                    count++;
                }
            }
            System.out.println("number of digits: " + count);

            System.out.println("enter a number: ");
            num = input.nextInt();

            count = 0;
        } while(num>=0);
    }
}