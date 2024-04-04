package SarembaMitchell_Lab7;

public class Person {
    public String id;
    public String firstName;
    public String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String id, String firstName, String lastName) {
        this(firstName, lastName);
        this.id = id;
    }

    public void sayHelloTo(String name) {
        System.out.println("Hello " + name + ", my name is " + this.firstName);
    }

    public void sayHelloTo(Person person) {
        sayHelloTo(person.firstName);
    }

    @Override
    public String toString() {
        return "Person:\n" + this.firstName + " " + this.lastName + "(" + this.id + ")";
    }
}
