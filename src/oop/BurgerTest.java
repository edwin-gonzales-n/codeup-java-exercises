package oop;

public class BurgerTest {
    public static void main(String[] args) {
//        BurgerTools test1 = new BurgerTools();
        BurgerTools.mostPopulatTopping = "mayo";
        BurgerTools.averageDaysBeforeExpiration = 30;
        BurgerTools.temperatureWhenCooked = 200;
        BurgerTools.grill();

        System.out.println("\nDid you know that " + BurgerTools.mostPopulatTopping + " is the most popular topping?\n" +
                "Our burger takes an avarage of " + BurgerTools.averageDaysBeforeExpiration + " days to expire,\n" +
                "and usually its temperature is " + BurgerTools.temperatureWhenCooked + " degrees when coocked.\n" +
                "PEACE!!! ");
    }
}