package com.example.multiplescreens;

public class RoomHandler {

    // Singleton instance for the maze rooms and their contents
    private static Room ROOMS = null;

    public static Inventory getInstance() {
        if (INVENTORY == null) {
            INVENTORY = new Inventory();
        }
        return (INVENTORY);
    }

}
