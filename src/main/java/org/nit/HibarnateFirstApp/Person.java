package org.nit.HibarnateFirstApp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
//@SequenceGenerator(name = "seq_name",initialValue = 10,allocationSize =1 )
public class Person 
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="per_id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name="address")
	private String address;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
}
