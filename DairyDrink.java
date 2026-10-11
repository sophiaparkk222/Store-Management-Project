/**
 * represents milk-based drinks and extends Drink superclass
 */
public class DairyDrink extends Drink {
    // private instance variables for milk drinks
    private String flavor;
    private boolean isLactoseFree;

    /**
     * no-argument constructor
     */
    public DairyDrink() {
        super();
        this.flavor = "Plain";
        this.isLactoseFree = false;
    }

    /**
     * parameterized constructor calling super
     * drink name (Chocolate Milk)
     * drink price
     * drink volume
     * flavor profile (Chocolate, Strawberry)
     */
    public DairyDrink(String name, double price, double volumeOz, String flavor) {
        super(name, price, volumeOz);
        this.flavor = flavor;
        this.isLactoseFree = false;
    }

    /**
     * full parameterized constructor calling super
     * drink name
     * drink price
     * drink volume
     * flavor profile
     * isLactoseFree whether the drink is lactose free or not
     */
    public DairyDrink(String name, double price, double volumeOz, String flavor, boolean isLactoseFree) {
        super(name, price, volumeOz);
        this.flavor = flavor;
        this.isLactoseFree = isLactoseFree;
    }

    // accessors
    /**
     * gets the milk flavor
     * returns flavor string
     */
    public String getFlavor() {
        return flavor;
    }

    /**
     * checks if milk is lactose free
     * returns true if lactose free and false if not
     */
    public boolean getIsLactoseFree() {
        return isLactoseFree;
    }

    // Mutators
    /**
     * sets the milk flavor
     * new flavor string
     */
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    /**
     * sets the lactose-free status
     * isLactoseFree new lactose-free status
     */
    public void setIsLactoseFree(boolean isLactoseFree) {
        this.isLactoseFree = isLactoseFree;
    }

    /**
     * returns string using super.toString()
     * returns string of dairy drink details
     */
    public String toString() {
        return super.toString() + " | Flavor: " + flavor + " | Lactose Free: " + isLactoseFree;
    }
}