package com.oracle.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.oracle.dao.TicketDao;
import com.oracle.dao.UserDao;
import com.oracle.dao.UsersDao;
import com.oracle.domain.Ticket;
import com.oracle.domain.User;
import com.oracle.domain.Users;
import com.oracle.dto.UserDto;
import com.oracle.service.TicketService;

import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;

@Service
public class TicketsServiceImpl implements TicketService {

	@Autowired
	private TicketDao ticketDao;
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private UsersDao usersDao;

	// 查询所有
	@Override
	public List<Ticket> ticketSearch() {
		// TODO Auto-generated method stub
		return this.ticketDao.selectAll();
	}

	// 新增门票信息
	@Override
	public Integer sevaadd(Ticket ticket) {
		// TODO Auto-generated method stub
		ticket.setTotalcount(1000);
		ticket.setOrdercount(0);
		return this.ticketDao.insert(ticket);
	}

	// 修改门票信息
	@Override
	public Ticket updateId(Integer id) {
		// TODO Auto-generated method stub
		return this.ticketDao.selectByPrimaryKey(id);
	}

	// 删除门票信息
	@Override
	public Integer savedelete(Integer id) {
		// TODO Auto-generated method stub
		return this.ticketDao.deleteByPrimaryKey(id);
	}

	// 门票修改进行中
	@Override
	public Integer saveupdate(Ticket tickets) {
		// TODO Auto-generated method stub
		tickets.setTotalcount(1000);
		tickets.setOrdercount(0);
		Integer num = this.ticketDao.updateByPrimaryKeySelective(tickets);
		return num;
	}

	/**
	 * 用户分页
	 * 
	 * @param userDto
	 * @return
	 */
	@Override
	public PageInfo<User> findPages(UserDto userDto) {
		// 1.设置当前页和每页显示的条数
		PageHelper.startPage(userDto.getPage(), userDto.getPageSize());
		// 2.执行查询
		Example example = new Example(User.class);
		Criteria criteria = example.createCriteria();
		if (userDto.getName() != null && !"".equals(userDto.getName())) {
			criteria.andLike("name", "%" + userDto.getName() + "%");
		}
		if (userDto.getSex() != null) {
			criteria.andEqualTo("sex", userDto.getSex());
		}
		List list = this.userDao.selectByExample(example);
		// 3. 实例化PageInfo对象
		PageInfo pageInfo = new PageInfo(list);
		return pageInfo;

	}

	//Users添加
	@Override
	public boolean save(Users user) { 
		return this.usersDao.insert(user)>0?true:false;
	}

	//查询用户Users
	@Override
	public List<Users> UsersSearch() {
		// TODO Auto-generated method stub
		return this.usersDao.selectAll();
	}

}
