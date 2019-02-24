package com.tree.service;

import com.tree.controller.dto.TreeDTO;
import org.springframework.stereotype.Service;

@Service
public class BTreeService {

    public TreeDTO createBinaryTree(TreeDTO treeDTO){

        TreeDTO outcome = new TreeDTO();
        outcome.addValue(49);
        outcome.addValue(84);
        outcome.addValue(70);

        return outcome;
    }
}
