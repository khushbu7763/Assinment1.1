
import java.util.HashMap;

public class GroceryListManager {

    private HashMap<String, Double> groceryList = new HashMap<>();
    private HashMap<String, String> categories = new HashMap<>();
    private HashMap<String, Integer> quantities = new HashMap<>();

    // Add item with cost, category and quantity
    public void addItem(String item, double cost, String category, int quantity) {
        groceryList.put(item, cost);
        categories.put(item, category);
        quantities.put(item, quantity);
    }

    // Calculate total cost (cost multiplied by quantity)
    public double calculateTotalCost() {
        double total = 0;

        for (String item : groceryList.keySet()) {
            double cost = groceryList.get(item);
            int quantity = quantities.get(item);

            total = total + (cost * quantity);
        }

        return total;
    }

    // Display items by category
    public void displayByCategory(String category) {
        System.out.println("Items in " + category + " category:");

        for (String item : groceryList.keySet()) {
            if (categories.get(item).equalsIgnoreCase(category)) {
                System.out.println(item + " - $" + groceryList.get(item)
                        + " - Quantity: " + quantities.get(item));
            }
        }
    }

    // Update quantity
    public void updateQuantity(String item, int newQuantity) {
        if (quantities.containsKey(item)) {
            quantities.put(item, newQuantity);
            System.out.println(item + " quantity updated to " + newQuantity);
        } else {
            System.out.println(item + " not found.");
        }
    }

    // Display available items
    public void displayAvailableItems() {
        System.out.println("Available Items:");

        for (String item : quantities.keySet()) {
            if (quantities.get(item) > 0) {
                System.out.println(item + " - Quantity: " + quantities.get(item));
            }
        }
    }

    // Main method - Testing all features
    public static void main(String[] args) {

        GroceryListManager manager = new GroceryListManager();

        // Adding items
        manager.addItem("Apples", 2.50, "Fruits", 5);
        manager.addItem("Milk", 1.80, "Dairy", 3);
        manager.addItem("Bread", 3.00, "Bakery", 2);
        manager.addItem("Banana", 1.50, "Fruits", 4);

        // Test 1: Total cost
        System.out.println("Total Grocery Cost: $"
                + manager.calculateTotalCost());

        // Test 2: Display by category
        System.out.println();
        manager.displayByCategory("Fruits");

        // Test 3: Update quantity
        System.out.println();
        manager.updateQuantity("Milk", 6);

        // Test 4: Display available items
        System.out.println();
        manager.displayAvailableItems();

        // Test 5: Calculate updated total cost
        System.out.println();
        System.out.println("Updated Total Cost: $"
                + manager.calculateTotalCost());
    }
}
