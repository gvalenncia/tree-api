package com.tree.controller;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.ResponseEntity;

@RunWith(MockitoJUnitRunner.class)
public class BTreeControllerTest {

    private BTreeController bTreeController;

    @Before
    public void init(){
        this.bTreeController = new BTreeController();
    }

    @Test
    public void shouldReturnInOrderWhenCreatingBinaryTree(){

        ResponseEntity<String> outcome = this.bTreeController.postBinaryTree("");

        Assert.assertEquals("", outcome.getBody());
    }
}
