package com.taskdemo.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;


@Entity

@Table(name="consumer_info")
@SQLDelete(sql = "UPDATE consumer_info SET is_active='N' WHERE id=?")
@Where(clause = "is_active='Y'")

public class Consumer {
	
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int consumer_id;
	@Column
	private String consumer_name;
	@Column
	private String consumer_code;
	@Column
	private String Description;
	@Column
	private String isActive;
	public int getConsumer_id() {
		return consumer_id;
	}
	public void setConsumer_id(int consumer_id) {
		this.consumer_id = consumer_id;
	}
	public String getConsumer_name() {
		return consumer_name;
	}
	public void setConsumer_name(String consumer_name) {
		this.consumer_name = consumer_name;
	}
	public String getConsumer_code() {
		return consumer_code;
	}
	public void setConsumer_code(String consumer_code) {
		this.consumer_code = consumer_code;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}

	public String getIsActive() {
		return isActive;
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	
	
	
	public Consumer(int consumer_id, String consumer_name, String consumer_code, String description, String isActive) {
		super();
		this.consumer_id = consumer_id;
		this.consumer_name = consumer_name;
		this.consumer_code = consumer_code;
		Description = description;
		this.isActive = isActive;
	}
	public Consumer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Consumer [consumer_id=" + consumer_id + ", consumer_name=" + consumer_name + ", consumer_code="
				+ consumer_code + ", Description=" + Description + "]";
	}


}
