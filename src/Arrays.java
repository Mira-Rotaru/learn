public class Arrays {
    public static void main(String[] args) {

        //TODO: Arrays of integers
        int value = 7; //value type

        int[] values;  //reference type
        values = new int[3]; //alocates enough memory for 3 integers

        System.out.println(values[0]);
        values[0] = 10;
        values[1] = 20;
        values[2] = 30;
//        System.out.println(values[0]);
//        System.out.println(values[1]);
//        System.out.println(values[2]);

        for(int i=0; i<values.length; i++)
            System.out.println(values[i]);

        int[] numbers = {5,6,7};
        for(int i=0; i<numbers.length; i++)
            System.out.println(numbers[i]);

        //TODO: Arrays of strings
        String[] words = new String[3];
        words[0] = "I";
        words[1] = "love";
        words[2] = "you";
        System.out.println(words[1]);

        String[] fruits = {"apple", "banana", "kiwi"};
//        for(int i=0; i<fruits.length; i++)
//            System.out.println(fruits[i]);

        for(String fruit: fruits){
            System.out.println(fruit);
        }
        int val = 0;
        String text = null;
        System.out.println(text);
        String[] texts = new String[2];
        System.out.println(texts[0]);
    }
}
