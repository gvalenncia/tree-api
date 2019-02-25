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

    public int getCommonAnscestor(int n1, int n2) {
        return findCommonAnscestor(root, n1, n2).getValue();
    }

    private Node findCommonAnscestor(Node node, int n1, int n2){
        if (node == null)
            return null;

        if (node.getValue() == n1 || node.getValue() == n2)
            return node;

        Node leftCA = findCommonAnscestor(node.getLeft(), n1, n2);
        Node rightCA = findCommonAnscestor(node.getRight(), n1, n2);

        if (leftCA!=null && rightCA!=null)
            return node;

        return (leftCA != null) ? leftCA : rightCA;
    }
}