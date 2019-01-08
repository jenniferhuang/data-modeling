package com.jennifer.datamodel.practice.data;

/**
 * Created by jennifer.huang on 12/3/18.
 */
public class Item {
    public int id;
    public String itemName;
    public User owner;


    public Item(int id, String itemName, User owner) {
        this.id = id;
        this.itemName = itemName;
        this.owner = owner;
    }
}
