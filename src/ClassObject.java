class Person {
    //Instance variables (data/state)
    String name;
    int age;

    //Subroutines/methodes
    void speak() {
        System.out.println("My name is " + name);
    }
    int retirement() {
        //years left to retirement
        int yearsLeft = 65 - age;
        return yearsLeft;
    }
    int getAge(){
        return  age;
    }

}

public class ClassObject {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Bob";
        p1.age = 30;
        p1.speak();
        System.out.println(p1.retirement());

        Person p2 = new Person();
        p2.name = "Dob";
        p2.age = 26;
        p2.speak();

    }
}
