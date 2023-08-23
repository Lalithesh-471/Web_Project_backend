package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Chocolate
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String Name;
	private String type;
	private String price;
	private String Quantity;
	private String occation;
	private String avalability;
	
	@Column(length=1000000)
	private byte[] image;
	public Chocolate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Chocolate(int id, String name, String type, String price, String quantity, String occation,
			String avalability, byte[] image) {
		super();
		this.id = id;
		Name = name;
		this.type = type;
		this.price = price;
		Quantity = quantity;
		this.occation = occation;
		this.avalability = avalability;
		this.image = image;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getQuantity() {
		return Quantity;
	}
	public void setQuantity(String quantity) {
		Quantity = quantity;
	}
	public String getOccation() {
		return occation;
	}
	public void setOccation(String occation) {
		this.occation = occation;
	}
	public String getAvalability() {
		return avalability;
	}
	public void setAvalability(String avalability) {
		this.avalability = avalability;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
}