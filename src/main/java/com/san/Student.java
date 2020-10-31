package com.san;

public class Student {
    private String name;
    private int id ;
    public Student(String name, int id ){
        this.name=name;
        this.id=id;
    }


    public void setName(String name){
	this.name=name;
    }
    public String  getName(String name){
	return name;
    }
}
