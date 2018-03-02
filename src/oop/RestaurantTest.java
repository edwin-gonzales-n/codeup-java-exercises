package oop;

public class RestaurantTest {
        public static void main(String[] args) {
        RestaurantDish dish = new RestaurantDish(100, "Fried Fish", true);
//        dish.setCostInCents(100);
//        dish.setNameOfDish("Fried Fish");
//        dish.setWouldRecommend(true);
        dish.eat();

        System.out.println("\nOur main dish is only " + dish.getCostInCents() + " cents.  Mad cheap!\n"+
                "This is a delicious " + dish.getNameOfDish() + " and some rice with beans,\n" +
                "Ask your server if he would recommend it.  I am sure he will say that is: " + dish.getWouldRecommend() +
                "\nPEACE!!! ");
    }
}
