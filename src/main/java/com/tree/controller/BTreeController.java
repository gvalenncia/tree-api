package com.tree.controller;

import com.tree.controller.dto.TreeDTO;
import com.tree.service.BTreeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("tree-api/v1/")
@Api(value="Binary Tree Controller", description="Operations to interact with the binary tree")
public class BTreeController {

    private BTreeService bTreeService;

    @Autowired
    public BTreeController(BTreeService bTreeService){
        this.bTreeService = bTreeService;
    }

    @ApiOperation(value = "Create a binary tree", response = TreeDTO.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Binary tree created successfully. The Response Body will " +
                    "represent the tree InOrder traversal.")
    })
    @PostMapping("/trees")
    public ResponseEntity<TreeDTO> postBinaryTree(@RequestBody @Valid TreeDTO treeDTO){

        TreeDTO outcome = this.bTreeService.createBinaryTree(treeDTO);

        return ResponseEntity.ok().body(outcome);
    }

    @ApiOperation(value = "Get the common anscestor given 2 elements of the tree", response = Integer.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "The common anscestor")
    })
    @GetMapping("/ancestor")
    public ResponseEntity<Integer> getCommonAnscestor(@RequestParam("n1")int n1, @RequestParam("n2")int n2){

        int outcome = this.bTreeService.findCommonAncsestor(n1, n2);

        return ResponseEntity.ok().body(outcome);
    }
}
