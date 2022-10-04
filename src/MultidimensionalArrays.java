public class MultidimensionalArrays {
    public static void main(String[] args){
        int[] values = {3,5,20}; //onedimensional
        System.out.println(values[2]);

        int[][] grid = {
                {3,5,20},
                {2,4},
                {3,3,3,3}
        };
        System.out.println(grid[1][1]);

        String[][] texts = new String[2][3];
        System.out.println(texts[0][1]);
        texts[0][1] = "sunny day";
        System.out.println(texts[0][1]);

        for(int row=0; row < grid.length; row++){
            for(int col=0; col < grid[row].length; col++){
                System.out.print(grid[row][col] + "\t");
            }
            System.out.println();
        }

        String[][] words = new String[2][];
        System.out.println(words[0]);
        words[0] = new String[3];
        words[0][1] = "something";
    }
}
