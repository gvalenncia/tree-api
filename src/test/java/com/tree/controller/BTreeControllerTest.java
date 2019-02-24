package com.tree.controller;

import com.tree.controller.dto.TreeDTO;
import com.tree.service.BTreeService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;

@RunWith(MockitoJUnitRunner.class)
public class BTreeControllerTest {

    @Mock
    private BTreeService bTreeService;

    @InjectMocks
    private BTreeController bTreeController;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(bTreeController);
    }

    @Test
    public void shouldReturnInOrderWhenCreatingBinaryTreeTest(){
        //given
        given(this.bTreeService.createBinaryTree(any())).willReturn(mockInOrderTreeDTO());
        TreeDTO input = new TreeDTO();
        input.addValue(70);
        input.addValue(84);
        input.addValue(49);

        //when
        ResponseEntity<TreeDTO> response = this.bTreeController.postBinaryTree(input);

        //then
        Assert.assertEquals(HttpStatus.OK, response.getStatusCode());
        Assert.assertArrayEquals(new Integer[]{ 49, 70, 84 }, response.getBody().getValues().toArray());
    }

    private TreeDTO mockInOrderTreeDTO(){
        TreeDTO treeDTO = new TreeDTO();
        treeDTO.addValue(49);
        treeDTO.addValue(70);
        treeDTO.addValue(84);
        return treeDTO;
    }
}
