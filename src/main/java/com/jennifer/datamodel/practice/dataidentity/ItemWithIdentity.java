package com.jennifer.datamodel.practice.dataidentity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**
 * Created by jennifer.huang on 12/3/18.
 */
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class ItemWithIdentity {
    public int id;
    public String itemName;
    public UserWithIdentity owner;

    public ItemWithIdentity() {
        super();
    }

    public ItemWithIdentity(final int id, final String itemName, final UserWithIdentity owner) {
        this.id = id;
        this.itemName = itemName;
        this.owner = owner;
    }
}
