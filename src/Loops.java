public class Loops {
    public static void main(String[] args){
        //while loops
        int value = 0;
        while(value < 10)
        {
            System.out.println("hi!" + value);
            value += 1;
        }

        //for loops
        //for(;;){  //infinite loop
        for(int i=0; i<5; i++){
            //System.out.println("I'm smol potat");
            System.out.printf("The value of i is: %d\n", i);
        }
    }


}
