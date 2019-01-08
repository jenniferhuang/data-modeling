package com.jennifer.datamodel.practice.data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jennifer.huang on 12/3/18.
 */
public class User {
    public int id;
    public String name;
    public List<Item> userItems = new ArrayList<>();


    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addItem(Item item) {
        userItems.add(item);
    }


}
