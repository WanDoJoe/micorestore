package com.wdq.micorestore.services;

import com.alibaba.fastjson.JSONObject;

public class BaseServices {

    public static String returnJSONSuccess(Object paramsOb){
        JSONObject object=new JSONObject();
        object.put("data",paramsOb);
        object.put("messge","success");
        object.put("result","success");
        return object.toString();
    }
    public static String returnJSONSuccess(Object paramsOb,String msg){
        JSONObject object=new JSONObject();
        object.put("data",paramsOb);
        object.put("messge",msg);
        object.put("result","success");
        return object.toString();
    }
    public static String returnJSONError(String paramsOb){
        JSONObject object=new JSONObject();
        object.put("result","failed");
        object.put("message",paramsOb);
        return object.toString();
    }
}
