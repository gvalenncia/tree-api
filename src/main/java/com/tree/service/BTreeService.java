package com.tree.service;

import com.tree.controller.dto.TreeDTO;
import com.tree.service.domain.BinaryTree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BTreeService {

    private BinaryTree binaryTree;

    @Autowired
    public BTreeService(BinaryTree binaryTree){
        this.binaryTree = binaryTree;
    }

    public TreeDTO createBinaryTree(TreeDTO treeDTO){
        treeDTO.getValues().forEach(value -> this.binaryTree.addValue(value));
        TreeDTO outcome = new TreeDTO();
        outcome.setValues(this.binaryTree.traverseInOrder());

        return outcome;
    }
}
