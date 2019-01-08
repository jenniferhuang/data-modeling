package com.jennifer.datamodel.practice.dataidentityandref;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**
 * Created by jennifer.huang on 12/3/18.
 */
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class ItemWithIdentityAndRef {
    public int id;
    public String itemName;
//    @JsonManagedReference
    public UserWithIdentityAndRef owner;

    public ItemWithIdentityAndRef() {
        super();
    }

    public ItemWithIdentityAndRef(final int id, final String itemName, final UserWithIdentityAndRef owner) {
        this.id = id;
        this.itemName = itemName;
        this.owner = owner;
    }
}
