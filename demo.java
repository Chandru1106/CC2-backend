package com.example.project.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="info")
public class demo {
	@Id
	@Column(name="aid")
	private int aid;
	@Column(name="aname")
	private String aname;
	@Column(name="acount")
	private int acount;
	@Column(name="email")
	private String email;
	@Column(name="phoneno")
	private int phoneno;
	@Column(name="adistrict")
	private String adistrict;
	public int getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}
	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public int getAcount() {
		return acount;
	}

	public void setAcount(int acount) {
		this.acount = acount;
	}

	public String getAdistrict() {
		return adistrict;
	}

	public void setAdistrict(String adistrict) {
		this.adistrict = adistrict;
	}
	

	public demo(int aid, String aname, int acount, String email, int phoneno, String adistrict) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.acount = acount;
		this.email = email;
		this.phoneno = phoneno;
		this.adistrict = adistrict;
	}

	public String toString() {
		return "aid="+aid+"aname="+aname+"acount="+acount+"email="+email+"phoneno="+phoneno+"adistrict="+adistrict;
	}
	public demo(){
		
	}
}
