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
    public void shouldAddValueInLeftNodeTest(){
        //when
        this.binaryTree.addValue(70);
        this.binaryTree.addValue(49);

        //then
        Assert.assertEquals(49, this.binaryTree.getRoot().getLeft().getValue());
    }

    @Test
    public void shouldAddValueInRightNodeTest(){
        //when
        this.binaryTree.addValue(70);
        this.binaryTree.addValue(84);

        //then
        Assert.assertEquals(84, this.binaryTree.getRoot().getRight().getValue());
    }

    @Test
    public void shouldTraverseInOrderBinaryTreeTest(){
        //when
        this.binaryTree.addValue(70);
        this.binaryTree.addValue(84);
        this.binaryTree.addValue(49);

        List<Integer> outcome = this.binaryTree.traverseInOrder();

        Assert.assertArrayEquals(new Integer[]{ 49, 70, 84 }, outcome.toArray());
    }
}
