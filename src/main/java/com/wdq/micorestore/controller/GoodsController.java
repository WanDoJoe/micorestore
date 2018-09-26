package com.wdq.micorestore.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class GoodsController {

    @GetMapping(value = "/goods")
    public void listgoods(){

    }

    @GetMapping
    public void findgoods(){

    }

    @RequestMapping(value = "",method = RequestMethod.POST)
    public void add(@RequestBody String body){

    }


}
