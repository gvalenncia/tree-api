package com.tree.controller;

import com.tree.controller.dto.TreeDTO;
import com.tree.service.BTreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("tree-api/v1/")
public class BTreeController {

    private BTreeService bTreeService;

    @Autowired
    public BTreeController(BTreeService bTreeService){
        this.bTreeService = bTreeService;
    }

    @PostMapping("/trees")
    public ResponseEntity<TreeDTO> postBinaryTree(@RequestBody @Valid TreeDTO treeDTO){

        TreeDTO outcome = this.bTreeService.createBinaryTree(treeDTO);

        return ResponseEntity.ok().body(outcome);
    }
}
