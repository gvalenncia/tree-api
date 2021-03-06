package com.tree.service;

import com.tree.controller.dto.TreeDTO;
import com.tree.service.domain.BinaryTree;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.Arrays;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.BDDMockito.given;

@RunWith(MockitoJUnitRunner.class)
public class BTreeServiceTest {

    @Mock
    private BinaryTree binaryTree;

    @InjectMocks
    private BTreeService bTreeService;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(bTreeService);
    }

    @Test
    public void shouldCreateABinaryTreeTest(){
        //given
        given(binaryTree.traverseInOrder()).willReturn(Arrays.asList(49, 70, 84));
        TreeDTO input = new TreeDTO();
        input.addValue(70);
        input.addValue(84);
        input.addValue(49);

        //when
        TreeDTO outcome = this.bTreeService.createBinaryTree(input);

        //then
        Assert.assertArrayEquals(new Integer[]{ 49, 70, 84 }, outcome.getValues().toArray());
    }

    @Test
    public void shouldReturnCommonAnscestorTest(){
        given(this.binaryTree.getCommonAnscestor(anyInt(),anyInt())).willReturn(70);

        int outcome = this.binaryTree.getCommonAnscestor(49,84);

        Assert.assertEquals(70, outcome);
    }
}
