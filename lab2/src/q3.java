import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter number of rows: ");
        int num_of_rows = input.nextInt();

        char astrx = '*';

        for(int i = 1; i <= num_of_rows; i++){

            for(int j = 1; j <= (num_of_rows-i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(astrx + " ");
            }
            System.out.println();
        }

    }
}
//
//--*
//-* *
//* * *