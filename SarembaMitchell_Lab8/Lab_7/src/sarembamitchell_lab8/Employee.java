package sarembamitchell_lab8;

import java.util.Scanner;
import sarembamitchell_lab7.Person;
/**
 * This class is designed to represent Employees in the shire.
 */
public class Employee extends Person {
    /**
     * Indicates the company the employees work for.
     */
    public static String company = "Shire Inc.";
    /**
     * Indicates the ID to apply to each new employee
     */
    public static int idCounter = 100;
    /**
     * Indicates the position that an employee holds in the company
     */
    public String jobTitle;

    /**
     * Constructor used to create new Employees
     * @param firstName indicates the employees first name
     * @param lastName indicates the employees last name
     * @param jobTitle indicates the employees position at the company
     */
    public Employee(String firstName, String lastName, String jobTitle) {
        super(Integer.toString(idCounter++), firstName, lastName);

        this.jobTitle = jobTitle;
    }

    /**
     * Allows employees to take a coffee break at 
     */
    public void coffeeBreak(){
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Sam!");
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
        return Employee.company + "\n" + super.toString() +  "\n" + this.jobTitle;
    }
}
