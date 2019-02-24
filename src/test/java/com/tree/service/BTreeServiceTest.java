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
import java.util.List;

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
        given(binaryTree.traverseInOrder()).willReturn(Arrays.asList(49, 84, 70));
        TreeDTO input = new TreeDTO();
        input.addValue(84);
        input.addValue(70);
        input.addValue(49);

        //when
        TreeDTO outcome = this.bTreeService.createBinaryTree(input);

        //then
        Assert.assertArrayEquals(mockInOrderTreeDTO().getValues().toArray(), outcome.getValues().toArray());
    }

    private TreeDTO mockInOrderTreeDTO(){
        TreeDTO treeDTO = new TreeDTO();
        treeDTO.addValue(49);
        treeDTO.addValue(84);
        treeDTO.addValue(70);
        return treeDTO;
    }
}
