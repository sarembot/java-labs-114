package review;

public class Review {

    public enum Planet{
        EARTH(1),
        MARS(2),
        VENUS(3),
        MERCURY(4),
        SATURN(5),
        NEPTUNE(6),
        URANUS(7),
        JUPITER(8),
        PLUTO(9);

        int num;

        Planet(int num){
            this.num = num;
        }
        
    }

    Planet myPlanet = Planet.EARTH;
    public static void main(String[] args) {
        
        
        // 1. Keywords -- data types, new, conditionals, loops, return
        

        // 2. Identifiers
        // - Can't start with a digit
        // - Can use uppercase, lowercase, digits, underscore, dollarsign$, and printable Unicode
        // - Naming conventions:
        //      - Classes --> TitleCase
        //      - Variables, methods -- > camelCase
        //      - Constants --> UPPERCASE
        //      - Packages --> lowercase

        // 3. Literal values
        // - Integers
        //      123_456, 0x1234_ABCD, 123_456_789L (long)
        // - Characters
        //      'a', '\u12DE'
        // - Floating Point
        //      1.234 (double (default)), 1.234F (float)

        // 4. Types of Values
        // - Boolean: boolean
        // - Integer types: byte, short, int, long
        //     - enumerated: enum
        // - Character type: char 
        //     - String class
        // - Real number types: double, float
        // - Can have aggregates of these types by using Arrays []

        // 5. Operators
        // - Arithmetic: + - * / %
        // - Logic: && || !
        // - Shorthands: i+=1;
        // - Increment/Decrement operators

        //6. Loops

        // 7. Data Structures
        // - Scalar variables --> simplest data structures, only take one spot in memory
        // - eg. Primitive types, enumerations

        // - Reference types 
        // - eg. Arrays, String class

        // Scalar is just one box of memory, while a reference type is a box that is pointing to another location in memory

        // int j = 0;
        // int i = j++ + j * 5;
        // System.out.println("What is i? " + i);


        // int x =1;
        // int y = x++ +x;
        // System.out.println(y);

        // enum = enumerated (some sort of ordered listing of items within a collection)
        // in java, they are constants (cannot change)
        // examples: days of the weeks, months of the year, planets in the solar system

        String myName = "Billy Bob";

        String copyName = myName;
        System.out.println(copyName);

        myName = "something else";
        System.out.println(myName);

        // double sum = 0;
        // for (double d = 0; d < 10;  ) {
        //     d += 0.1;
        //     sum += sum + d;
        // }
        // System.out.println(sum);

        // int x =1;
        // int y= x++ +x;
        // System.out.println("y is "+ y);

        // for (int i = 1; i <= 100; i++){
        //     if (i % 5 == 0 && i % 3 == 0)
        //         System.out.println("FizzBuzz");
        //     else if (i % 5 == 0)
        //         System.out.println("Buzz");
        //     else if (i % 3 == 0)
        //         System.out.println("Fizz");
        //     else
        //         System.out.println(i);
        
        // }

        int x, y, z;
        x = 1; y = -1; z = 1;

        if (x > 0)
            if (y > 0)
                System.out.println("x > 0 and y > 0");
        else if (z > 0)
            System.out.println("x < 0 and z > 0");



}

public static void canILiveHere(Planet myPlanet){
    switch(myPlanet){
        case EARTH:
            System.out.println("You can live here.");
            System.out.println("This is planet #" + myPlanet.num);
            break;
        default:
            System.out.println("You can't live here");
            System.out.println("This is planet #" + myPlanet.num);
            break;
    }
}

        }
    

