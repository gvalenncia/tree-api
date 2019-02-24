package com.tree.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tree-api/v1/")
public class BTreeController {

    @PostMapping("/trees")
    public ResponseEntity<String> postBinaryTree(@RequestBody String input){
        return ResponseEntity.ok().body("");
    }
}
