package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Client Code
        SystemInterface systemInterface = new SystemInterface();
        systemInterface.setInvoker();
        System.out.println("What would you like to do?");
        System.out.println("1 - Display Menu    2 - Place Order   3 - Display Tab   0 - Exit");
        Scanner sc = new Scanner(System.in);
        int choice = getInt(sc);
            switch (choice) {
                case 1:
                    displayMenu(systemInterface);
                case 2:
                    getOrder(systemInterface, sc);
                case 3:
                    displayTab(systemInterface);
                    getTotal(systemInterface);
                    break;
            }

    }

    private static void displayMenu(SystemInterface systemInterface) {
        System.out.println("Menu");
        for(String s: systemInterface.displayMenu()) {
            System.out.println(s);
        }
        System.out.println("\nMeals");
        for(String s: systemInterface.displayMeals()) {
            System.out.println(s);
        }
        System.out.println();
    }

    private static void getOrder(SystemInterface systemInterface, Scanner sc) {
        System.out.println("Please enter your order (Enter '0' to end order)");
        int order = getInt(sc);
        while(order != 0) {
            systemInterface.submitOrder(order);
            order = getInt(sc);
        }
    }

    private static void displayTab(SystemInterface systemInterface) {
        System.out.println("\nTab");
        for(String s: systemInterface.displayTab()) {
            System.out.println(s);
        }

        System.out.println();
    }

    private static double getTotal(SystemInterface systemInterface) {
        System.out.printf("Discounts: $%.2f%n", systemInterface.displayDiscounts());
        System.out.printf("Subtotal: $%.2f", systemInterface.displayTabTotal());
        return systemInterface.displayTabTotal();
    }


    //Input Validation for Integer's
    public static int getInt(Scanner sc) {
        int num;
        do {
            while (!sc.hasNextInt()) {
                System.out.println("Not an integer, Try again");
                sc.next();
            }
            num = sc.nextInt();
        } while(num < 0 || num > 11);
        return num;
    }
}
