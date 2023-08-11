package com.imaginnovate.task.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "phoneNo")
public class PhoneNo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long phnoID;
	private String phoneno;

	public PhoneNo(Long phnoID, String phoneno) {
		super();
		this.phnoID = phnoID;
		this.phoneno = phoneno;
	}

	public PhoneNo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getPhnoID() {
		return phnoID;
	}

	public void setPhnoID(Long phnoID) {
		this.phnoID = phnoID;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	@Override
	public String toString() {
		return "PhoneNo [phnoID=" + phnoID + ", phoneno=" + phoneno + "]";
	}

}
