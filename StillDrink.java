/**
 * represents non-carbonated beverages and extends the Drink superclass.
 */
public class StillDrink extends Drink {
    // private instance variables for non-carbonated drinks
    private boolean isIced;
    private int sweetnessPercentage;

    /**
     * no-argument constructor
     */
    public StillDrink() {
        super();
        this.isIced = true;
        this.sweetnessPercentage = 100;
    }

    /**
     * parameterized constructor calling super
     * drink name (Water)
     * drink price
     * drink volume
     * isIced whether ice is included or not 
     */
    public StillDrink(String name, double price, double volumeOz, boolean isIced) {
        super(name, price, volumeOz);
        this.isIced = isIced;
        this.sweetnessPercentage = 0;
    }

    /**
     * full parameterized constructor calling super
     * drink name (Lemonade)
     * drink price
     * drink volume
     * isIced whether ice is included
     * sweetnessPercentage sweetness percentage level (0-100%)
     */
    public StillDrink(String name, double price, double volumeOz, boolean isIced, int sweetnessPercentage) {
        super(name, price, volumeOz);
        this.isIced = isIced;
        this.sweetnessPercentage = sweetnessPercentage;
    }

    // accessors
    /**
     * checks if drink is served with ice
     * returns true if iced and false if not 
     */
    public boolean getIsIced() {
        return isIced;
    }

    /**
     * gets the sweetness level
     * returns sweetness percentage
     */
    public int getSweetnessPercentage() {
        return sweetnessPercentage;
    }

    // mutators
    /**
     * sets iced status
     * iced new iced status
     */
    public void setIsIced(boolean iced) {
        isIced = iced;
    }

    /**
     * sets sweetness level percentage
     * sweetnessPercentage new sweetness level
     */
    public void setSweetnessPercentage(int sweetnessPercentage) {
        this.sweetnessPercentage = sweetnessPercentage;
    }

    /**
     * returns string using super.toString()
     * returns formatted string of still drink details
     */
    public String toString() {
        return super.toString() + " | Served Iced: " + isIced + " | Sweetness: " + sweetnessPercentage + "%";
    }
}