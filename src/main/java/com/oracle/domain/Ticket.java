package com.oracle.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Table(name="TB_Tickets")
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "select seq_plan.nextval from dual")
	private Integer ticketid;
	private String ticketname;
	private Integer stadiumid;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date begintime;
	private Integer totalcount;
	private Integer ordercount;
	private float price;
	private String descn;
	
	
	public Ticket(Integer ticketid, String ticketname, Integer stadiumid, Date begintime, Integer totalcount,
			Integer ordercount, float price, String descn) {
		super();
		this.ticketid = ticketid;
		this.ticketname = ticketname;
		this.stadiumid = stadiumid;
		this.begintime = begintime;
		this.totalcount = totalcount;
		this.ordercount = ordercount;
		this.price = price;
		this.descn = descn;
	}
	public Ticket() {
		super();
	}
	public Integer getTicketid() {
		return ticketid;
	}
	public void setTicketid(Integer ticketid) {
		this.ticketid = ticketid;
	}
	public String getTicketname() {
		return ticketname;
	}
	public void setTicketname(String ticketname) {
		this.ticketname = ticketname;
	}
	public Integer getStadiumid() {
		return stadiumid;
	}
	public void setStadiumid(Integer stadiumid) {
		this.stadiumid = stadiumid;
	}
	public Date getBegintime() {
		return begintime;
	}
	public void setBegintime(Date begintime) {
		this.begintime = begintime;
	}
	public Integer getTotalcount() {
		return totalcount;
	}
	public void setTotalcount(Integer totalcount) {
		this.totalcount = totalcount;
	}
	public Integer getOrdercount() {
		return ordercount;
	}
	public void setOrdercount(Integer ordercount) {
		this.ordercount = ordercount;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getDescn() {
		return descn;
	}
	public void setDescn(String descn) {
		this.descn = descn;
	}
	@Override
	public String toString() {
		return "Ticket [ticketid=" + ticketid + ", ticketname=" + ticketname + ", stadiumid=" + stadiumid
				+ ", begintime=" + begintime + ", totalcount=" + totalcount + ", ordercount=" + ordercount + ", price="
				+ price + ", descn=" + descn + "]";
	}
	
	public String getBirthdayString() {
		if(this.begintime!=null) {
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
			return sdf.format(this.begintime);
		}
		return null;
	}
	
	

}
