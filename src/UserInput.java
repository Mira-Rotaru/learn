import java.util.Scanner;

public class UserInput {
    public static void main (String[] args){

        //Create scanner object
        Scanner input = new Scanner(System.in);

        //Output prompt
        System.out.println("Enter your name: ");

        //Wait for user input
        String name = input.nextLine();

        System.out.println("Enter your age: ");
        int age = input.nextInt();
        System.out.println("Enter your height: ");
        double height = input.nextDouble();

        //entered input
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);

    }
}
