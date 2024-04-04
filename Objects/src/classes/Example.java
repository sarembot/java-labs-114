package classes;

public class Example {
    public static void main(String[] args) {
        int[] nums = { 4, 17, 2 };

        System.out.println("Max of numbers is: " + maximum(nums));
    }

    static int maximum(int[] list) {
        int max = list[0];
        for (int i = 0; i < list.length; i++) {
            if (list[i] > max)
                max = list[i];
        }
        return max;
    }
}
