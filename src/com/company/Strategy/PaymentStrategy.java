package com.company.Strategy;

public interface PaymentStrategy {

    void pay(double amountDue, int numberOfPeople);

    double addGratuity(double amountDue, int numberOfPeople);
}
