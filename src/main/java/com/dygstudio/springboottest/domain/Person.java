package com.dygstudio.springboottest.domain;

/**
 * @author: diyaguang
 * @date: 2018/01/02 上午11:59
 * @description: com.dygstudio.springboottest.domain
 */
public class Person {
    private String name;
    private Integer age;

    public Person() {
        super();
    }

    public Person(String name,Integer age){
        super();
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Integer getAge(){
        return age;
    }
    public void setAge(Integer age){
        this.age = age;
    }
}
