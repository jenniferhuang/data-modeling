package com.jennifer.datamodel.practice.datareference;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jennifer.huang on 12/3/18.
 */

public class UserWithRef {
    public int id;
    public String name;
    @JsonBackReference
    public List<ItemWithRef> userItemWithRefs = new ArrayList<>();


    public UserWithRef(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addItem(ItemWithRef itemWithRef) {
        userItemWithRefs.add(itemWithRef);
    }


}
