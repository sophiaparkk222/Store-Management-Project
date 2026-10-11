/**
 * Serves as the superclass for specific beverage categories
 */
public class Drink {
    // private instance variables shared across all drinks
    private String name;
    private double price;
    private double volumeOz;

    /**
     * no-argument constructor initializing default values
     */
    public Drink() {
        this.name = "Generic Beverage";
        this.price = 0.0;
        this.volumeOz = 0.0;
    }

    /**
     * parameterized constructor with name and price
     * name of the drink
     * price of the drink
     */
    public Drink(String name, double price) {
        this.name = name;
        this.price = price;
        this.volumeOz = 12.0;
    }

    /**
     * full parameterized constructor
     * name of the drink
     * price of the drink
     * volume of the drink in ounces
     */
    public Drink(String name, double price, double volumeOz) {
        this.name = name;
        this.price = price;
        this.volumeOz = volumeOz;
    }

    // accessor methods
    /**
     * gets the name of the drink
     * returns drink name
     */
    public String getName() {
        return name;
    }

    /**
     * gets the price of the drink
     * returns drink price
     */
    public double getPrice() {
        return price;
    }

    /**
     * gets the volume of the drink in fluid ounces
     * returns volume in ounces
     */
    public double getVolumeOz() {
        return volumeOz;
    }

    // Mutator Methods
    /**
     * sets the drink name
     * name new drink name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * sets the drink price
     * @price new drink price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * sets the drink volume
     * new volume in fluid ounces
     */
    public void setVolumeOz(double volumeOz) {
        this.volumeOz = volumeOz;
    }

    /**
     * returns a string of the basic drink details
     * returns formatted string of drink properties
     */
    public String toString() {
        return "Drink: " + name + " | Price: $" + price + " | Size: " + volumeOz + " oz";
    }
}