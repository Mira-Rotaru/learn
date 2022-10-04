class Dog {
    private int id;
    private String name;
    public Dog(int id, String name){
        this.id = id;
        this.name = name;
    }
    public String toString(){
        //return id + ":" + name; //too many string objects, by each + there's a new string created
        //TODO Method 1
        StringBuilder sb = new StringBuilder();
        sb.append(id).append(":").append(name);
        return sb.toString();
        //TODO Method 2
        //return String.format("%d: %s", id, name);
    }
}
public class toString {
    public static void main(String[] args){
        Object obj = new Object();
        Dog d1 = new Dog(7, "Mapple");
        Dog d2 = new Dog(2, "Bon-Bon");
        System.out.println(d1); //invokes the toString method
        System.out.println(d2);
    }
}
