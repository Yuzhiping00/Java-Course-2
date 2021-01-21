
/**
 * This class is a model which can be created objects in other class. It    has some private attributes
 * and public methods.
 * @author Zhiping Yu    student number: 000822513   date: June 7, 2020
 */
public class VendingMachine {
    /**
     * The quantity of product in the machine
     */
    private int quantity;
    /**
     * The  name of product
     */
    private String product;
    /**
     * The price of product
     */
    private double price;
    /**
     * The unused credit and totol money inside machine
     */
    private double unusedCredit, totalAmount;

    /**
     * This is the VendingMachine class constructor, which used to initialize instance variables.
     *
     * @param quantity the initial quantity
     * @param product  the initial product name
     * @param price    the initial product price
     * @param credit   the initial unused credit
     * @param total    the initial total money in the machine
     */
    public VendingMachine(int quantity, String product, double price, double credit, double total) {

        this.quantity = quantity;
        this.product = product;
        this.price = price;
        this.unusedCredit = credit;
        this.totalAmount = total;
    }

    /**
     * This method can be used to print an object of the class.
     *
     * @return String  An object's attributes.
     */
    public String toString() {
        return "Vending Machine contains: " + quantity + " " + product + "   price: " + price + "$" + "\n"
                + "Unused Credit: " + unusedCredit + "$ " + "\n" +
                "Total Amount of Money Vended: " + totalAmount + "$";
    }


    /**
     * This method is to user help method to decide whether or not add money.
     *
     * @param amount Money that user input
     */
    public void addMoney(double amount) {
        if (checkMoney(amount)) {
            unusedCredit += amount; // to increase unused credit
        } else {
            System.out.println("Input is invalid, please insert coins(not bills or pennies).");

        }

    }


    /**
     * This method is to check if an item should be vended or not.
     */
    public void vendAnItem() {
        if (quantity <= 0) {
            System.out.println("Vend Failed, Without products.".toUpperCase());
        } else if (unusedCredit < price) {
            System.out.println("Vend Failed, Not enough credit.".toUpperCase());
        } else if (unusedCredit >= price) {
            System.out.println("Item vended: " + product);
            quantity -= 1; // quantity changes after vending am item
            unusedCredit -= price; // unused credit decreases after vending
            totalAmount += price; // money earned

        }

    }

    /**
     * This is method is to clear the unused credits. In other words, it is used to return the change to the user.
     *
     * @return How much money should be returned to the user
     */
    public double returnCoins() {

        System.out.println("Change returned " + unusedCredit);
        unusedCredit = 0; // set unused credit to 0 after returning change
        return unusedCredit;

    }

    /**
     * This method is help method, and it is used to check whether or not users' inputs are valid
     *
     * @param amount the amount of money users input
     * @return If inputs are coins or not
     */
    private boolean checkMoney(double amount) {
        if (amount == 2 || amount == 1 || amount == 0.25 || amount == 0.1 || amount == 0.05) {// these numbers are valid
            return true;
        }
        return false;
    }

}
