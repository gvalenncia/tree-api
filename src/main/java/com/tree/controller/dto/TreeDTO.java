package com.tree.controller.dto;

import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;

public class TreeDTO {

    @NotEmpty
    private ArrayList<Integer> values;

    public TreeDTO(){
        this.values = new ArrayList<Integer>();
    }

    public ArrayList<Integer> getValues() {
        return values;
    }

    public void addValue(int value) {
        this.values.add(value);
    }
}
