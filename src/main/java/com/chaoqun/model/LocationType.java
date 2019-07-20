package com.chaoqun.model;

import lombok.Getter;

public enum LocationType {

    ROOM_1(1, "room_1"),
    ROOM_2(2, "room_2"),
    ;

    @Getter
    private int value;
    @Getter
    private String description;

    LocationType(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public static LocationType getByValue(int value) {
        LocationType[] locations = LocationType.values();
        for(LocationType location : locations) {
            if (location.getValue() == value) {
                return location;
            }
        }
        throw new IllegalArgumentException();
    }

}
