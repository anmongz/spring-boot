package com.am.springboot.model;

import lombok.Data;

import java.util.Objects;

@Data
public class PropDataBean {

    private String prop;
    private String value;
    private boolean csv;

    public PropDataBean(String prop, String value, boolean csv) {
        this.prop = prop;
        this.value = value;
        this.csv = csv;
    }

    @Override
    public String toString() {
        return "prop='" + this.prop ;
    }
}