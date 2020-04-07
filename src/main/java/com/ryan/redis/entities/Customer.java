package com.ryan.redis.entities;

import java.io.Serializable;

public class Customer implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;
	private String firstname;
	private String lastname;
	
	public Customer(long id, String firstname, String lastname) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	@Override
	  public String toString() {
	    return String.format("Customer[id=%d, firstName='%s', lastName='%s']", id, firstname, lastname);
	  }
}
