/**
 * runner class object instantiation and methods for Drink Store
 */
public class StoreRunner {
    public static void main(String[] args) {

        // Instantiating drinks across all three subclasses
        CarbonatedDrink ramune = new CarbonatedDrink("Ramune Soda", 3.50, 6.76, "Melon", true);
        CarbonatedDrink sprite = new CarbonatedDrink("Sprite", 2.25, 12.0, "Lemon-Lime", false);
        StillDrink lemonade = new StillDrink("Fresh Lemonade", 4.00, 16.0, true, 80);
        StillDrink water = new StillDrink("Spring Water", 1.50, 20.0, false, 0);
        DairyDrink chocoMilk = new DairyDrink("Chocolate Milk", 3.00, 10.0, "Chocolate", false);
        DairyDrink strawMilk = new DairyDrink("Strawberry Milk", 3.00, 10.0, "Strawberry", false);

        // Printing out the menu using toString()
        System.out.println("\n --DRINK MENU-- ");
        System.out.println(ramune.toString());
        System.out.println(sprite.toString());
        System.out.println(lemonade.toString());
        System.out.println(water.toString());
        System.out.println(chocoMilk.toString());
        System.out.println(strawMilk.toString());

        // Testing mutator and accessor methods
        chocoMilk.setIsLactoseFree(true);
        System.out.println("\nUpdated Chocolate Milk Lactose Free Status: " + chocoMilk.getIsLactoseFree());
        System.out.println(chocoMilk.toString());
    }
}