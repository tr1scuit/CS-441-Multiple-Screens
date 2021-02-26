package com.example.multiplescreens;

import java.util.ArrayList;

public class RoomHandler {

    // Singleton instance for the maze rooms and their contents
    // Not the best way to instantiate our rooms, but at least it's all in one place.
    private static ArrayList<Room> ROOMS = null;

    public static ArrayList<Room> getInstance() {
        if (ROOMS == null) {
            ROOMS = new ArrayList<Room>();
            // rooms added
            ROOMS.add(new Room(10, new ArrayList<String>(), "The first room. Brightly lit, a faint smell of ash in front of you. Inside, you find gold coins and a sword."));
            ROOMS.get(0).getItems().add("Sword");
            ROOMS.add(new Room(0, new ArrayList<String>(), "This room is faintly lit, ."));
            //ROOMS.get(1).getItems().add("Sword");
            ROOMS.add(new Room(40, new ArrayList<String>(), "This is a room C."));
            //ROOMS.get(2).getItems().add("Sword");
            ROOMS.add(new Room(20, new ArrayList<String>(), "You hear birds and smell a faint petrichor beyond the door. If only you had a key..."));
            //ROOMS.get(3).getItems().add("Sword");
            ROOMS.add(new Room(10, new ArrayList<String>(), "This is a room E. A burnt torch."));
            ROOMS.get(4).getItems().add("Torch");
            ROOMS.add(new Room(80, new ArrayList<String>(), "This is a room F."));
            //ROOMS.get(5).getItems().add("Torch");
            ROOMS.add(new Room(100, new ArrayList<String>(), "This is a room G."));
            //ROOMS.get(6).getItems().add("Key B");
            ROOMS.add(new Room(40, new ArrayList<String>(), "This is a room H."));
            //ROOMS.get(7).getItems().add("Key B");
            ROOMS.add(new Room(50, new ArrayList<String>(), "This is a room I."));
            //ROOMS.get(8).getItems().add("Key B");
            ROOMS.add(new Room(30, new ArrayList<String>(), "This is a room J."));
            //ROOMS.get(9).getItems().add("Key B");
            ROOMS.add(new Room(90, new ArrayList<String>(), "This is a room K."));
            //ROOMS.get(10).getItems().add("Key B");
            ROOMS.add(new Room(80, new ArrayList<String>(), "You've entered a cellar of wine, with a chest to your right. Inside the chest is gold and a key!"));
            ROOMS.get(11).getItems().add("Key");
            ROOMS.add(new Room(80, new ArrayList<String>(), "FREEDOM!"));
        }
        return (ROOMS);
    }

    public static void resetInstance(){
        if (ROOMS != null){
            ROOMS = null;
        }
    }

}
