<h1 align = "center"> Coffee Machine Simulator </h1>

### Languages used :
#### Java

### Project Description :
##### Our Coffee machine will contain the ingredients to make coffee i.e., milk, water, and coffee beans. Let’s say our coffee machine can hold infinite amounts of all the ingredients but initially contains nothing.
##### Our Coffee machine will also contain a money box which will store all the money it collects through selling but initially it is empty.
##### There would be different types of coffee that can be selected which will have separate prices and amounts of ingredients required. The types of coffee are:
* Espresso
##### price - $4/cup, water needed – 250 ml/cup, milk needed – 0 ml/cup, beans needed - 16/cup
* Latte
##### price - $7/cup, water needed – 350 ml/cup, milk needed – 75 ml/cup, beans needed - 20/cup
* Cappuccino
##### price - $6/cup, water needed – 200 ml/cup milk needed – 100 ml/cup beans needed - 12/cup.

### Data Model
The Job data model is defined in the Job class, which has the following attributes:
* Espresso
```
static int price = 4;
static int water = 250;
static int milk = 0;
static int beans = 16;
espressoCoffee(int cups) : it will prepare the Espresso Coffee.
```
* Cappuccino
```
static int price = 6;
static int water = 200;
static int milk = 100;
static int beans = 12;
cappuccinoCoffee(int cups) : it will prepare the Cappuccino Coffee.
```
* Latte
```
static int price = 7;
static int water = 350;
static int milk = 75;
static int beans = 20;
latteCoffee(int cups) : it will prepare the Latte Coffee.
```

* Coffee Machine
```
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

startMenu() -> it will display the start menu 
mainMenu() -> it will display the main menu
buy() -> it will buy u the coffee
show() -> it will show the remaining ingredients.
take() -> it will withdraw the money from collected money
analytics() -> it will show the analytics of coffee machine.
exit() -> it will exit from coffee machine
addIngredients() -> it will add the ingredients
fill() -> it will refill the coffee

```
<br>

#### Sample Output Of The Code

![Screenshot (42)](https://github.com/sreenath789/Coffee-Machine-Simulator/assets/88339640/4c6a8625-35ec-4776-8017-1d2428089b1e)
![Screenshot (43)](https://github.com/sreenath789/Coffee-Machine-Simulator/assets/88339640/4750c1c0-c333-490a-ab44-c3867e57e3a7)
![Screenshot (44)](https://github.com/sreenath789/Coffee-Machine-Simulator/assets/88339640/b0675516-4841-4854-bf0d-4efe7a0000c6)
![Screenshot (45)](https://github.com/sreenath789/Coffee-Machine-Simulator/assets/88339640/73fd2629-78c1-40a3-9202-40e293b5aac5)


