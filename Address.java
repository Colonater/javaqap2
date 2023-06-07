//defines the address class
// four instacnes Street, City , State and zipcode and initializes them

public class Address {
    private String street;
    private String city;
    private String state;
    private String zipcode;
//address constructors
    public Address(String street, String city, String state, String zipcode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public Address(Address other) {
        this.street = other.street;
        this.city = other.city;
        this.state = other.state;
        this.zipcode = other.zipcode;
    }
//getter meathods and TO String
    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public String toString() {
        return street + ", " + city + ", " + state + " " + zipcode;
    }
}
