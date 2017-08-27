package com.example.controller;

import com.example.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 文件描述:
 * Created with IntelliJ IDEA.
 * 创建者: sean
 * 创建时间: 2017/8/26 20:05
 */
@RestController
@RequestMapping("hello")
public class HelloController {

//    @Value("${cupSize}")
//    private String cupSize;
//
//    @Value("${age}")
//    private Integer age;
//
//    @Value("${content}")
//    private String content;

    @Autowired
    private GirlProperties girlProperties;
    @RequestMapping(value = "/say", method = RequestMethod.POST)
    public String say(){
//        return "Hello Spring Boot!";
//        return content;
        return girlProperties.getCupSize();
//        return  "index";
    }
    //restfull风格的URL:/show/123213
    @RequestMapping(value = "/show/{id}",method = RequestMethod.GET)
    public String show(@PathVariable("id") Integer id){
        return "id:"+id;
    }

    //具有默认值的传统风格的URL:/show?id=50943
//    @RequestMapping(value = "/talk",method = RequestMethod.GET)
    //简写RequestMapping
    @GetMapping(value = "/talk")
    public String showTalk(@RequestParam(value = "id",required = false,defaultValue = "12") Integer id){
        return "id:"+id;
    }

    //传统风格的URL:/show?id=50943
    @RequestMapping(value = "/s",method = RequestMethod.GET)
    public String s(@RequestParam("id") Integer id){
        return "id:"+id;
    }
}
