package SarembaMitchell_Lab8;

import SarembaMitchell_Lab7.Person;

public class TestingObjects {
    public static void main(String[] args) {
        Employee bob = new Employee("Bob", "Saget", 001, "Janitor");

        System.out.println(bob.id);
        bob.coffeeBreak();
    }
}

