package groceries;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;

public class GroceryApplication {
    private static Input input = new Input();


    public static void main(String[] args) {
        ArrayList<String> categories = new ArrayList<>();
        categories.add("Produce");
        categories.add("Meat");
        categories.add("Dairy");
        categories.add("Beverage");
        categories.add("Non-Perishables");
        categories.add("Toiletries");
        categories.add("Other");

        makeNewList(categories);
    }

    public static void makeNewList(ArrayList<String> categories) {
        if (input.yesNo("Would you like to make a new grocery list?")) {
            ArrayList<GroceryItem> groceryList = new ArrayList<>();
            checkAddNewItem(categories, groceryList);
        } else {
            System.out.println("Thank you for using myGroceryList. Have a nice day!");
        }
    }

    public static void checkAddNewItem(ArrayList<String> categories, ArrayList<GroceryItem> groceryList) {
        if (input.yesNo("Would you like to add a new item?")) {
            addNewItem(categories, groceryList);
            checkAddNewItem(categories, groceryList);
        } else {
            // call displayFinalList method
            System.out.println("displaying final list...");
        }
    }

    public static void addNewItem(ArrayList<String> categories, ArrayList<GroceryItem> groceryList) {
        String userCategory = getUserCategory(categories);
        System.out.println("userCategory = " + userCategory);
    }

    public static String getUserCategory(ArrayList<String> categories) {
        System.out.println("");
        System.out.println("Category List:");
        for (int x = 0; x < categories.size(); x++) {
            System.out.println((x + 1) + " - " + categories.get(x));
        }
        int catInt = input.getInt(1, categories.size(), "Please enter the number of the new item's category:");
        switch (catInt) {
            case 1 :
                return "Produce";
            case 2 :
                return "Meat";
            case 3 :
                return "Dairy";
            case 4 :
                return "Beverage";
            case 5 :
                return "Non-Perishables";
            case 6 :
                return "Toiletries";
            case 7 :
                return "Other";
            default :
                return "Other";
        }
    }

}
