public class Application {
    public static void main(String[] args){
        int myInt = 7;
        String text = "Hello"; //String nu e un tip, ci o clasa
        String blank = " ";
        String name = "Bunny";
        String greeting = text + blank + name;
        System.out.println(text);
        System.out.println(greeting);
        System.out.println("Hello" + " " + "Bucs");
        System.out.println("My integer is: " + myInt);

        double myDouble = 7.8;
        System.out.println("My number is: " + myDouble + '.');
    }
}
