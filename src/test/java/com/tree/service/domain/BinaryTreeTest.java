package com.tree.service.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class BinaryTreeTest {

    @InjectMocks
    private BinaryTree binaryTree;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(binaryTree);
    }

    @Test
    public void shouldTraverseInOrderTest(){
        //given
        this.binaryTree.addValue(84);
        this.binaryTree.addValue(78);
        this.binaryTree.addValue(49);

        //when
        List<Integer> outcome = this.binaryTree.traverseInOrder();

        //then
        Assert.assertArrayEquals(new Integer[]{49, 78, 84}, outcome.toArray());
    }

}
