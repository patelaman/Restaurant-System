package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        //Testing Code
//        SystemInterface systemInterface = new SystemInterface();
//        systemInterface.setInvoker();
//
//        //Display Menu
//        displayMenu(systemInterface);
//
//        systemInterface.submitOrder(2);
//        systemInterface.submitOrder(1);
//        systemInterface.submitOrder(3);
//
//        //Display Tab
//        displayTab(systemInterface);




        //Client Code
        SystemInterface systemInterface = new SystemInterface();
        systemInterface.setInvoker();
        System.out.println("What would you like to do?");
        System.out.println("1 - Display Menu    2 - Place Order   3 - Display Tab   0 - Exit");
        Scanner sc = new Scanner(System.in);
        int choice = getInt(sc);
        while(choice != 0) {
            switch (choice) {
                case 1:
                    displayMenu(systemInterface);
                    break;
                case 2:
                    getOrder(systemInterface, sc);
                    break;
                case 3:
                    displayTab(systemInterface);
                    break;
            }
            System.out.println("What would you like to do?");
            System.out.println("1 - Display Menu    2 - Place Order    3 - Display Tab    0 - Exit");
            choice = getInt(sc);
        }
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

    private static void displayMenu(SystemInterface systemInterface) {
        System.out.println("Menu");
        for(String s: systemInterface.displayMenu()) {
            System.out.println(s);
        }
    }

    //Input Validation for Integer's
    public static int getInt(Scanner sc) {
        int num;

        while (!sc.hasNextInt()) {
            System.out.println("Not an integer, Try again");
            sc.next();
        }
        num = sc.nextInt();
        return num;
    }
}
