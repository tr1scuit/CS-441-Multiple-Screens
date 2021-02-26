package com.example.multiplescreens;

public class InventoryHandler {

    // Singleton instance for the player's inventory - there's only one to worry about in this app
    private static Inventory INVENTORY = null;

    public static Inventory getInstance() {
        if (INVENTORY == null) {
            INVENTORY = new Inventory();
        }
            return (INVENTORY);
    }

    public static void resetInstance(){
        if (INVENTORY != null){
            INVENTORY = null;
        }
    }

}
