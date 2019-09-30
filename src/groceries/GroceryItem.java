package groceries;

public class GroceryItem {

    private String name;
    private int quantity;
    private String category;

    public GroceryItem (String name, int quantity, String category){
        this.name = name;
        this.category = category;
        this.quantity = quantity;
    }

    public String getName() {
        return this.name;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public String getCategory() {
        return this.category;
    }
}
