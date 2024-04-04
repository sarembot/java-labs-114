package Arrays;

import java.util.Arrays;

public class TwoDimArrs {
    public static void main(String[] args) {
        
        int [][] nums = new int[4][6];

        System.out.println(Arrays.toString(nums));

        int [][] integers = { {3, 5, 7}, {4, 7, 8}};

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 3; j++)
                System.out.print(integers[i][j] + " ");

        System.out.println("test");

    }
}