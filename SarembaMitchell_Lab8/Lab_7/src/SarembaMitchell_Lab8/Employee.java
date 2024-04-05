package SarembaMitchell_Lab8;

import SarembaMitchell_Lab7.Person;
import java.util.Scanner;

public class Employee extends Person {
    
    Person person;
    int employeeId;
    String jobTitle;

    public Employee(String firstName, String lastName, int id, String jobTitle) {
        super(firstName, lastName);

        this.employeeId = id;
        this.jobTitle = jobTitle;
    }

    public void coffeeBreak(){
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Java Cafe!");
        System.out.print("Please enter your order.\n\n1 = Espresso\n2 = Cappuccino\n3 = Americano\n4 = Drip\n");
        
        if (input.hasNextInt()) {
            switch (input.nextInt()) {
                case 1:
                    System.out.println("Here's your espresso!");
                    break;
                case 2:
                    System.out.println("Here is your cappuccino. Enjoy!");
                    break;
                case 3:
                    System.out.println("Bon voyage! Enjoy your americano.");
                    break;
                case 4:
                    System.out.println("You chose drip? Interesting. I hope you enjoy.");
                    break;
                default:
                    System.out.println("I'm gonna have to ask you to leave.");
            }
        } else {
            System.out.println("Try again when you know what you want to order.");
        }

        System.out.println("Bye!");
    }

    @Override
    public String toString() {
        return person.toString() + "\nEmployee ID: " + this.employeeId + "\nJob Title: " + this.jobTitle;
    }
}
