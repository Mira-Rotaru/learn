import java.util.Scanner;

public class Switch {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please eneter a command:");
        String text = input.nextLine();

        switch(text){
            case "start":
                System.out.println("Running");
                break;
            case "stop":
                System.out.println("Stopped");
                break;
            default:
                System.out.println("Command not recognized");
        }
    }
}
