package Strategy;

public class SplitPaymentEqually implements PaymentStrategy{

    private static final double DEFAULT_GRATUITY_PERCENTAGE = .20;

    @Override
    public void pay(double amountDue, int numberOfPeople) {
        double pricePerPerson = amountDue / numberOfPeople;
        double addedGratuity = addGratuity(amountDue, numberOfPeople);
        System.out.printf("Default Gratuity Per Person: $%.2f%n", addedGratuity);
        System.out.printf("Total Due Per Person: $%.2f", addedGratuity + pricePerPerson);
    }

    @Override
    public double addGratuity(double amountDue, int numberOfPeople) {
        if(numberOfPeople >= 10) {
            return (amountDue * DEFAULT_GRATUITY_PERCENTAGE) / numberOfPeople;
        }

        return 0;
    }
}
