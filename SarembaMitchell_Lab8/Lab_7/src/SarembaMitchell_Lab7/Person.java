package SarembaMitchell_Lab7;

public class Person {
    /**
     * Unique identifier for every Person that is instantiated.
     */
    public final String ID;
    /**
     * Indicates the first name of a Person.
     */
    public String firstName;

    /**
     * Indicates the last name of a Person.
     */
    public String lastName;

    /**
     * This constructor creates a person object with a first name equal to the parameter firstName, a last name equal to the parameter lastName, and an ID equal to the first name and last name added together.
     * @param firstName indicates the first name of a person.
     * @param lastName indicates the last name of a person.
     */
    public Person(String firstName, String lastName) {
        this(firstName + " " + lastName, firstName, lastName);
    }

    /**
     * This constructor creates a person object that allows for a custom ID.
     * @param id indicates the unique identifier for a person.
     * @param firstName indicates the first name of a person.
     * @param lastName indicates the last name of a person.
     */
    public Person(String id, String firstName, String lastName) {
        this.ID = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * This method allows a Person to greet somebody. 
     * @param name Indicates the name that the Person should greet.
     */
    public void sayHelloTo(String name) {
        System.out.println("Hello " + name + ", my name is " + this.firstName + ".");
    }

    /**
     * This method allows a Person to greet another Person. It takes a parameter Person and accesses the firstName of that Person.
     * @param person Indicates some Person that will be greeted.
     */
    public void sayHelloTo(Person person) {
        sayHelloTo(person.firstName);
    }

    @Override
    public String toString() {
        return "Person:\n" + this.firstName + " " + this.lastName + "\n(" + this.ID + ")";
    }
}
