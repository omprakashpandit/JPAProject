package com.pak;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Employee implements Serializable {

	@Id
	private int id;

	private String email;

	private String firstname;

	private String lastname;

	public Employee() {
	}

	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", email=" + email
				+ ", firstname=" + firstname + ", lastname=" + lastname + "]";
	}

}