package com.tree.controller.dto;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

public class TreeDTO {

    @NotEmpty
    @ApiModelProperty(notes = "The elements to insert into the binary tree. ", required = true)
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
