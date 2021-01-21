
import java.util.Scanner;

/**
 * This class is to test what a VendingMachine object can do and if it can meet people's demands or not.
 * @author Zhiping Yu    student number: 000822513  date: June 7, 2020
 */

public class VendingMachine_Test {
    /**
     * This main method is to creates two VendingMachine objects and use their methods to perform some tasks.
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // create a scanner to read users' input
        /** declare, create and initialize two machines**/
        VendingMachine vm1 = new VendingMachine(5, "Chocolate-bars", 1.25, 0.00, 0.00);
        VendingMachine vm2 = new VendingMachine(1, "Chips", 2.50, 0.00, 0.00);
        while (true) {// this while loop allows users to make multiple choices and print updated information
            // print messages
            System.out.println("Welcome to the Break Room");
            System.out.println("1. " + vm1);
            System.out.println("2. " + vm2);
            System.out.println("What would you like to do?");
            System.out.println("1. Enter money");
            System.out.println("2. Get change back");
            System.out.println("3. Vend an item");
            System.out.println("4. Leave the break room");
            System.out.println("Your Choice?  ");
            int choice = sc.nextInt(); // store user's choice into a variable
            if (choice == 1) {
                System.out.println("*** Enter money chosen ***");
                System.out.println("Which machine? 1 or 2 ");
                int machineNum = sc.nextInt(); // store machine number to a variable
                if (machineNum == 1) {
                    System.out.println("Enter the amount to be added: ");
                    double amount1 = sc.nextDouble();
                    vm1.addMoney(amount1); // call addMoney() method
                } else if (machineNum == 2) {
                    System.out.println("Enter the amount to be added: ");
                    double amount2 = sc.nextDouble();
                    vm2.addMoney(amount2);// call addMoney() method
                }

            } else if (choice == 2) {
                System.out.println("*** Get change back chosen ***");
                System.out.print("Which machine? ");
                int machineNum = sc.nextInt();
                if (machineNum == 1) {
                    vm1.returnCoins(); // call returnCoins()method


                } else if (machineNum == 2) {
                    vm2.returnCoins(); // call returnCoins()method
                }


            } else if (choice == 3) {
                System.out.println("*** Vend an item chosen ***");
                System.out.print("Which machine? ");
                int machineNum = sc.nextInt();
                if (machineNum == 1) {
                    vm1.vendAnItem();// call vendAnItem()method

                } else if (machineNum == 2) {
                    vm2.vendAnItem();// call vendAnItem()method
                }
            } else if (choice == 4) {
                System.out.println("*** Goodbye! ***");
                break; // jump out from the loop
            }


        }
    }
}