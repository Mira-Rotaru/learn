import java.util.Scanner;

public class DoWhileInput {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        /*
        System.out.println("Enter a number: ");
        int value = input.nextInt();

        while(value != 5){
            System.out.println("Enter a number: ");
            value = input.nextInt();
        }
        System.out.println("Got 5!");
         */

        int value;
        do {
            System.out.println("Enter a number:");
            value = input.nextInt();

        } while(value != 5);
        System.out.println("Got 5!");
    }
}
