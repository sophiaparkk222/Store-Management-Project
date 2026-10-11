/**
 * Represents carbonated beverages and extends the Drink superclass
 */
public class CarbonatedDrink extends Drink {
    // private instance variables specific to carbonated drinks
    private String flavor;
    private boolean hasMarble;

    /**
     * no-argument constructor
     */
    public CarbonatedDrink() {
        super();
        this.flavor = "Original";
        this.hasMarble = false;
    }

    /**
     * parameterized constructor calling super
     * drink name (Sprite)
     * drink price
     * drink volume
     * flavor profile
     */
    public CarbonatedDrink(String name, double price, double volumeOz, String flavor) {
        super(name, price, volumeOz);
        this.flavor = flavor;
        this.hasMarble = false;
    }

    /**
     * full parameterized constructor calling super
     * drink name (Ramune)
     * drink price
     * drink volume
     * flavor profile
     * hasMarble whether the bottle has a marble seal
     */
    public CarbonatedDrink(String name, double price, double volumeOz, String flavor, boolean hasMarble) {
        super(name, price, volumeOz);
        this.flavor = flavor;
        this.hasMarble = hasMarble;
    }

    // accessors
    /**
     * gets the drink flavor.
     * returns flavor string
     */
    public String getFlavor() {
        return flavor;
    }

    /**
     * checks if the drink bottle uses a marble stopper
     * returns true if bottle has a marble and false if not 
     */
    public boolean getHasMarble() {
        return hasMarble;
    }

    // mutators
    /**
     * sets the drink flavor
     * new flavor string
     */
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    /**
     * sets whether the bottle includes a marble
     * hasMarble boolean for marble seal
     */
    public void setHasMarble(boolean hasMarble) {
        this.hasMarble = hasMarble;
    }

    /**
     * returns string using super.toString().
     * returns string of carbonated drink details
     */
    public String toString() {
        return super.toString() + " | Flavor: " + flavor + " | Marble Seal: " + hasMarble;
    }
}