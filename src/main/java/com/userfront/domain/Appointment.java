package com.userfront.domain;

import java.util.Date;

public class Appointment {
	
	private Long id;
	private Date date;
	private String location;
	private String description;
	private boolean confirmed;
	
	private User user;

	public Long getId() {
		return id;
	}

	public Date getDate() {
		return date;
	}

	public String getLocation() {
		return location;
	}

	public String getDescription() {
		return description;
	}

	public boolean isConfirmed() {
		return confirmed;
	}

	public User getUser() {
		return user;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setConfirmed(boolean confirmed) {
		this.confirmed = confirmed;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
