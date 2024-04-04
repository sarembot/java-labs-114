package Arrays;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        // don't have to specify size, because the size is not fixed
        // can store objects (String, Integer, Boolean, Double, etc;)
        // cannot store primitive types 

        // use wrapper class to specify data type
        ArrayList<Integer> integers = new ArrayList<>();

        ArrayList<String> fruits = new ArrayList<>();

        ArrayList<Double> doubles = new ArrayList<>();

        //can use add() method to add elements to ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("orange"); //adds elements to end of arraylist

        // to add at the front of list, use add(index, "item")
        fruits.add(0, "Strawberry");

        System.out.println(fruits);

        // to access an item, use the get() method
        System.out.println(fruits.get(1));

        // to change an item, use the set() method
        fruits.set(2, "Blueberry");
        System.out.println(fruits);

        // to remove an item, use the remove() method

        //by index:
        fruits.remove(2);
        System.out.println(fruits);

        //by value:
        fruits.remove("apple");
        System.out.println(fruits);

        //remove all elements with the clear() method
        fruits.clear();
        System.out.println(fruits);
    }
    
}
