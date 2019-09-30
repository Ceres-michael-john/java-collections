package groceries;

import util.Input;

import java.util.ArrayList;

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
        } else {
            displayFinalList(groceryList, categories);
        }
    }

    public static void addNewItem(ArrayList<String> categories, ArrayList<GroceryItem> groceryList) {
        String userCategory = getUserCategory(categories);
         String itemName = getItemName();
         int itemQuantity = getQuantity();
         groceryList.add(new GroceryItem(itemName, itemQuantity, userCategory));
        checkAddNewItem(categories, groceryList);
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
    
    public static String getItemName(){
        return input.getString("What is the name of the new item?");
    }
    
    public static int getQuantity(){
        return input.getInt("How many of the item do you need?");
    }

    public static void displayFinalList(ArrayList<GroceryItem> groceryList, ArrayList<String> categories){

        for(String category : categories){
         ArrayList<String> nameHolderArray = new ArrayList<>();
         ArrayList<Integer> quantHolderArray = new ArrayList<>();
        for (int y = 0; y < groceryList.size(); y++){
           if (category.equals(groceryList.get(y).getCategory())){
               nameHolderArray.add(groceryList.get(y).getName());
               quantHolderArray.add(groceryList.get(y).getQuantity());
           }
        }
        nameHolderArray.sort(String::compareToIgnoreCase);

            System.out.println(" -- " + category + " -- ");
            for (int z = 0; z < nameHolderArray.size(); z++){
                System.out.println(nameHolderArray.get(z) + ": " + quantHolderArray.get(z));
            }

        }

        System.out.println("");
        System.out.println("Have a nice day!!!");

    }

}
