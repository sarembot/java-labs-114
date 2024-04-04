package Loops;

import java.util.Scanner;

public class loops_exercises {
    public static void main(String[] args) {
        // Outer loop - runs 10 times
        for (int x = 1; x<= 10; x++) {
            // Inner loop - runs 10 times every time the outer loop runs
            for (int y = 1; y <= 10; y++){
                // System.out.printf("%4d", x*y);
            }
            // System.out.println();
        }

        // Method charAt - returns a char at index of String
        String fruit = "banana";
        char letter = fruit.charAt(0);

        // System.out.println(letter);

        for (char c = 'A'; c <= 'Z'; c++){
            // System.out.print(c + " ");
        }
        // System.out.println();

        // Can use UNICODE
        // System.out.print("Greek alphabet: ");
        for (int i = 913; i <= 937; i++) {
            // System.out.print((char) i);
        }
        // System.out.println();

        // exercise9("some text");
        // System.out.println(exercise10("abcd"));

        
        exercise12();
    }

    public static String exercise8(String stringy) {
        String newString = "";
        for(int i = 0; i < stringy.length(); i++){
            char letter = stringy.charAt(i);
            newString += letter + " ";
        }
        return newString;
    }

    public static void exercise9(String stringy) {
        for(int i = stringy.length() - 1; i >= 0; i--) {
            System.out.print(stringy.charAt(i));
        }
        System.out.println();
    }

    public static String exercise10(String stringy){
        String reverse = "";
        for(int i = stringy.length() - 1; i >= 0; i--) {
            reverse += stringy.charAt(i);
        }

        return reverse = stringy.equals(reverse) ? "Palindrome" : "Not Palindrome"; 
    }

    public static void exercise10b(String stringy) {
        for(int i = 0, j = stringy.length() - 1; i < j; i++, j--){
            if(stringy.charAt(i) == stringy.charAt(j))
                continue;   

            
        }
    }
    
    public static void exercise11(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();

        //first iteration print n once, then twice, three times
        //stop once n rows are printed

        for (int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
        
    }

    public static void exercise12(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();

        for (int i = 1; i <= n; i++){
            
            for(int k = 1; k <= n-i; k++)
                System.out.print(" ");

            for(int j = 1; j <= 2*i - 1; j++)
                System.out.print("*");

            System.out.println();
        }
        
    }
}
