package com.tree.service.domain;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {

    private Node root;

    public Node getRoot(){
        return root;
    }

    public void addValue(int value){
        this.root = insert(root, value);
    }

    public List<Integer> traverseInOrder(){
        ArrayList<Integer> values = new ArrayList<Integer>();
        inOrder(values, root);
        return values;
    }

    private Node insert(Node root, int value){
        if(root == null){
            return new Node(value);
        } else if (value < root.getValue()){
            root.setLeft(insert(root.getLeft(), value));
        } else if (value > root.getValue()) {
            root.setRight(insert(root.getRight(), value));
        }
        return root;
    }

    private void inOrder(List<Integer> values, Node node){
        if(node == null){
            return;
        }
        inOrder(values, node.getLeft());
        values.add(node.getValue());
        inOrder(values, node.getRight());
    }

}