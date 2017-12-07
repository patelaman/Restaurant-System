package Strategy;

public class OnePayment implements PaymentStrategy {

    private static final double DEFAULT_GRATUITY_PERCENTAGE = .20;

    @Override
    public void pay(double amountDue, int numberOfPeople) {
        double addedGratuity = addGratuity(amountDue, numberOfPeople);
        System.out.printf("Default Gratuity: $%.2f%n", addedGratuity);
        System.out.printf("Total: $%.2f", addedGratuity + amountDue);
    }

    @Override
    public double addGratuity(double amountDue, int numberOfPeople) {
        if(numberOfPeople >= 10) {
            return amountDue * DEFAULT_GRATUITY_PERCENTAGE;
        }

        return 0;
    }
}
