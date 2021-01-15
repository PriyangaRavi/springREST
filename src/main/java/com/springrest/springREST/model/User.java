package com.springrest.springREST.model;

import java.util.Date;

public class User {
	private Integer id;
	private String name;
	private Date bd;
	
	protected User() {
		
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBd() {
		return bd;
	}
	public void setBd(Date bd) {
		this.bd = bd;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", bd=" + bd + "]";
	}
	public User(Integer id, String name, Date bd) {
		super();
		this.id = id;
		this.name = name;
		this.bd = bd;
	}

}
