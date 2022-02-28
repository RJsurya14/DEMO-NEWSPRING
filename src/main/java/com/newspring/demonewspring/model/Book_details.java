package com.newspring.demonewspring.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book_details{
	@Id
	private int id;
	private String name;
	private String tech;
	
	
	public Book_details() {
		super();
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
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", tech=" + tech;
	}
	
	
}