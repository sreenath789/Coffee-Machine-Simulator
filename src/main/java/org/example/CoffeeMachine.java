package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class CoffeeMachine {

    static int totalWater = 0;
    static int totalMilk = 0;
    static int totalBeans = 0;
    static int totalMoney = 0;

    static int espressoSoldCount = 0;
    static int latteSoldCount = 0;
    static int cappuccinoSoldCount = 0;
    static int totalSold = 0;

    static int waterConsumed = 0;
    static int milkConsumed = 0;
    static int beansConsumed = 0;

    static int extraWater = 1;
    static int extraMilk = 2;
    static int extraBeans = 2;

    static boolean coffeeIsEmpty = false;


    public static void main(String[] args) {
        startMenu();
    }

    public static void startMenu(){
        System.out.println("\n [ WELCOME TO COFFEE MACHINE  ] ");
        System.out.print("\n [ (1) Main Menu ]  [ (2) Machine Analytics ] [(3) Add Ingredients] [(4) Exit ]");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if(input==1){
            if(totalWater<=0 || totalMilk<=0 || totalBeans<=0){
                System.out.println("Add Ingredients first to prepare Coffee");
                startMenu();
            }
            mainMenu();
        }
        else if(input==2){
            analytics();
        }
        else if(input==3){
            addIngredients();
        }
        else if(input==4){
            exitMenu();
        }
        else{
            System.out.println("Invalid Input Choose Correct one!!!");
            startMenu();
        }
    }

    public static void mainMenu(){
        System.out.println("\n [ COFFEE MACHINE MENU  ] ");
        System.out.print("\n [ (1) Buy ]  [ (2) Fill ]  [ (3) Take ]  [ (4) Show ]  [ (5) Exit ] [(6) Back to Start Menu]");
        System.out.print(" \n [ SELECT OPTIONS ( 1 - 5 ) ] ");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        switch (option){
            case 1 -> buy();
            case 2 -> fill();
            case 3 -> take();
            case 4 -> show();
            case 5 -> exitMenu();
            case 6 -> startMenu();
            default -> {
                System.out.println("Invalid option!!! Please correct one [1-6] ");
                mainMenu();
            }
        }

    }

    public static void buy(){
        System.out.print
                ("\n [Select type of coffee u want ] \n" +
                        " [ (1) Espresso ] [ (2) Latte ] [ (3) Cappuccino ] [ (4) MAIN MENU ] [(5) EXIT ] [(6) Start Menu]\n");

        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        if(option==1){
            System.out.println("\n [ We have the ingredients remaining quantity ] ");
            System.out.println("Total Water : "+" [ "+totalWater+" ]");
            System.out.println("Total Milk : "+" [ "+totalMilk+" ]");
            System.out.println("Total Beans : "+" [ "+totalBeans+" ]");

            System.out.println("\n [For 1 cup of Espresso Coffee ]"+" Ingredients need "+
                    "[ Water :"+Espresso.water+" ml]"+
                    " [ Milk :"+Espresso.milk+" ml]"+
                    " [ Beans :"+Espresso.beans+" grams]"+
                    " [ Price :"+Espresso.price+" $]");

            System.out.println("\n [ Enter the cups how much you need! ] ");
            int cup = sc.nextInt();
            Espresso.espressoCoffee(cup);
        }
        else if(option==2){
            System.out.println("\n [ We have the ingredients remaining quantity ] ");
            System.out.println("Total Water : "+"[ "+totalWater+" ]");
            System.out.println("Total Milk : "+"[ "+totalMilk+" ]");
            System.out.println("Total Beans : "+"[ "+totalBeans+"  ]");

            System.out.println("\n [For 1 cup of Latte Coffee ]"+" Ingredients need"+
                    " [ Water :"+Latte.water+" ml]"+
                    " [ Milk :"+Latte.milk+" ml]"+
                    " [ Beans :"+Latte.beans+" grams]"+
                    " [ Price :"+Latte.price+" $]");

            System.out.println("\n [ Enter the cups how much you need! ] ");
            int cup = sc.nextInt();
            Latte.latteCoffee(cup);
        }
        else if(option==3){
            System.out.println("\n [ We have the ingredients remaining quantity ] ");
            System.out.println("Total Water : "+"[ "+totalWater+" ]");
            System.out.println("Total Milk : "+"[ "+totalMilk+" ]");
            System.out.println("Total Beans : "+"[ "+totalBeans+" ]");

            System.out.println("\n [For 1 cup of Cappuccino Coffee ]"+" Ingredients need"+
                    " [ Water :"+Cappuccino.water+" ml]"+
                    " [ Milk :"+Cappuccino.milk+" ml]"+
                    " [ Beans :"+Cappuccino.beans+" grams]"+
                    " [ Price :"+Cappuccino.price+" $]");
            System.out.println("\n [ Enter the cups how much you need! ] ");
            int cup = sc.nextInt();
            Cappuccino.cappuccinoCoffee(cup);
        }
        else if(option==4){
            mainMenu();
        }
        else if(option==5){
            exitMenu();
        }
        else if(option==6){
            startMenu();
        }
        else{
            System.out.println("Invalid option !!! Please choose correct one.");
            buy();
        }
    }
    public static void fill(){

        if(!coffeeIsEmpty){
            System.out.println("Right now u don't have any coffee please buy first then refill it!!!!");
            buy();
        }

        System.out.println("Remaining Ingredients in Coffee Machine!!!");
        System.out.println("Water : "+totalWater);
        System.out.println("Milk : "+totalMilk);
        System.out.println("Beans : "+totalBeans);

        System.out.println("Please enter the sufficient quantity to refill");

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the water how much u need in ml price for extra water "+extraWater+"$");
        boolean isWater = true;
        boolean waterAdded = false;
        while (isWater){
            int water = sc.nextInt();
            if(water > totalWater){
                System.out.println("Insufficient water!!!!");
                System.out.println("Please correct amount of water!!!");
                while (true){
                    System.out.println("If u want to add Please enter 'Y' or 'N' to exit from water menu");
                    char ch = sc.next().charAt(0);
                    if(ch=='Y' || ch=='y'){
                        break;
                    }
                    else if(ch=='N' || ch=='n'){
                        isWater=false;
                        break;
                    }
                    System.out.println("Please correct option");
                }

            }
            else{
                totalWater-=water;
                waterConsumed+=water;
                totalMoney+=extraWater;
                waterAdded=true;
                System.out.println("Water added Successfully with "+water+" ml");
                break;
            }
        }

        boolean isMilk = true;
        boolean milkAdded = false;
        System.out.println("Please enter the milk how much u need in ml price for extra milk "+extraMilk+"$");
        while (isMilk){
            int milk = sc.nextInt();
            if(milk > totalMilk){
                System.out.println("Insufficient milk!!!!");
                System.out.println("Please correct amount of milk!!!");
                while (true){
                    System.out.println("If u want to add Please enter 'Y' or 'N' to exit from milk menu");
                    char ch = sc.next().charAt(0);
                    if(ch=='Y' || ch=='y'){
                        break;
                    }
                    else if(ch=='N' || ch=='n'){
                        isMilk=false;
                        break;
                    }
                    System.out.println("Please correct option");
                }
            }
            else{
                totalMilk-=milk;
                milkConsumed+=milk;
                totalMoney+=extraMilk;
                milkAdded=true;
                System.out.println("Milk added Successfully with "+milk+" ml");
                break;
            }
        }

        boolean isBeans = true;
        boolean beansAdded = false;
        System.out.println("Please enter the beans how much u need in grams price for extra beans "+extraBeans+"$");
        while (isBeans){
            int beans = sc.nextInt();
            if(beans > totalBeans){
                System.out.println("Insufficient beans!!!!");
                System.out.println("Please correct amount of beans!!!");
                while (true){
                    System.out.println("If u want to add Please enter 'Y' or 'N' to exit from beans menu");
                    char ch = sc.next().charAt(0);
                    if(ch=='Y' || ch=='y'){
                        break;
                    }
                    else if(ch=='N' || ch=='n'){
                        isBeans=false;
                        break;
                    }
                    System.out.println("Please correct option");
                }
            }
            else{
                totalBeans-=beans;
                beansConsumed+=beans;
                totalMoney+=extraBeans;
                beansAdded=true;
                System.out.println("Beans added Successfully with "+beans+" grams");
                break;
            }
        }

        if(waterAdded || milkAdded || beansAdded){
            System.out.println("Your Coffee is Refilled!!!!!");
        }
        else{
            System.err.println("Your Coffee isn't Refilled!!!!!");
        }

        System.out.println("Returned to the main menu!!!");
        mainMenu();

    }
    public static void show(){
        System.out.println("Remaining Ingredients in Coffee Machine!!!");
        System.out.println("Water : "+totalWater);
        System.out.println("Milk : "+totalMilk);
        System.out.println("Beans : "+totalBeans);

        mainMenu();
    }
    public static void take(){
        System.out.println("Total money in the box!!!"+ totalMoney+"$");
        System.out.println("Enter the amount you want take!!!");
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        if(money > totalMoney){
            System.out.println("Insufficient Money Please enter the correct money !!!");
            take();
        }
        else{
            totalMoney-=money;
            System.out.println("Withdrawn money was : "+money);
            System.out.println("Remaining money in the money box : "+totalMoney);
            mainMenu();
        }
    }
    public static void exitMenu(){
        System.out.println("Thank You for Shopping with us!!!");
        System.exit(0);
    }

    public static void addIngredients(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of water to add!!!");
        int water = sc.nextInt();
        if(water > 0){
            totalWater += water;
        }
        System.out.println("Enter the amount of milk to add!!!");
        int milk = sc.nextInt();
        if(milk > 0){
            totalMilk += milk;
        }
        System.out.println("Enter the amount of beans to add!!!");
        int beans = sc.nextInt();
        if(beans > 0){
            totalBeans += beans;
        }
        System.out.println("Ingredients added successfully!!!!");
        show();
    }

    public static void analytics(){
        System.out.println("Total Amount of coffees sold : "+totalSold);
        System.out.println("Total Amount of Espresso Coffees sold : "+espressoSoldCount);
        System.out.println("Total Amount of Latte Coffees sold : "+latteSoldCount);
        System.out.println("Total Amount of Cappuccino Coffees sold : "+cappuccinoSoldCount);

        System.out.println("Ingredients consumed !!!!");
        System.out.println("Water : "+waterConsumed);
        System.out.println("Milk : "+milkConsumed);
        System.out.println("Beans : "+beansConsumed);

        System.out.println("Remaining Ingredients !!!!");
        System.out.println("Water : "+totalWater);
        System.out.println("Milk : "+totalMilk);
        System.out.println("Beans : "+totalBeans);

        System.out.println("Amount Earned on total Coffees : "+totalMoney);

        startMenu();
    }


}