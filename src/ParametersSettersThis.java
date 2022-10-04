class Robot{
    public void speak(String text){
    System.out.println(text);
    }
    public void jump(int height){
        System.out.println("Jumping:" + height);
    }
    public void move(String direction, double distance){
        System.out.println("Moving " + distance + " metres in direction " + direction);
    }
}

class Frog{
    private String name;
    private int age;
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setInfo(String name, int age){
        setName(name);
        setAge(age);
    }
}

public class ParametersSettersThis {
    public static void main(String[] args){

        //Method Parameters
        Robot sam = new Robot();
        sam.speak("Hi, I'm Sam");
        sam.jump(7);
        sam.move("West", 12.2);
        String begruss  = "Guten Morgen!";
        sam.speak(begruss);
        int value = 14; //value
        sam.jump(value); //reference

        //Setters
        Frog f1 = new Frog();
        //f1.name = "Bertie"; //atributele private devin inaccesibile
        //f1.age = 1;
        System.out.println(f1.getName());
        System.out.println(f1.getAge());
        f1.setName("Burt");
        f1.setAge(2);
        System.out.println(f1.getName());
        System.out.println(f1.getAge());
    }
}
