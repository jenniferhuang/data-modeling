package com.jennifer.datamodel.practice.datatransient;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jennifer.huang on 12/3/18.
 */
public class UserTransient {
    public int id;
    public String name;
    public List<ItemTransient> userItemTransients = new ArrayList<>();


    public UserTransient(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addItem(ItemTransient itemTransient) {
        userItemTransients.add(itemTransient);
    }


}
