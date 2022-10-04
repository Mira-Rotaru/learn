public class Inheritance {
    public static void main(String[] args){
        Machine m = new Machine();
        m.start();
        m.stop();

        Car car = new Car();
        car.start();
        car.wipeWindShield();
        car.stop();
    }
}
