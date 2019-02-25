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
    public void shouldTraverseInOrderBinaryTreeOf3NodesTest(){
        //when
        this.binaryTree.addValue(70);
        this.binaryTree.addValue(84);
        this.binaryTree.addValue(49);

        List<Integer> outcome = this.binaryTree.traverseInOrder();

        Assert.assertArrayEquals(new Integer[]{ 49, 70, 84 }, outcome.toArray());
    }

    @Test
    public void shouldTraverseInOrderBinaryTreeOf12NodesTest(){
        //when
        this.binaryTree.addValue(70);
        this.binaryTree.addValue(84);
        this.binaryTree.addValue(85);
        this.binaryTree.addValue(78);
        this.binaryTree.addValue(80);
        this.binaryTree.addValue(76);
        this.binaryTree.addValue(49);
        this.binaryTree.addValue(54);
        this.binaryTree.addValue(51);
        this.binaryTree.addValue(37);
        this.binaryTree.addValue(40);
        this.binaryTree.addValue(22);

        List<Integer> outcome = this.binaryTree.traverseInOrder();

        Assert.assertArrayEquals(new Integer[]{ 22, 37, 40, 49, 51, 54, 70, 76, 78, 80, 84, 85 }, outcome.toArray());
    }

    @Test
    public void shouldGetTheCommonAnscestorOf2NodesTest(){
        //when
        this.binaryTree.addValue(70);
        this.binaryTree.addValue(84);
        this.binaryTree.addValue(49);

        int outcome = this.binaryTree.getCommonAnscestor(84, 49);

        Assert.assertEquals(70, outcome);
    }
}
