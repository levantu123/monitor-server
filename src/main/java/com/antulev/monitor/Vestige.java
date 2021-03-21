package com.antulev.monitor;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Vestige {
	
	@Id
	private String id;
	
	private String vehicalId;
	
	private double accelerate;
	
	private double speed; 
	
	private double lat; 
	
	private double lng; 
	
	private boolean active;
	
	private Date createdDate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getVehicalId() {
		return vehicalId;
	}

	public void setVehicalId(String vehicalId) {
		this.vehicalId = vehicalId;
	}

	public double getAccelerate() {
		return accelerate;
	}

	public void setAccelerate(double accelerate) {
		this.accelerate = accelerate;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLng() {
		return lng;
	}

	public void setLng(double lng) {
		this.lng = lng;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

}
