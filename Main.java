import java.util.Scanner;

/**
 *Calculates the subtotal and total of the amount of items being purchased
 * @author Cole Girling
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create a scanner for user input
    Scanner input = new Scanner(System.in);

    //Ask the user how many chargers they want
    System.out.println("How many Chromebook Chargers are being purchased?");
    //initialize how many chargers they are buying
    int chromebookCharger = input.nextInt();

    //ask the user how many motherboards they want
    System.out.println("How many Motherboards are being purchased");
    //initialize how many motherboards they are buying
    int motherboard = input.nextInt();

    //ask the user how many mice they want
    System.out.println("How many Computer Mouses are being purchased");
    //initialize how many mice they are buying
    int computerMouse = input.nextInt();

    //The cost of the items that are being purchased
    final double chromebookChargerCost = 34.99;
    final double motherboardCost = 127.50;
    final double computerMouseCost = 18.00;

    //The amount of items being purchased multiplied by the price
    final double subtotalChromebook = chromebookCharger * chromebookChargerCost;
    final double subtotalMotherboard = motherboard * motherboardCost;
    final double subtotalMouse = computerMouse * computerMouseCost;

    //The calculation for the subtotal
    final double subtotal = subtotalChromebook + subtotalMotherboard + subtotalMouse;

    //Prints the subtotal to the screen
    System.out.println("Subtotal $" + subtotal);

    //Calculates the tax
    final double tax = subtotal * 0.13;

    //Prints the tax to the screen
    System.out.println("Taxes $" + tax);
    
    //Calculates the final total
    final double total = subtotalChromebook + subtotalMotherboard + subtotalMouse + tax;

    //Prints the total to the screen
    System.out.println("Total $" + total);
  }
}
