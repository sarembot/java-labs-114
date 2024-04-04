package Lab6Task1;
import java.util.Scanner;
import java.util.Arrays;

public class Lab6Task1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(makeArray(getNumOfElements())));
    }

    public static int getNumOfElements() {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers do you want to enter? ");

        return input.nextInt();
    }

    public static int[] makeArray(int numOfElements) {
        Scanner input = new Scanner(System.in);
        int[] elements = new int[numOfElements];

        for (int i = 0; i < numOfElements; i++) {
            System.out.print("Enter a number: ");
            int num = input.nextInt();
            if (i > 0)
                elements[i] = num * elements[i - 1];
            else
                elements[i] = num;
        } 

        return elements;
    }
}
