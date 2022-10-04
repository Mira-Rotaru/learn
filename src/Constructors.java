import java.util.Optional;

class Machine{
    private String name = "Machine Type 1";
    private int code;
    public Machine(){
        this("Bonnie", 20); //apel constructor, trebuie sa fie pe prima linie
        System.out.println("Constructor running!");
        name = "Bonnie";

    }
    public Machine(String name){
        this(name, 16);
        System.out.println("Second constructor running!");
        this.name = name;
    }
    public Machine(String name, int code){
        System.out.println("Third constructor running!");
        this.name = name;
        this.code = code;
    }
    //code for Inheritance class
    public void start(){
        System.out.println("Machine started");
    }
    public void stop(){
        System.out.println("Machine stopped");
    }
}
class Car extends Machine{
    public void wipeWindShield(){
        System.out.println("Wiping windshield");
    }
    @Override
    public void start(){
        System.out.println("Car started");
    }
}

public class Constructors {
    public static void main(String[] args){
        Machine machine1 = new Machine();
        Machine machine2 = new Machine("Bertie");
        Machine machine3 = new Machine("Goldie", 32);
    }
}
