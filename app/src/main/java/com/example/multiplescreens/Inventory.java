package com.example.multiplescreens;

import java.util.ArrayList;

// Very basic inventory system for this maze app

public class Inventory {

    private int gold;
    private ArrayList<String> items;

    public Inventory(){
        gold = 0;
        items = new ArrayList<String>();
    }

    public void setGold(int amt){
        gold = amt;
    }
    public void addGold(int amt) { gold += amt;}
    public int getGold(){
        return this.gold;
    }

    public void addItem(String item){
        items.add(item);
    }

    public String removeItem(int a) {
        if (items.size() >= a) {
            return "Wrong slot!";
        } else {
            return items.remove(a);
        }
    }

    public String getItem(int a){
        if(items.size() >= a){
            return "Wrong slot!";
        } else {
            return items.get(a);
        }
    }

    public void clearInventory(){
        while(items.size()>0){
            items.remove(0);
        }
    }
    public String getInventory(){
        return items.toString();
    }
}


