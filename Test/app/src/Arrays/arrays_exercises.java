package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class arrays_exercises {
    public static void main(String[] args) {
        
        exerciseFive();
    }

    public static void exerciseOne() {
        System.out.println("Enter some integers. When done, enter -1.");
        System.out.println();

        Scanner in = new Scanner(System.in);
        System.out.print("How many numbers do you want to enter? ");
        int n = in.nextInt();
        
        int num;
        int [] nums = new int[n];
        int count = 0;
        do {
            System.out.print("Enter an integer: ");
            num = in.nextInt();

            for(int i = 0; i <= count; i++){
                nums[count] = num;
            }   
            
            count++;

            if (count==n)
                break;

        } while (num > 0);

        System.out.println(Arrays.toString(nums));

    }

    public static void exerciseTwo(){
        int nums [] = {5, 56, -2, 8, 12};

        double sum = 0f;
        int product = 1;

        for (int num : nums) {
            sum += num;
            product *= num;
    }

        double average = sum / nums.length - 1;

        System.out.println("sum = " + sum + " product = " + product + " average = " + average);
    }

    public static void exerciseThree(){
        int nums[] = { 1, 1, 1, 2, 3, 4, 4};

        int oneCount = 0;
        int twoCount = 0;
        int threeCount = 0;
        int fourCount = 0;

        for (int num : nums) {
          if (num == 1) {
            oneCount++;
          } else if (num ==2) {
            twoCount++;
          } else if (num == 3){
            threeCount++;
          } else if (num ==4) {
            fourCount++;
          }

        }

        System.out.println(oneCount);
        System.out.println(twoCount);
        System.out.println(threeCount);
        System.out.println(fourCount);
    }

    public static void exerciseFour(){
        int nums[] = {3,2,1,5,4, 6, 7,8,9,53,65,-3};
        int max = 0;
        int min = 1;


        for (int num : nums) {
            max = (num > max) ? num : max;
            min = (num < min) ? num : min;
        }

        System.out.println("max = " + max +", min = " + min);
    }

    public static void exerciseFive(){
        int nums[] = {1, 2, 4, 5, 7, 9, -2, 3};

        int newNums[] = new int[nums.length];

        for (int num : nums) {
            if (num % 2 != 0) {
                for (int i : newNums){
                    newNums[i] = nums[num];
                    newNums[0] = num;
                };
            }
        }

        System.out.println(Arrays.toString(newNums));
    }
}
