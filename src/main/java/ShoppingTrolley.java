import java.util.ArrayList;

public class ShoppingTrolley {
    private ArrayList<String> itemList = new ArrayList<>();

    public void addItem(String item){
        itemList.add(item);
    }

    public int itemCount(){
        return itemList.size();
    }

    public boolean itemInTrolley(String item){
        return itemList.contains(item);
    }
}

//Create a class to represent a ShoppingTrolley. Each trolley should be able to hold multiple items which we will represent here using strings - eg. "milk", "bread"`, etc. A new trolley should be empty when it is created.
//Write a method to add an item to the trolley.
//Write a method to count the number of items in the trolley.
//Write a method which checks if an item is in the trolley.
