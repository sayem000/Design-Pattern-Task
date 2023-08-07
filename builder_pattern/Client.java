
package builder_pattern;

public class Client {
    public static void main(String[] args) {
        Burger burger = new Burger.BurgerBuilder()
                .cheese(3).bread(2).cheese(1).meat(2)
                .cheese(2).bread(2).cheese(1).build();

                System.out.println("Cheese : " + burger.num_Of_Cheese());
                System.out.println("Meat : " + burger.num_Of_Meat());
                System.out.println("Bread : " + burger.num_Of_Bread());
                System.out.println("Cost : " + burger.getCost());
    }
}
