package com.shopping;

public class watch {
	private int id;

	private String name;
	private String brand;
	private int model;
	private float cost;
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
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	
	public watch(String name, String brand, int model, float cost) {
		super();
		this.name = name;
		this.brand = brand;
		this.model = model;
		this.cost = cost;
	}
	public watch() {
		
	}
	
	@Override
	public String toString() {
		return "watch [name=" + name + ", brand=" + brand + ", model=" + model + ", cost=" + cost + "]";
	}
	
}
