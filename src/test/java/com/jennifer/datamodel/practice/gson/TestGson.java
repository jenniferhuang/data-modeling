package com.jennifer.datamodel.practice.gson;

import com.google.gson.Gson;
import com.jennifer.datamodel.practice.data.Item;
import com.jennifer.datamodel.practice.data.User;
import org.junit.Test;

/**
 * Created by jennifer.huang on 12/25/18.
 */
public class TestGson {

    @Test
    public void testSerialize() {
        Gson gson = new Gson();

        User user = new User(1, "John");
        Item item = new Item(2, "book", user);
        user.addItem(item);

        System.out.println(gson.toJson(item));
    }
}
