package com.chaoqun.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.chaoqun.model.Item;
import com.chaoqun.model.LocationType;
import com.chaoqun.model.OperationType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@Controller
@RequestMapping(value = "home")
public class HomeController {

    @GetMapping(value = "info.do", produces = "application/json; charset=utf-8")
    @ResponseBody
    public JSONObject getInfo() {
        JSONObject result = new JSONObject();

        LocationType [] locationTypes = LocationType.values();
        JSONArray locationArray = new JSONArray();
        for (LocationType locationType : locationTypes) {
            JSONObject object = new JSONObject();
            object.put("value", locationType.getValue());
            object.put("desc", locationType.getDescription());
            locationArray.add(object);
        }
        result.put("locations", locationArray);

        OperationType [] operationTypes = OperationType.values();
        JSONArray operationArray = new JSONArray();
        for (OperationType operationType : operationTypes) {
            JSONObject object = new JSONObject();
            object.put("value", operationType.getValue());
            object.put("desc", operationType.getDescription());
            operationArray.add(object);
        }
        result.put("operations", operationArray);
        return result;
    }

    @PostMapping(value = "check.do", produces = "application/json; charset=utf-8")
    @ResponseBody
    public JSONObject check(Item item) {
        JSONObject result = new JSONObject();
        result.put("result", "ok");
        return result;
    }

}
