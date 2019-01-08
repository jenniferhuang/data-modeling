package com.jennifer.datamodel.practice.gson;

import com.google.gson.Gson;
import com.jennifer.datamodel.practice.datatransient.ItemTransient;
import com.jennifer.datamodel.practice.datatransient.UserTransient;
import org.junit.Test;

/**
 * Created by jennifer.huang on 12/25/18.
 */
public class TestGsonTransient {

    @Test
    public void testSerialize() {
        Gson gson = new Gson();

        UserTransient user = new UserTransient(1, "John");
        ItemTransient item = new ItemTransient(2, "book", user);
        user.addItem(item);

        System.out.println(gson.toJson(item));
    }
}
