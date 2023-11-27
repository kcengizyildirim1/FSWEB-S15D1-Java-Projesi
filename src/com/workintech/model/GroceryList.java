package com.workintech.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GroceryList {
    private ArrayList<String> items;

    public GroceryList() {
        this.items = new ArrayList<>();
    }



    public boolean checkItemIsInList(String item) {
        return items.contains(item);
    }



    public  void addItems(String items) {
            String[] splitItem = splitItems(items);
            for(String item: splitItem){
                String trimmedItem = item.trim();
                if (!checkItemIsInList(trimmedItem)) {
                    this.items.add(trimmedItem);
                }
            }
        Collections.sort(this.items);
        System.out.println("Items added successfully");
    }
    private static String[] splitItems(String items) {
        String[] splitItems = items.split(",");
        return splitItems;
    }

    public void removeItems(String items) {
        String[] splitItems = splitItems(items);
        for (String item : splitItems) {
            String trimmedItem = item.trim();
            if (!checkItemIsInList(trimmedItem)) {
                System.out.println("Bu item zaten mevcut değil: " + item);
            } else {
                this.items.remove(trimmedItem);
                //sortItems();
            }
        }
    }
    public void printSorted(){
        System.out.println("Mevcut pazar listesi: ");
        for (String item : this.items){
            System.out.println(item);
        }
    }

    @Override
    public String toString() {
        return "GroceryList{" +
                "items=" + items +
                '}';
    }
}
