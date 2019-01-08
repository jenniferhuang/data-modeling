package com.jennifer.datamodel.practice.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jennifer.datamodel.practice.dataidentity.ItemWithIdentity;
import com.jennifer.datamodel.practice.datareference.ItemWithRef;
import com.jennifer.datamodel.practice.datareference.UserWithRef;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

/**
 * Created by jennifer.huang on 12/3/18.
 */
public class TestDeserializeBiDirection {


    @Test
    public void givenBidirectionRelation_whenDeserializingWithIdentity_thenCorrect()
            throws JsonProcessingException, IOException {
        final String json = "{\"id\":2,\"itemName\":\"book\",\"owner\":{\"id\":1,\"name\":\"John\",\"userItems\":[2]}}";

        final ItemWithIdentity item = new ObjectMapper().readerFor(ItemWithIdentity.class)
                .readValue(json);

        assertEquals(2, item.id);
        assertEquals("book", item.itemName);
        assertEquals("John", item.owner.name);
    }
}
