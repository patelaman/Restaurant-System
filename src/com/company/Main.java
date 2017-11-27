package com.company;

public class Main {

    public static void main(String[] args) {

        //Testing Code
        SystemInterface systemInterface = new SystemInterface();
        systemInterface.setInvoker();

        //Display Menu
        for(String s: systemInterface.displayMenu()) {
            System.out.println(s);
        }

        systemInterface.submitOrder(2);

        for(String s: systemInterface.displayTab()) {
            System.out.println(s);
        }


    }
}
