package com.jennifer.datamodel.practice.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jennifer.datamodel.practice.dataidentityandref.ItemWithIdentityAndRef;
import com.jennifer.datamodel.practice.dataidentityandref.UserWithIdentityAndRef;
import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Created by jennifer.huang on 12/25/18.
 */
public class TestSerializeAndDeserialize {

    @Test
    public void givenBidirectionRelation_whenDeserializingWithIdentity_thenCorrect()
            throws JsonProcessingException, IOException {
        final String json = "{\"id\":2,\"itemName\":\"book\",\"owner\":{\"id\":1,\"name\":\"John\",\"userItems\":[2]}}";

        final ItemWithIdentityAndRef item = new ObjectMapper().readerFor(ItemWithIdentityAndRef.class)
                .readValue(json);

        assertEquals(2, item.id);
        assertEquals("book", item.itemName);
        assertEquals("John", item.owner.name);
    }


    @Test
    public void givenBidirectionRelation_whenSerializing_thenException() throws JsonProcessingException {
        UserWithIdentityAndRef user = new UserWithIdentityAndRef(1, "John");
        ItemWithIdentityAndRef item = new ItemWithIdentityAndRef(2, "book", user);
        user.addItem(item);
        String result = new ObjectMapper().writeValueAsString(item);
        System.out.println(result);
        assertThat(result, containsString("book"));
        assertThat(result, containsString("John"));
        assertThat(result, not(containsString("userItemTransients")));
    }




}
