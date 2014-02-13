package com.bean;

public class Persona{
	private String name;
	private int age;
	
	public Persona(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public Persona(){}
	
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	
	public void setAge(int a){
		age = a;
	}
	
	public void setNombre(String n){
		name = n;
	}

}