
package com.zensarr.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("stud")
@Scope("singletone")


public class Student{
	@Value("${id}")
	
	private int id;
	@Value("{name}")
	private String name;
	@Value("${cost}")
	private  int cost;
	public Student() {
		super();
	}
	public Student(int id, String name, int cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", cost=" + cost + "]";
	}
	
}