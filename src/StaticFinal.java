class Thing{
    public final static int LUCKY_NUMBER = 7; //I created a constant variable; you can't reassign it
    public String name;
    public static String description;
    public static int count = 0;
    public int id;
    public Thing(){
        id = count;
        count++;
    }
    public void showName(){
        System.out.println("Id:" + id + " Name:" + name); //instant methods can output static Variables
    }
    public static void showInfo(){
        System.out.println(description); //static methods can't ouput instant Variables, like name
    }
}
public class StaticFinal {
    public static void main(String[] args){
        Thing.description = "I am a thing";
        System.out.println(Thing.description);

        Thing.showInfo();
        System.out.println("Before object creation count is: " + Thing.count);

        Thing t1 = new Thing();
        Thing t2 = new Thing();

        t1.name = "Pen";
        t2.name = "Pineapple";

        System.out.println(t1.name);
        System.out.println(t2.name);

        t1.showName();
        t2.showName();

        System.out.println(Math.PI); //PI is a static Variable

        System.out.println(Thing.LUCKY_NUMBER);

        System.out.println("After object creation count is: " + Thing.count);
    }
}
