package Strategy;

import Client.Main;

import java.util.Scanner;

public class SplitPayment implements PaymentStrategy {

    private static final double DEFAULT_GRATUITY_PERCENTAGE = .20;
    private Scanner sc = new Scanner(System.in);

    @Override
    public void pay(double amountDue, int numberOfPeople) {
        System.out.println("How many payments do you want to split the tab into?");
        int numberOfPayments = Main.getInt(sc, 20);

        double pricePerPerson = amountDue / numberOfPayments;
        double addedGratuity = (addGratuity(amountDue, numberOfPeople)) / numberOfPayments;
        System.out.printf("Default Gratuity Per Person: $%.2f%n", addedGratuity);
        System.out.printf("Total Due Per Person: $%.2f", addedGratuity + pricePerPerson);
    }

    @Override
    public double addGratuity(double amountDue, int numberOfPeople) {
        if(numberOfPeople >= 10) {
            return (amountDue * DEFAULT_GRATUITY_PERCENTAGE);
        }

        return 0;
    }
}
