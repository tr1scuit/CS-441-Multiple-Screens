package com.example.multiplescreens;

import java.util.ArrayList;
import java.util.List;

// A maze room
public class Room {

    private int gold;
    private ArrayList<String> items;
    private String desc;

    public Room(int coin, ArrayList<String> things, String description){
        gold = coin;
        items = things;
        desc = description;
    }

    public int takeCoin(){
        int taken = gold;
        gold = 0;
        return taken;
    }

    public ArrayList<String> takeThings(){
        ArrayList<String> taken = new ArrayList<String>();
        for(String x : items){
            taken.add(x);
        }
        for (int x = 0; x < taken.size(); x++){
            items.remove(0);
        }
        return taken;
    }

    public ArrayList<String> getItems(){
        return this.items;
    }

    public String getDescription(){
        return desc;
    }

}
