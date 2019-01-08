package com.jennifer.datamodel.practice.datareference;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**
 * Created by jennifer.huang on 12/3/18.
 */
public class ItemWithRef {
    public int id;
    public String itemName;
    @JsonManagedReference
    public UserWithRef owner;


    public ItemWithRef(int id, String itemName, UserWithRef owner) {
        this.id = id;
        this.itemName = itemName;
        this.owner = owner;
    }
}
