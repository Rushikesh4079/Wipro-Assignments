package com.rushi.wipro.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="school")
public class School {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private LocalDate id;
	
	private String firstName;
	private String lastName;
	@Column(unique = true)
	private String userName;
	private Gender gender;
	private String address;
	private LocalDate Dob;
	
	public School() {
		super();
	}

	public School(LocalDate id, String firstName, String lastName, String userName, Gender gender, String address,
			LocalDate Dob) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.gender = gender;
		this.address = address;
		this.Dob = Dob;
	}

	public LocalDate getId() {
		return id;
	}

	public void setId(LocalDate localDate) {
		this.id = localDate;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setGender(Gender male) {
		// TODO Auto-generated method stub
		
	}

	public void setDob(LocalDate of) {
		// TODO Auto-generated method stub
		
	}

	public void setAddress(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setGender1(Gender male) {
		// TODO Auto-generated method stub
		
	}

	public void setAddress1(String string) {
		// TODO Auto-generated method stub
    }
}
