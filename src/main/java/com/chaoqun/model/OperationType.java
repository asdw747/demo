package com.chaoqun.model;

import lombok.Getter;

public enum OperationType {

    QUERY(1, "查询"),
    OTHER(2, "其它"),
    ;

    @Getter
    private int value;
    @Getter
    private String description;

    OperationType(int value, String description) {
        this.value = value;
        this.description = description;
    }

}
