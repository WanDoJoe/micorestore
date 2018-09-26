package com.wdq.micorestore.controller;

import com.wdq.micorestore.services.IUserServices;
import com.wdq.micorestore.utils.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    IUserServices iUserServices;

    @GetMapping(value = "/login/{name}/{password}")
    public Object login(@PathVariable(value = "name")String username, @PathVariable(value = "password")String password){
        Log.e("aaa："+username+"-"+password);
        Log.e(iUserServices.login(username,password));
        return iUserServices.login(username,password) ;//"aaa："+username+"-"+password;
    }

}
