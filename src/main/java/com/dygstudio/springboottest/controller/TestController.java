package com.dygstudio.springboottest.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: diyaguang
 * @date: 2017/12/30 下午11:44
 * @description: com.dygstudio.springboottest.controller
 */
@RestController
public class TestController
{
    @Value("${book.author}")
    private String bookAuthor;
    @Value("${book.name}")
    private String bookName;
    @RequestMapping("/")
    public String index(){
        return "Hello Spring Boot, book name is:"+bookName+" and book author is:"+bookAuthor;
    }
}
