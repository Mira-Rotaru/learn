public class StringBuilderBufferFormatting {
    public static void main(String[] args){
        //in java strings are immutable

        //inefficient: we create a new string every time
        String info = "";
        info += "My name's Bob.";
        info += " ";
        info += "I'm a builder";
        System.out.println(info);

        //efficient - in memory: we append at the same string
        StringBuilder sb = new StringBuilder("");
        sb.append("My name's Sue.");
        sb.append(" ");
        sb.append("I'm also a builder");
        System.out.println(sb.toString());

        StringBuilder s = new StringBuilder();
        s.append("I'm Roger")
        .append(" ")
                .append("I just sleep");
        System.out.println(s.toString());

        //Advanced String Formatting
        System.out.print("Here is some text.\tThat was a tab.\nThat was a newline.");
        System.out.println(" More text");

        System.out.printf("Total cost %d; quantity %d\n", 5, 120);
        for(int i=0; i<20; i++){
            System.out.printf("%-2d: %s\n", i, "here is some text");
        }

        //Formatting floating point value
        System.out.printf("Total value: %.3f\n", 5.6);
        System.out.printf("Total value: %-6.1f\n", 324.37262);

    }
}
