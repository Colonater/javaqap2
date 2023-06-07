public class TestCreditCard {
    public static void main(String[] args) {
        final Money LIMIT = new Money(1000, 0);
        final Money FIRST_AMOUNT = new Money(225, 0);
        final Money SECOND_AMOUNT = new Money(17, 0);
        final Money THIRD_AMOUNT = new Money(26, 0);
        final Money FOURTH_AMOUNT = new Money(450, 0);

        Person owner = new Person("Cole", "Hickey", new Address("123 Peter St", "Seattle", "WA", "98121"));
        CreditCard visa = new CreditCard(owner, LIMIT);

        System.out.println(visa.getPersonals());
        System.out.println("Balance: " + visa.getBalance());
        System.out.println("Credit Limit: " + visa.getCreditLimit());
        System.out.println();

        System.out.println("Attempt to charge " + FIRST_AMOUNT);
        visa.charge(FIRST_AMOUNT);
        System.out.println("Balance: " + visa.getBalance());

        System.out.println("Attempt to charge " + SECOND_AMOUNT);
        visa.charge(SECOND_AMOUNT);
        System.out.println("Balance: " + visa.getBalance());

        System.out.println("Attempt to make payment of " + THIRD_AMOUNT);
        visa.makePayment(THIRD_AMOUNT);
        System.out.println("Balance: " + visa.getBalance());

        System.out.println("Attempt to charge " + FOURTH_AMOUNT);
        visa.charge(FOURTH_AMOUNT);
        System.out.println("Balance: " + visa.getBalance());
    }
}