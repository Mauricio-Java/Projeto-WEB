package com.example.Prep_for_test.entities;

import java.io.Serializable;

public class User implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	private Long Id;
	private String name;
	private String email;
	private String phone;
	private String password;
	
	
    public User() {
    }


	public User(Long id, String name, String email, String phone, String password) {
		super();
		Id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}


	public Long getId() {
		return Id;
	}


	public void setId(Long id) {
		Id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "User [Id=" + Id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", password=" + password
				+ "]";
	}
    
    
    
    }
