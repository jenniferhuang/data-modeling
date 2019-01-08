package com.jennifer.datamodel.practice.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jennifer.datamodel.practice.datareference.ItemWithRef;
import com.jennifer.datamodel.practice.datareference.UserWithRef;
import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Created by jennifer.huang on 12/3/18.
 */
public class TestSerializeBiDirectionWithRef {

    @Test
    public void givenBidirectionRelation_whenSerializing_thenException() throws JsonProcessingException {
        UserWithRef user = new UserWithRef(1, "John");
        ItemWithRef itemWithRef = new ItemWithRef(2, "book", user);
        user.addItem(itemWithRef);
        String result = new ObjectMapper().writeValueAsString(itemWithRef);
        System.out.println(result);
        assertThat(result, containsString("book"));
        assertThat(result, containsString("John"));
        assertThat(result, not(containsString("userItemTransients")));
    }
}
