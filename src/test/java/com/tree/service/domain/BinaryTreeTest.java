package com.tree.service.domain;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BinaryTreeTest {

    @InjectMocks
    private BinaryTree binaryTree;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(binaryTree);
    }



}
