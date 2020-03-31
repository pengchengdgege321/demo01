package com.oracle.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.oracle.domain.Ticket;
import com.oracle.domain.User;
import com.oracle.domain.Users;
import com.oracle.dto.UserDto;

public interface TicketService {
	//查询所有
	public List<Ticket> ticketSearch();
	//新增门票信息、
	public Integer sevaadd(Ticket ticket);
	//修改门票信息
	public Ticket updateId(Integer id);
	//门票修改进行中
	public Integer saveupdate(Ticket tickets);
	//删除门票信息
	public Integer savedelete(Integer id);
	
	 /**
	   * 用户分页
	   * @param userDto
	   * @return
	   */
	public PageInfo<User> findPages(UserDto userDto);
	
	//Users添加
	public boolean save(Users user);
	
	//查询Users用户
	public List<Users> UsersSearch();
	
}
