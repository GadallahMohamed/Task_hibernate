package com.task.app.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String orderName;
	
	private int orderNubmer;
	
	@ManyToMany(mappedBy = "orders")
	private List<Customer> customers = new ArrayList();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public int getOrderNubmer() {
		return orderNubmer;
	}

	public void setOrderNubmer(int orderNubmer) {
		this.orderNubmer = orderNubmer;
	}
	

}
