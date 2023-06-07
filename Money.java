//money class dollars and cents

public class Money {
    private int dollars;
    private int cents;

    public Money(int dollars, int cents) {
        this.dollars = dollars;
        this.cents = cents;
    }

    public Money(Money other) {
        this.dollars = other.dollars;
        this.cents = other.cents;
    }
//money objects  getter and setters
    public int getDollars() {
        return dollars;
    }

    public int getCents() {
        return cents;
    }

    public void setDollars(int dollars) {
        this.dollars = dollars;
    }

    public void setCents(int cents) {
        this.cents = cents;
    }
//getter and sett access dollars and cents
    public Money add(Money other) {
        int newCents = (cents + other.cents) % 100;
        int carry = (cents + other.cents) / 100;
        int newDollars = dollars + other.dollars + carry;
        return new Money(newDollars, newCents);
    }
//even carrys over the cents dollar to dollar
    public Money subtract(Money other) {
        int newCents = (cents - other.cents + 100) % 100;
        int borrow = (cents - other.cents) < 0 ? 1 : 0;
        int newDollars = dollars - other.dollars - borrow;
        return new Money(newDollars, newCents);
    }
//compares money objects for equality

public int hashCode() {
    return dollars * 100 + cents;
}
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Money other = (Money) obj;
        return dollars == other.dollars && cents == other.cents;
    }

    public int compareTo(Money other) {
        if (dollars != other.dollars) {
            return dollars - other.dollars;
        } else {
            return cents - other.cents;
        }
    }

    public String toString() {
        return "$" + dollars + "." + (cents < 10 ? "0" + cents : cents);
    }
}
