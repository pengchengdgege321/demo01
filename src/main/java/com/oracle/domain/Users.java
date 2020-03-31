package com.oracle.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="p_users")
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "select seq_pusers.nextval from dual")
	private Integer id;
	private String uname;
	private String upwd;
	private String pothe;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public String getPothe() {
		return pothe;
	}
	public void setPothe(String pothe) {
		this.pothe = pothe;
	}
	public Users(Integer id, String uname, String upwd, String pothe) {
		super();
		this.id = id;
		this.uname = uname;
		this.upwd = upwd;
		this.pothe = pothe;
	}
	public Users() {
		super();
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", uname=" + uname + ", upwd=" + upwd + ", pothe=" + pothe + "]";
	}
	
	
}
