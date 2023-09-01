package org.example;

import java.util.Scanner;

public class Espresso {


    static int price = 4;
    static int water = 250;
    static int milk = 0;
    static int beans = 16;

    public static void espressoCoffee(int cups){

        if(cups*water > CoffeeMachine.totalWater){
            System.out.println("\n [Insufficient water Try to Refill it by the owner !!!]");
            System.out.println("\n [ Returned to the remaining ingredients menu !!!");
            CoffeeMachine.show();
        }

        if(cups*milk > CoffeeMachine.totalMilk){
            System.out.println("\n [Insufficient Milk Try to Refill it by the owner !!!]");
            System.out.println("\n [ Returned to the remaining ingredients menu !!!");
            CoffeeMachine.show();
        }

        if(cups*beans > CoffeeMachine.totalBeans){
            System.out.println("\n [Insufficient Beans Try to Refill it by the owner !!!]");
            System.out.println("\n [ Returned to the remaining ingredients menu !!!");
            CoffeeMachine.show();
        }

        CoffeeMachine.totalWater -= cups*water;
        CoffeeMachine.totalMilk -= cups*milk;
        CoffeeMachine.totalBeans -= cups*beans;

        CoffeeMachine.waterConsumed += cups*water;
        CoffeeMachine.milkConsumed += cups*milk;
        CoffeeMachine.beansConsumed += cups*beans;

        CoffeeMachine.totalMoney += cups*price;

        System.out.println("\n [ Your Espresso Coffee is ready !!! ]");
        System.out.println("<---------------------->");
        System.out.println("Coffee Bill!!!!!!");
        System.out.println("Ingredients used       Amount"+"\t"+"Quantity"+"\t"+"Price");

        System.out.println("Water               :   "+water+"\t\t"+cups+"\t\t\t"+cups*water);
        System.out.println("Milk                :   "+milk+"\t\t"+cups+"\t\t\t"+cups*milk);
        System.out.println("Coffee Beans        :   "+beans+"\t\t"+cups+"\t\t\t"+cups*beans);

        System.out.println("Price of the coffee :   "+price+"\t\t"+cups+"\t\t\t"+cups*price);
        System.out.println("Total Amount(INR)   :   "+cups*price);

        System.out.println("\n [ Thank you for buying. Have a Nice day! ] ");

        //after selling coffee
        CoffeeMachine.espressoSoldCount++;
        CoffeeMachine.totalSold++;
        CoffeeMachine.coffeeIsEmpty=true;

        CoffeeMachine.mainMenu();
    }
}
