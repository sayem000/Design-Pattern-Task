package builder_pattern;
public class Burger {
    private final double cost;
    private final int cheese;
    private final int meat;
    private final int bread;

    private Burger(BurgerBuilder builder) {
        this.cost = builder.getCost();
        this.cheese = builder.cheese;
        this.meat = builder.meat;
        this.bread = builder.bread;
    }

    public double getCost() {
        return cost;
    }

    public int num_Of_Cheese() {
        return cheese;
    }

    public int num_Of_Meat() {
        return meat;
    }

    public int num_Of_Bread() {
        return bread;
    }

    public static class BurgerBuilder {
        
        private int cheese = 0;
        private int meat = 0;
        private int bread = 0;
        private final int chese_price = 15;
        private final int meat_price = 15;
        private final int bread_price = 15;
        
        public BurgerBuilder(){}

        public double getCost(){
            return cheese * chese_price + meat * meat_price + bread * bread_price;
        }

        public BurgerBuilder cheese(int cheese) {
            this.cheese += cheese;
            return this;
        }

        public BurgerBuilder bread(int bread) {
            this.bread += bread;
            return this;
        }

        public BurgerBuilder meat(int meat) {
            this.meat += meat;
            return this;
        }

        public Burger build() {
            return new Burger(this);
        }
    }
}
