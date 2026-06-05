class Restaurant {
    protected double foodPrice;

    public Restaurant(double foodPrice) {
        this.foodPrice = foodPrice;
    }

    public double calculateTax() {
        return foodPrice * 0.10;
    }

    public double calculateTotalBill() {
        return foodPrice + calculateTax();
    }

    public int estimateDeliveryTime() {
        return 40;
    }
}


class FastFoodRestaurant extends Restaurant {

    public FastFoodRestaurant(double foodPrice) {
        super(foodPrice);
    }

    @Override
    public double calculateTax() {
        return foodPrice * 0.15;
    }

    @Override
    public int estimateDeliveryTime() {
        return 20;
    }
}


class FineDiningRestaurant extends Restaurant {

    public FineDiningRestaurant(double foodPrice) {
        super(foodPrice);
    }


    @Override
    public int estimateDeliveryTime() {
        return 60;
    }
}


public class RestaurantType {
    public static void main(String[] args) {

        double price = 1000;

        Restaurant r1 = new Restaurant(price);
        System.out.println("=== Standard Restaurant ===");
        System.out.println("Total Bill: " + r1.calculateTotalBill());
        System.out.println("Delivery Time: " + r1.estimateDeliveryTime() + " mins");

        System.out.println();

        Restaurant r2 = new FastFoodRestaurant(price);
        System.out.println("=== Fast Food Restaurant ===");
        System.out.println("Total Bill: " + r2.calculateTotalBill());
        System.out.println("Delivery Time: " + r2.estimateDeliveryTime() + " mins");

        System.out.println();

        Restaurant r3 = new FineDiningRestaurant(price);
        System.out.println("=== Fine Dining Restaurant ===");
        System.out.println("Total Bill: " + r3.calculateTotalBill());
        System.out.println("Delivery Time: " + r3.estimateDeliveryTime() + " mins");
    }
}