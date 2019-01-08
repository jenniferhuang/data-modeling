package com.jennifer.datamodel.practice.dataidentityandref;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jennifer.huang on 12/3/18.
 */
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class UserWithIdentityAndRef {
    public int id;
    public String name;
//    @JsonBackReference
    public List<ItemWithIdentityAndRef> userItems; //can't de & se?????  , needn't  JsonBackReference

    public UserWithIdentityAndRef() {
        super();
    }

    public UserWithIdentityAndRef(final int id, final String name) {
        this.id = id;
        this.name = name;
        userItems = new ArrayList<ItemWithIdentityAndRef>();
    }

    public void addItem(final ItemWithIdentityAndRef item) {
        userItems.add(item);
    }


}
