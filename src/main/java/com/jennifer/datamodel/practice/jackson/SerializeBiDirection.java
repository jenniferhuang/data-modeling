package com.jennifer.datamodel.practice.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jennifer.datamodel.practice.data.Item;
import com.jennifer.datamodel.practice.data.User;

/**
 * Created by jennifer.huang on 12/3/18.
 */
public class SerializeBiDirection {

//    @Test
    public void givenBidirectionRelation_whenSerializing_thenException() throws JsonProcessingException {
        User user = new User(1, "John");
        Item item = new Item(2, "book", user);
        user.addItem(item);
        new ObjectMapper().writeValueAsString(item);

    }
}
