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

![Screenshot (45).png](..%2F..%2F..%2FOneDrive%2FPictures%2FScreenshots%2FScreenshot%20%2845%29.png)
![Screenshot (42).png](..%2F..%2F..%2FOneDrive%2FPictures%2FScreenshots%2FScreenshot%20%2842%29.png)
![Screenshot (43).png](..%2F..%2F..%2FOneDrive%2FPictures%2FScreenshots%2FScreenshot%20%2843%29.png)
![Screenshot (44).png](..%2F..%2F..%2FOneDrive%2FPictures%2FScreenshots%2FScreenshot%20%2844%29.png)
