package com.tree.controller.dto;

import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

public class TreeDTO {

    @NotEmpty
    private List<Integer> values;

    public TreeDTO(){
        this.values = new ArrayList<Integer>();
    }

    public List<Integer> getValues() {
        return values;
    }

    public void addValue(int value) {
        this.values.add(value);
    }

    public void setValues(List<Integer> values) {
        this.values = values;
    }
}
