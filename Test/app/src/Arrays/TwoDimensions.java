package Arrays;

import java.util.Arrays;

public class TwoDimensions {
    public static void main(String[] args) {
        int [][] integers = {{4,5,6}, {7,9,8}};
        
        // print rows of array
        for(int i = 0; i < integers.length; i++){
            System.out.print("Row " + (i + 1) + ": "); 
            for (int j= 0; j < integers[i].length; j++)
                System.out.print(integers[i][j] + " ");

            System.out.println();
        }

        System.out.println();
        
        // print columns
        for(int i = 0; i < 3; i ++){
            System.out.print("Column " + (i + 1) + ": ");
            for (int j = 0 ; j < 2; j++)
                System.out.print(integers[j][i] + " ");

            System.out.println();        
        }

        System.out.println();

        //use deepToString() on multi dimensional arrays
        System.out.println(Arrays.deepToString(integers));

        
        int x = 2;
        int count = 1;
        
        System.out.println(++count * x);
        System.out.println(count++ * x);
        }
    }

