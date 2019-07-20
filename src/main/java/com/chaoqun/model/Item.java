package com.chaoqun.model;

import lombok.Data;
import org.springframework.web.bind.annotation.RequestParam;

@Data
public class Item {
    private String url;
    private int location;
    private String input;
    private String output;
    private String callBack;
    private int operation;
}
