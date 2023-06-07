//Person class

public class Person {
    private String firstName;
    private String lastName;
    private Address address;

    public Person(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }
    public Person(Person other) {
        this.firstName = other.firstName;
        this.lastName = other.lastName;
        this.address = new Address(other.address);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getAddress() {
        return new Address(address);
    }

    public String toString() {
        return firstName + " " + lastName + ", " + address.toString();
    }

}