
//creditcard class
// tree instances, owner of type Person, balance of type Money, and creditLimit of type Money.
public class CreditCard {
    private Person owner;
    private Money balance;
    private Money creditLimit;
    //constructor CreditCard takes a Person object (owner) and a Money object
    public CreditCard(Person owner, Money creditLimit) {
        this.owner = owner;
        this.creditLimit = new Money(creditLimit);
        this.balance = new Money(0, 0);
    }

    public Money getBalance() {
        return new Money(balance);
    }

    public Money getCreditLimit() {
        return new Money(creditLimit);
    }

    public String getPersonals() {
        return owner.toString();
    }
//charge method takes a Money object (amount) as a parameter.
// It checks if the sum of the current balance and the amount
// is less than or equal to the credit limit.
    public void charge(Money amount) {
        if (balance.add(amount).compareTo(creditLimit) <= 0) {
            balance = balance.add(amount);
            System.out.println("Charge: " + amount.toString());
        } else {
            System.out.println("Exceeds credit limit");
        }
    }
// It subtracts the amount from the balance and prints a message
    public void makePayment(Money amount) {
        balance = balance.subtract(amount);
        System.out.println("Payment: " + amount.toString());
    }
}
