package Interfaces;

public class App {
    public static void main(String[] args){
        Machine machine1 = new Machine();
        machine1.start();

        Person person1 = new Person("Don");
        person1.greet();

        Info info1 = new Machine(); //allowed to use Info because Machine implements Info
        info1.showInfo();

        Info info2 = new Person("Dan");
        info2.showInfo();

        outputinfo(machine1);
        outputinfo(person1);
    }
    private static void outputinfo(Info info){
        info.showInfo();
    }
}

