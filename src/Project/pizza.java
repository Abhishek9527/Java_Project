package Project;

public class pizza {
    private int price;
    private Boolean veg;
    private int addExtraCheesePrice = 100;
    private int addExtraToppingPrice = 150;
    private int backpackPrice = 20;
    private int basePizzaPrice;
    private int DelivaryCharge=30;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingAdded = false;
    private boolean isOptedForTakeAway = false;
    private boolean isDelivaryCharge = false;

    public pizza(Boolean veg) {
        this.veg = veg;
        if (this.veg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }

    public void addExtraCheese() {
        isExtraCheeseAdded = true;
        this.price += addExtraCheesePrice;
    }

    public void addExtraTopping() {
        isExtraToppingAdded = true;
        this.price += addExtraToppingPrice;
    }

    public void takeAway() {
        isOptedForTakeAway = true;
        this.price += backpackPrice;
    }
    public void DelivaryCharge() {
    	//System.out.println(":Delivary Charge " + DelivaryCharge);
        this.price += DelivaryCharge;
    }

    public void getBill() {
        String bill = "Base Pizza Price: " + basePizzaPrice + "\n";

        if (isExtraCheeseAdded) {
            bill += "Extra Cheese added: " + addExtraCheesePrice + "\n";
        }

        if (isExtraToppingAdded) {
            bill += "Extra Topping Added: " + addExtraToppingPrice + "\n";
        }

        if (isOptedForTakeAway) {
            bill += "Take Away Charge: " + backpackPrice + "\n";
        }
       if (isDelivaryCharge) {
            bill += ":Delivary Charge " + DelivaryCharge + "\n";
        }

        bill += "Total Bill: " + this.price + "\n";

        System.out.println(bill);
    }

    public static class DeluxePizza extends pizza {
        public DeluxePizza(Boolean veg) {
            super(veg);
            super.addExtraCheese();
            super.addExtraTopping();
        }
    }

    public static void main(String[] args) {
//        pizza basePizza = new pizza(true);
//        basePizza.addExtraCheese();
//        basePizza.addExtraTopping();
//        basePizza.takeAway();
//        basePizza.DelivaryCharge();
//        basePizza.getBill();

        DeluxePizza deluxePizza = new DeluxePizza(false);
        deluxePizza.getBill();
    }
}
